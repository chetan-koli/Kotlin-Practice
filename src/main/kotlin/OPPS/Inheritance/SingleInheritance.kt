package OPPS.Inheritance

open class SingleInheritance {
    var name: String = "chetan koli";
}

class printName : SingleInheritance(){
    fun prints(){
        println(name)
    }
}

fun main() {
    var a = printName()
    print(a.prints())
}