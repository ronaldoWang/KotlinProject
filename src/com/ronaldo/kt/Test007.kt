package com.ronaldo.kt

/**
 * 属性和变量
 * Created by haoxi on 2017/5/26.
 */

class Address {
    var name: String = ""
    var street: String = ""
    var city: String = ""
    var state: String? = ""
//    var zip: String
//        get() = this.toString()
//        set (value) this.street = value
}

fun copyAddress(address: Address): Address {
    val result = Address() // Kotlin 中没有“new”关键字
    result.name = address.name // 将调用访问器
    result.street = address.street
    return result
}

fun main(args: Array<String>) {

}
