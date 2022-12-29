package project.users.kotlinpractice

fun main() {
    var user = User("chetan koli",23);
    println(user.name)
    var stud = Student("Sagar Koli",70,44)
    println(stud.rollno)
}

class User(var name: String, var age: Int)
class Student(varname: String,var  rollno: Int, var marks: Int)