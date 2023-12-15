import 'dart:io';

void main() async {
  List<String> inputValues = [];

  // Function to read input and add to the list
  Future<void> readAndAddToInputList() async {
    print("Enter a value:");
    String input = stdin.readLineSync() ?? "";
    inputValues.add(input);
  }

  await readAndAddToInputList();
  await readAndAddToInputList();

  await Future.delayed(Duration(seconds: 3));

  int sum = inputValues.map((str) => int.parse(str)).reduce((a, b) => a + b);

  print("Sum of the two values after 3 seconds: $sum");
}
