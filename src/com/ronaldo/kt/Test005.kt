package com.ronaldo.kt

/**返回和跳转
 * Created by haoxi on 2017/5/26.
 */

fun foo() {
    val ints = arrayListOf<Int>(0, 1, 2, 3, 4, 5)
    ints.forEach(fun(value: Int) {
        if (value == 0) return
        print(value)
    })
}

fun main(args: Array<String>) {
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (i * 5 == j * 5) {
                println("i=${i * 10},j=${j * 10}")
                break@loop
            }
        }
    }
}