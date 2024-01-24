void main() {
  //!สร้างฟังก์ชั้น

  //Return type
  //Function name
  //Parameters
  //function body

  //void = returnType ฟังก์ชั้น
  //!void จะไม่ return อะไรเลย
  void calculate(number, number2, name, boole) {
    //*สั่งให้ในฟังก์ชั้นทำอะไรได้บ้าง
    print('${number + number2} $name  $boole');
  }

  //*เรียกใช้ ฟังก์ชั้น
  calculate(5, 10, "neytiphorm", true);

  int culcu(num, num2) {
    int x = num * num2;
    return x;
  }

  int result = culcu(2, 8);
  print(result);
}
