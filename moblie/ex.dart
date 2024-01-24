import 'dart:async';

void main() async {
  print("เริ่ม");

  int count = 1;

  await runTimer(count);

  print("จบ");
}

Future<void> runTimer(int count) async {
  await for (var num in Stream.periodic(Duration(seconds: 2), (int num) {
    print(count);
    count++;
  }).take(10)) {}
}
