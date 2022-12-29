package project.users.kotlinpractice

fun main() {
    var i = 0;
    /*while (i <10){
        println(i)
        i++
        if (i == 5){
            break
        }
    }*/

    while (i < 10){
        if (i == 4){
            i++
            continue
        }
        println(i)
        i++
    }
}