void main() {
  // จะใช้เป็น "" หรือ '' ก็ได้
  var fname = 'natiphorm';
  String lname = "sonta";

  print(fname);
  print(lname);

  //! การนำตัวแปรที่เป็นตัวเลขมาทำงานกับตัวแปรที่เป็น String

  var name = "joyboy";
  var age = 20;
  var number = 100;
  //* ไม่สามรถใช้ + ได้เพราะ name เป็น String แต่ age เป็น int (เป็นคนละ type)
  //* print(name+age);
  print('ชื่อ $name age ${age + number}');
  // หรือ ต้องแปลง age ให้เป็น String ก่อน
  print('ชื่อ ' +
      name +
      ' Age ' +
      (age + number).toString()); //ถ้าใช้ + ให้เป็นวงเล็บธรรมดาพอ
}
