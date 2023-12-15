import 'dart:io';

Future<List<int>> getNumbersFromUser() async {
  print("Enter 10 numbers separated by commas:");
  String input = stdin.readLineSync() ?? "";

  List<int> numbers =
      input.split(',').map((str) => int.parse(str.trim())).toList();

  if (numbers.length != 10) {
    print("Please enter exactly 10 numbers separated by commas.");
    return [];
  }

  return numbers;
}

void main() async {
  List<int> numbers = await getNumbersFromUser();

  print("Numbers received: {${numbers.join(', ')}}");

  // Multiply each number by 2 asynchronously
  for (int i = 0; i < numbers.length; i++) {
    await multiplyByTwoAsync(i + 1, numbers[i]);
  }
}

Future<void> multiplyByTwoAsync(int order, int number) async {
  await Future.delayed(Duration(seconds: 2));
  int result = number * 2;
  print(
      "Result after multiplying ${order}th number, which is $number, by 2: $result");
}
