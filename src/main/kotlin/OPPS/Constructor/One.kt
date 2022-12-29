package OPPS.Constructor

class One {
    var name: String = "";
    var age: Int = 0;
}

fun main() {
    var one = One();
    one.name = "chetan";
    one.age = 23;
    println(one.name  + " " + one.age)
}