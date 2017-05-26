package com.ronaldo.kt

import java.io.File

/**
 * 习惯用法
 * Created by ronaldo on 2017/5/25.
 */

data class Customer(val name: String, val email: String)

/**
 * 单粒
 */
object Resource {
    val name = "ronaldo"
}

/**
 * 默认值方法
 */
fun foo(a: Int = 0, b: String = "") {

}

/**
 * If not null 缩写
 */
fun ifNotNull(): Int? {
    val files = File("Test1").listFiles()
    return files?.size
}

/**
 * If not null and else 缩写
 */
fun ifnotNullElse(): Int {
    val files = File("Test1").listFiles()
    return files?.size ?: 0
}

/**
 * try catch
 */
fun tryCatch() {
    val result = try {
        println("do something")
    } catch (e: IllegalArgumentException) {
        throw  IllegalArgumentException(e)
    }
}

/**
 * if
 */
fun ifFun(param: Int) {
    val ifn = if (param == 1) {

    } else if (param == 2) {

    } else {

    }
}

fun main(args: Array<String>) {
    val map = mapOf<String, Int>("a" to 1, "b" to 2, "c" to 3)
    println(map["b"])

    map.forEach { t, u -> println("$t == $u");println("$t == $u") }

    for ((k, v) in map) {
        println("$k == $v")
        println("$k : $v")
    }
    println(Resource.name)

    //if null 执行语句
    val mapa = map["a"] ?: println("a is missing!")

    //if not null 执行语句
    val mapb = map["b"]?.let { println("b is not missing!") }

}

