void main() {
  // เงื่อนไขการใช้งาน Loop
  //TODO :(ชนิดตัวแปร ค่าตั้งต้น(จุดเริ่ม) ; จุดสิ้นสุด Loop ; การทำงานเช่นบวกเพิ่มรึลดลง)

  print("****************************");
  print("For Loop");
  print("");
  //!For Loop วนไปเรื่อยๆจนถึงจุดที่เรากำหนด
  for (int i = 1; i <= 5; i++) {
    print("Hello $i");
  }
  // ****************************
  print("****************************");
  print("whlie Loop");
  print("");

  //!while Loop จะเขียนตัวเริ่มไว้ข้างนอกก่อนเริ่ม Loop
  int x = 1;
  int number = 5;
  int total; //null
  while (x <= 3) {
    //*วน x เรื่อยๆและทำตามเงื่อนไข

    total = number * x;
    print(total);
    //* และเพิ่มการกระทำไว้ด้านล่างสุดเสมอ
    x++;
  }
  // ****************************
  print("****************************");
  print("Do while Loop");
  print("");

  //! Do whlie Loop (ใช้น้อยที่สุด)
  int y = 1; //จุดเริ่มต้น
  do {
    print("object");
    y++; //คำสั่งที่ต้องการให้ทำ
  } while (y < 5); //จุดสิ้นสุดของ Loop

  // ****************************
  print("****************************");
  print("For in Loop");
  print("");

  //! For in Loop (ใช้มากที่สุด) ใช้สำหรับการ Loop ที่อยู่ใน List
  //! ต่างจาก For Loop คือ
  List<String> name = ['ney', 'jo', 'Doramonn'];

  for (var nameNew in name) {
    print(nameNew);
  }
}
