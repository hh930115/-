package com.huanghuan.kotlintest

/**
 * 创建日期：2018/6/9 on 11:28
 * 描述:
 * 作者:黄欢
 */
open class User constructor(name: String){
    var name: String =""
    var age = ""
    constructor(name: String , age: String): this(name){

    }
    open fun sun(): Int{
        var a: Int
        return 0;
    }


}