package project.users.kotlinpractice.PiramidPattern

import java.util.*

fun main() {
    var sc = Scanner(System.`in`)
    var type: String? = sc.nextLine()
    var row: Int? = sc.nextInt()
    for (i in 1..row!!){
        for (j in 1..row-i){
            print(type)
        }
        println()
    }
}

