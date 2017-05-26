package com.ronaldo.kt

/**
 * 控制流
 * Created by haoxi on 2017/5/26.
 */

fun main(args: Array<String>) {
    val a = 5
    val b = 6
    val m = if (b > a) b else a

    val s = if (b > a) {
        println(b)
        b
    } else {
        println(a)
        a
    }

    val x: Int = 1;
    when (x) {
        1 -> println("x:1")
        2 -> print("x == 2")
        else -> print("x == 3")
    }

    val array = arrayListOf("apple", "banana", "kiwi")
    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }
}
