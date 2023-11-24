void main() {
  //!Fixlenght ฟิกขนาดไม่ให้มีการขยายเพิ่มอีกแล้ว
  // สร้างตัวลิส 0 ขึ้นมา 5 ตัว (จำนวน,ตัวที่ต้องการจะเพิ่ม)
  final Fixednum = List<int>.filled(5, 0);
  print(Fixednum); //[0,0,0,0,0]

  // เพิ่มตัวเลข 1 ตรงจุดที่ 0 (INDEX)
  Fixednum[0] = 1; //[1,0,0,0,0]
  print(Fixednum);

  // เพิ่มตั้งแต่ตำแหน่งที่ 1 สามารถเขียนเป็นวงเล็บได้ และไม่สามารถเขียนเกินจำนวนลิสได้เช่นกำหนดให้ลิสมี 5 ไม่สามารถเพิ่มเกินไปมากกว่านี้ได้
  Fixednum.setAll(1, [1, 2, 4, 5]); //[1,1,2,4,5]
  print(Fixednum);

  //!GrowabList เพิ่มขนาดได้เรื่อยๆโตขึ้นได้เรื่อยๆ
  final growablenum = <String>['A', 'B']; //[A,B]
  // เปลี่ยนตำแหน่งที่ 0 เป็น G (ไม่สามารถเปลี่ยนเกินจำนวนของขนาดดั้งเดิมได้)
  growablenum[0] = 'G';
  print(growablenum); //[G,B]
  // แต่ถ้าใช่ add สามารถเพิ่มได้ตลอด
  growablenum.add('X');
  print(growablenum); //[G,B,X]
  //เพิ่มแบบ หลายๆตัวพร้อมกันได้
  growablenum.addAll({'C', 'H', 'V'});
  print(growablenum); //[G,B,X,C,H,V]
}
