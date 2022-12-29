package project.users.kotlinpractice

fun main() {
    var arr = arrayOf("chetan","sagar","best");
    val data = if ("sagar" in arr){
        "exist"
    }else {
        "not exist"
    }
    print(data)

    for (x in arr){
        println(x)
    }
}