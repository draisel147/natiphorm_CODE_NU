void main() {
  Bicycle myBike = Bicycle(wheelSize: 20, brand: 'crokodile', speed: 0);
  print(myBike);
  myBike.speedUp(5);
  print(myBike);
  myBike.brakeDown(2);
  print(myBike);

  Bicycle mybike2 = Bicycle(wheelSize: 20, brand: 'crokodile', speed: 50);
  mybike2 = myBike;
  print(mybike2.speed);
}

class Bicycle {
  final int wheelSize;
  final String brand;
  int speed;

  Bicycle({required this.wheelSize, required this.brand, this.speed = 0});

  String toString() {
    return '$brand has Wheel size $wheelSize  is ridding at $speed km/h';
  }

  void speedUp(int speedUp) {
    speed += speedUp;
  }

  void brakeDown(int brakeDown) {
    speed -= brakeDown;
  }
}
