void main() {
  // int cul(
  //     {required int price, required int quantity, required String message}) {
  //   print(price * quantity);
  //   return price * quantity;
  // }

  // int result = cul(price: 5, quantity: 2, message: "Hello");

  //!เขียนฟังก์ชั่นแบบย่อ
  //!มีค่าเท่ากับตัวนี้ int cul({required int price,required int quantity,required String message}) {
  //* แต่ข้อเสียคือจะทำได้แค่บรรทัดเดียวเท่านั้น
  //กรณีต้องการส่งค่าเป็น return ไม่ต้องพิม return แต่ให้สร้างตัวแปรขึ้นมารับแทน
  int cul(int number, int number2) => number * number2;
  int total = cul(2, 5);
  print(total);
}
