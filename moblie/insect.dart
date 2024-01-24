void main() {
  Insect ant1 = Insect.getClass("Male", 1, "Ant", caste: "Male");
  Insect bee2 = Insect.getClass("Female", 10, "Bee", caste: "Worker");
  Insect mosquito3 = Insect.getClass("Female", 10, "Mosquito");
  print(ant1.toString());
  print(bee2.toString());
  print(mosquito3.toString());
}

class Insect {
  String _sex;
  String _state = "";
  int _ageDay;

  Insect(this._sex, this._ageDay, {String? state}) {
    _state = state ?? "";
  }

  factory Insect.getClass(String sex, int ageDay, String type,
      {String caste = ""}) {
    return Insect(sex, ageDay, state: type);
  }

  String toString() {
    return 'Insect type: $_state, Age: $_ageDay day old, Sex: $_sex, Caste: $_state.';
  }

  String get sex {
    return _sex;
  }

  int get ageDay {
    return _ageDay;
  }
}

class Ant extends Insect {
  String _caste = "";

  Ant(String sex, int ageDay, String caste, String state)
      : super(sex, ageDay, state: state) {
    _caste = caste;
  }

  String toString() {
    return 'I $_sex, age: $_ageDay, caste: $_caste';
  }

  String get caste {
    return _caste;
  }

  String? get state {
    return super._state;
  }

  factory Ant.getClass(String sex, int ageDay, String caste, String state) {
    return Ant(sex, ageDay, caste, state);
  }
}

class Bee extends Insect {
  String _caste = "";

  Bee(String sex, int ageDay, String caste) : super(sex, ageDay) {
    _caste = caste;
  }

  String toString() {
    return 'I $_sex, age: $_ageDay, caste: $_caste';
  }

  String get caste {
    return _caste;
  }

  String? get state {
    return super._state;
  }

  factory Bee.getClass(String sex, int ageDay, String caste) {
    return Bee(sex, ageDay, caste);
  }
}

class Mosquito extends Insect {
  Mosquito(String sex, int ageDay, String state)
      : super(sex, ageDay, state: state);

  String toString() {
    return '$_ageDay';
  }

  String? get state {
    if (_sex == "Female") {
      Map<int, String> stateMap = {
        4: "ไข่",
        if (ageDay >= 5 && ageDay <= 8) 5: "หนอน",
        9: "ดักแด้",
        if (ageDay > 10) 11: "โตเต็มไว",
      };
      return stateMap[_ageDay];
    } else if (_sex == "Male") {
      Map<int, String> stateMap = {
        4: "ไข่",
        if (ageDay >= 5 && ageDay <= 8) 5: "หนอน",
        9: "ดักแด้",
        if (ageDay > 10) 11: "โตเต็มไว",
      };
      return stateMap[_ageDay];
    }
    return null;
  }

  factory Mosquito.getClass(String sex, int ageDay, String state) {
    return Mosquito(sex, ageDay, state);
  }
}
