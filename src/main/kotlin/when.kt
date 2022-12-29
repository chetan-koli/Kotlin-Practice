package project.users.kotlinpractice

fun main() {
    var a = 2;
    var value = when(a){
        1 -> "chetan"
        2 -> "sagar"
        3 -> "koli"
        4 -> "love"
        else -> "invalid number"
    }

    print(value)
}