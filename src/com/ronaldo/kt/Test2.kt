package com.ronaldo.kt

/**
 * 习惯用法
 * Created by ronaldo on 2017/5/25.
 */

data class Customer(val name: String, val email: String)

fun foo(a: Int = 0, b: String = "") {

}

fun main(args: Array<String>) {
    val map = mapOf<String, Int>("a" to 1, "b" to 2, "c" to 3)
    println(map["b"])
    map.forEach { t, u -> println("$t == $u") }
}
