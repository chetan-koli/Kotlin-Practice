package project.users.kotlinpractice

fun main() {
    println(addition(10,20))
    println(data(787.0))
}

fun addition(a: Int, b: Int): Int {
    return a + b;
}

fun data(name: Any) : String{
    return name.toString();
}