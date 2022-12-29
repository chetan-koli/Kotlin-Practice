package project.users.kotlinpractice

fun main() {
    var obj = child()
    obj.data()
}

open class Chetan(){
    var x = 9;
}

class child : Chetan(){
    fun data(){
        print(x);
    }
}