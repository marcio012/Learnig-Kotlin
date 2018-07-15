package Kotlin

import Java.CarManufacture

fun main(args: Array<String>) {
    println("Hello World ")

    // estamos instanciando uma classe em java
    // que estar no package java
    val student = Student("Márcio Heleno")
    println("Nome Student: ${student.name}")

    // instancinado outra class em java
    // do package Kotlin
    val carManufacture = CarManufacture("Mercedes")
    println("Fabricante de automóveis: ${carManufacture.name}")
}