package project.users.kotlinpractice

import java.util.*

fun main(){
    var name: String = "chetan";
    var emp: String = "software";
    println(name.length)
    print("animal is : ")
    print(name[0])
    print(name[4])
    println(name[3])
    println(name.uppercase())
    println(name[0].compareTo(name[0]))
    println(name.indexOf("t"))
    println(name.plus(emp))
    println("my name is $name \n i am working is $emp developer")
}