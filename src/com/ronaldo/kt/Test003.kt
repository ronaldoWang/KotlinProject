package com.ronaldo.kt

/**
 * 基本类型
 * Created by haoxi on 2017/5/26.
 */
fun main(args: Array<String>) {
    val oneMillion = 1_000_000
    println(oneMillion)

    val a: Int = 10000
    println(a === a) // 输出“true”
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA == anotherBoxedA) // ！！！输出“false”！！！
    println(boxedA === anotherBoxedA) // ！！！输出“false”！！！


    val text1 = """for (c in "foo")print(c)"""
    
    val text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
    println(text)
}
