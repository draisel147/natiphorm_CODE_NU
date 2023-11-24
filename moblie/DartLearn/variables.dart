void main() {
  //! var ใส่ค่าตัวแปรอะไรก็ได้แต่ไม่ชัดเจน ให้ดีต้องใส่ลักษณะตัวแปรเลยเพื่อให้ไม่สับสน
  var text = 'neytiphorm';
  print(text);
  // ถ้ามีชื่อตัวแปรนั้นอยู่แล้วสามารถเปลี่ยนค่าโดยไม่ต้องใส่ var นำหน้า
  text = 'ney';
  print(text);
  print(text);

  //! dynamic สามารถรับ dataType ที่ต่างกันได้
  dynamic test = "hello";
  print(test);
  test = 99;
  print(test);

  String name = "hoya";
  print(name);
  name = "mon";
  //name = 89; //Error เพราะ ไม่ใช้ String
  print(name);
}
