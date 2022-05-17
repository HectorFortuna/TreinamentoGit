package com.example.exemplopoo

interface Acao{
    fun andar()
}
open class Person(var firstName:String, var secondName: String): Acao{
    var idade = Int
    init {
        println(this.firstName)

    }
    override fun andar() {
        println()
    }
}

open class Student(name:String, secondName: String) : Person(name, secondName){
    var sobrenome = ""
    init {
        this.firstName = name
        println("O nome do aluno é ${this.firstName}")
    }
}











