void main() {
  //TODO: ตัวแปรที่ประกาศไว้แต่ไม่ได้กำหนดค่าจะมีค่าเป็น null

//========================================================
  //! ชนิดข้อมูลต่างๆ
  //* bool เก็บข้อมูลเป็น Ture และ False
  bool a = true;

  //* num เก็บข้อมูลชนิดตัวเลข เก็บเป็น int หรือ double ก็ได้แล้วแต่ค่าที่เราจะตั้ง
  num b = 10;
  num c = 1.2;

  //* String เก็บข้อมูลชนิดของข้อความ
  String name = "natiphorm";

  //*List คือการเก็บข้อมูลไว้หลายๆตัวและ ในส่วนของวงเล็บสามารถใส่ tpye ไปได้ว่าจะเก็บตัวแปรชนิดอะไรบ้าง
  List<String> fruits = ["Apple", "Orange", "Banana"];
  List<int> numbersint = [1, 2, 3, 4, 5];
  List<double> numbersdouble = [1.2, 2.3, 3.4, 4.5, 5.6];

  //* map คือการเก็บข้อมูลไว้ด้านในและจะมี key และ value เพื่อสามารถเรียกใช้ตัวไหนก็ได้
  Map<String, String> yournamemap = {
    "firstName": "natiphorm",
    "lastname": "sonta",
    "age": "20",
  };
  // print(yournamemap['firstName']); //การ print ออกมาดู
  yournamemap['firstName'] = 'ney'; //สามารถเปลี่ยนได้
  // print(yournamemap['firstName']);
  yournamemap['age'] = "50";
  // print(yournamemap['age']);

  Map<String, int> studaentpoint = {
    "Ney": 80,
    "Boy": 69,
    "Cat": 78,
    "Dog": 90,
    "Fog": 49,
  };

  print(studaentpoint['Ney']);
  print(studaentpoint['Cat']);
  studaentpoint['Ney'] = 100;
  print(studaentpoint['Ney']);

  final aListofStrings = <String>{};
}
