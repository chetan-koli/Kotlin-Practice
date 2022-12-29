package String

fun main() {
    println(romanToDesimal("XI"))
}

fun input(r: Char) : Int {
    if (r == 'I') return 1;
    if (r == 'V') return 5;
    if (r == 'X') return 10;
    if (r == 'L') return 50;
    if (r == 'C') return 100;
    if (r == 'D') return 500;
    if (r == 'M') return 1000;
    return -1;
}

fun romanToDesimal(str: String) : Int{
    var res = 0;
    var i = 0
    while (i < str.length) {
        val s1 = input(str[i])
        if (i + 1 < str.length) {
            val s2 = input(str[i + 1])
            if (s1 >= s2) {
                res = res + s1
            } else {
                res = res + s2 - s1
                i++
            }
        } else {
            res = res + s1
        }
        i++
    }
    return res
}