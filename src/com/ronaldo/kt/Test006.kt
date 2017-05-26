package com.ronaldo.kt

/**
 * Created by haoxi on 2017/5/26.
 */

class Person constructor(val personName: String)

class Customer1(customerName: String) {
    init {
        println("init customer")
    }
}

class Customer2(val customerName: String = "")

/**
 * open 标注与 Java 中 final 相反,它允许其他类 从这个类继承
 * 默认情况下，在 Kotlin 中所有的类都是 final
 */
open class Base(p: Int)

class Child(p: Int) : Base(p)

/**
 * 开放可继承的类
 */
open class Base1 {
    //开放可继承的方法
    open fun v() {}

    //不开发的方法
    fun nv() {}
}

class Child1 : Base1() {
    //显式覆盖
    override fun v() {
        super.v()
    }
}

open class AnotherDerived : Base1() {
    //加上final，该方法不能再次覆盖
    final override fun v() {}
}


open class Base2(x: Int, y: Int) {
    //演示基类val x的get方法
    open val x: Int get() {
        return x
    }
    //演示基类var y的get方法
    open val y: Int get() {
        return y
    }
}

class Bar(x: Int, y: Int) : Base2(x, y) {
    override val x: Int
        get() = super.x
    //可以用var 覆盖 val，反之则不行。var是可变
    //因为一个 val 属性本质上声明了一个 getter 方法，而将其覆盖为 var 只是在子类中额外声明一个 setter 方法。
    //修饰为final 表示不能再覆盖
    override final var y: Int = 0
}

/**
 *抽象类继承普通类
 *方法可以设置为抽象
 */
abstract class Bar2(x: Int) : Base1() {
    override abstract fun v()
}


fun main(args: Array<String>) {
    val person = Person("Joe Smith")
    println(person.personName)

    val base2 = Base2(5, 6)
    base2.x

    val base3 = Bar(5, 6)
}
