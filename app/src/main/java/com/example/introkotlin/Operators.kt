package com.example.introkotlin

fun main() {

    // Arithmetic Operators
    var x: Float = 6f
    var y: Float = 7f

    println(x + y)
    println(x - y)
    println(x * y)
    println(x / y)
    println(x % y)

    // Increment Operator
    x++

    // Decrement Operator
    x--

    println("X value: $x")

    // Assignment Operators
    var w = 10
    w += 5 // w = w + 5
    println(w)

    // Comparison Operators
    var q = 19
    var z = 12
    println(q == z)
    println(q != z)
    println(q > z)
    println(q < z)
    println(q >= z)
    println(q <= z)

    // Logical Operators
    // print(q > 10 && q < 100)
    print(q > 10 || q < 15)

}