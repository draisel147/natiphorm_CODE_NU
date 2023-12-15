import 'dart:async';

void main() {
  print("เริ่ม");

  int count = 1;

  Timer.periodic(Duration(seconds: 2), (Timer t) {
    if (count <= 10) {
      print(count);
      count++;
    } else {
      t.cancel();
      print("จบ");
    }
  });
}
