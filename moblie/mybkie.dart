void main() {
  Bicycle myBike = Bicycle(20, 'crokodile', 50);
  print(myBike);
  myBike.speedUp(5);
  print(myBike);
  myBike.brakeDown(2);
  print(myBike);

  Bicycle mybike2 = Bicycle(20, 'crokodile', 50);
  mybike2 = myBike;
  print(mybike2._speed);
}

class Vehicle {
  int _Wheelnum;

  Vehicle(this._Wheelnum) {
    print(_Wheelnum);
  }
}

class Bicycle extends Vehicle {
  int _wheelSize;
  String _brand;
  int _speed;

  Bicycle(this._wheelSize, this._brand, super._Wheelnum, [this._speed = 0]) {
    print(_Wheelnum);
  }

  String toString() {
    return '$_brand has $_Wheelnum Wheel wiht size $_wheelSize is riding at $_speed km/h';
  }

  int get wheelSize => _wheelSize;
  void set wheelSize(int Size) {
    _wheelSize = Size;
  }

  void speedUp(int speed) {
    _speed = _speed + speed;
  }

  void brakeDown(int speed) {
    _speed = _speed - speed;
  }
}
