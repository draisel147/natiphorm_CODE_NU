void main() {
  //! ถ้าเป็น Datatype ต้องกำหนดให้มัน รีเทิร์น ด้วยไม่งั้นจะ Error
  //* ถ้าเป็น Paramiter ต้องใส่ปีกกากำกับด้วย
  //! ใส่ required เพื่อไม่ให้มันส่งค่ากลับเป็น null
  int cul(
      {required int price, required int quantity, required String message}) {
    print(price * quantity);
    return price * quantity;
  }

  //!การใช้ทำงานจริงจะกำหนดเป็นแบบนี้เพราะว่าเรียกใช้ได้ง่าย
  //! การตั้งชื่อให้กับ ชื่อ Paramiter : ค่าของ Paramiter ที่จะส่งไปใช้ในฟังก์ชัน
  int result = cul(price: 5, quantity: 2, message: "Hello");

  //TODO : Arrow Function
  //!เขียนฟังก์ชั่นแบบย่อ
  //!มีค่าเท่ากับตัวนี้ int cul({required int price,required int quantity,required String message}) {
  //* แต่ข้อเสียคือจะทำได้แค่บรรทัดเดียวเท่านั้น
  //กรณีต้องการส่งค่าเป็น return ไม่ต้องพิม return แต่ให้สร้างตัวแปรขึ้นมารับแทน
  // int cul(int number, int number2) => number * number2;
  // int total = cul(2, 5);
  // print(total);
}
