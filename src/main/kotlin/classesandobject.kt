package project.users.kotlinpractice

fun main() {
    var c = Cat();
    println(c.eating)
    print(c.meoing)
}

class Cat{
    var eating = "Cat is eating"
    var meoing = "cat is meoing"
}