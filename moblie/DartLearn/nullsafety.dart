String firstChar(String? str) {
  if (str == null) return '_';

  return str.substring(0, 1).toUpperCase();
}
//! sunstring จะเอามาแค่บางตัว 0-1 คือตัวแรก 0-2 คือตัวแรกสองตัวแรก

String shortName(String name, String? sname) {
  return firstChar(name) + firstChar(sname);
}

void main() {
  var name = 'dart';
  // var sname = 'ney';
  var sname = null;

  print(shortName(name, sname ?? '_'));

  print(shortName('aaa', 'b'));
}
