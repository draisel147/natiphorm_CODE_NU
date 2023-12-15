import 'dart:async';

// void main() async {
//   print("Start");
//   print(await getData());
//   print("end");
// }

// Future<String> getData() async {

//   String data = await middleFuction();

//   print('hello');
//   return data;
// }

// Future<String> middleFuction() {
//   return Future.delayed(Duration(seconds: 3), () => 'world');
// }

void main() {
  var controller = StreamController();
  controller.stream.listen((event) {
    print(event);
  });
  controller.add('Hello');
  controller.add(42);
  controller.addError('Error!');
  controller.close();
}
