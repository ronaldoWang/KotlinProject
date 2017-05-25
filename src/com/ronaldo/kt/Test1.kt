@file:Suppress("UNREACHABLE_CODE")

package com.ronaldo.kt

/**
 * 基础语法
 * Created by ronal on 2017/5/25.
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum1(a: Int, b: Int) = a + b

fun maxOf(a: Int, b: Int): Int {
    if (a > b) return a
    else return b
}

fun maxOf1(a: Int, b: Int) = if (a > b) a else b

/**
 * 转换，可以为空
 */
fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

/**
 * 检查字符串长度，传入的any可以自动转换类型
 */
fun getStringLength(str: Any): Int? {
    if (str is String) {
        return str.length
    }
    return null
}

fun describe(obj: Any): String {
    return when (obj) {
        is String -> "$obj is String"
        is Int -> "$obj is int"
        1 -> "one"
        else -> "other"
    }
}


fun main(args: Array<String>) {
    val a = 1
    val b = 2
    println(sum1(a, b))

    val s1 = "count is $a";
    println(s1);

    println(maxOf(a, b))

    println(getStringLength("str"))

    val items = listOf("apple", "banana", "kiwi")
    items.forEach(::println)
    for (item in items) {
        println(item)
    }
    for (index in items.indices) {
        println("$index=${items[index]}")
    }

    var index = 1
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }

    println(describe("123"));
    println(describe(123));

    val fruits = listOf("banana", "Avocado", "apple", "kiwi")
    fruits.filter { it.startsWith("a") }.sortedBy { it }.map { it.toLowerCase() }.forEach { println(it) }
}