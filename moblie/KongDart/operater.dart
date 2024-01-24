void main() {
  var x = 100, y = 50;
  var z = x * y;
  // print(z);

  //! การหาร (ไม่สามารถหารแบบเป็น int ได้ ต้องเก็บเป็นแบบ double เท่านั้นหรือเปลี่ยนชนิดตัวแปรเป็นแบบ dynamic)
  var a = 100, b = 50;
  double total = a / b;
  print(total);

  //TODO: fact ถ้าต้องการผลให้ออกมาเป็นชนิด int มีวิธีดังนี้
  //TODO: ถ้าต้องการกด เครื่องหมายตัวหนอน alt + 0126(numpad) หรือ shift + ~ ค้างไว้ 1 วินาที
  int number1 = 100, number2 = 50;
  int total1 = number1 ~/ number2;
  // int total2 = number1 / number2 as int;//! Error ปัจจุบันใช้งานไม่ได้แล้ว เพราะ double เป็นหน่วยที่ใหญ่กว่าแล้ว
  int total3 = (number1 / number2).toInt();
  print('แบบ ~ = $total1');
  // print(total2);
  print('แบบ .toInt = $total3');

  //การหารเอาเศษ
  int divie() {
    int a = 5, x = 2;
    int z = a % x;
    return z;
  }

  print(divie()); //ผลลัพท์ 1
}
