package assignment1

import java.util.*

fun main() {

    val sc = Scanner(System.`in`)
    val N = sc.nextInt()

    for (i in 1..N) {
        var stack = Stack<Char>()
        val ps = sc.next()
        var result: Boolean = true
        for (p in ps) {
            if (p == '(') {
                stack.push(p)
            } else {
                if (stack.size() == 0) {
                    result = false
                    break
                }
                stack.pop()
            }
        }
        if (result == true && stack.size() == 0) {
            println("YES")
        } else {
            println("NO")
        }
    }

}