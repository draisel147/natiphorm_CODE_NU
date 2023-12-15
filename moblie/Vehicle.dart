void main() {
  Car myCar = Car('Toyota', 4);
  Truck myTruck = Truck('Ford', 6);
  Airplane myPlane = Airplane('Boeing', 18);

  print(myCar);
  //myCar.openDoors();

  print(myTruck);
  //myTruck.load();

  print(myPlane);
  //myPlane.boardPassengers();
}

class Vehicle {
  //ตัวต้นแบบ
  String _brand;
  int _wheelNum;
  int _speed;

  Vehicle(this._brand, this._wheelNum, [this._speed = 0]);

  void moveUp(int speed) {
    _speed = _speed + speed;
  }

  void moveDown(int speed) {
    _speed = _speed - speed;
  }

  String toString() {
    return '$_brand has $_wheelNum wheels moving at $_speed km/h.';
  }
}

class Car extends Vehicle {
  int _numDoors; // เพิ่ม attribute

  Car(String brand, int wheelNum, [int speed = 120, this._numDoors = 4])
      : super(brand, wheelNum, speed);

  void openDoors() {
    print('Opening $_numDoors doors');
  }

  String toString() {
    return super.toString() + ' It has $_numDoors doors.';
  }
}

class Truck extends Vehicle {
  double _capacity; // เพิ่ม attribute

  Truck(String brand, int wheelNum, [int speed = 150, this._capacity = 1000])
      : super(brand, wheelNum, speed);

  void load() {
    // Method
    _capacity = _capacity + 1000;
    print('Loading cargo with capacity $_capacity kg.');
  }

  String toString() {
    return super.toString() + ' It has a cargo capacity of $_capacity kg.';
  }
}

class Airplane extends Vehicle {
  int _passengerCapacity; // เพิ่ม attribute

  Airplane(String brand, int wheelNum,
      [int speed = 240, this._passengerCapacity = 150])
      : super(brand, wheelNum, speed);

  void boardPassengers() {
    //Method
    print('Boarding $_passengerCapacity passengers.');
  }

  String toString() {
    return super.toString() + ' It can carry $_passengerCapacity passengers.';
  }
}
