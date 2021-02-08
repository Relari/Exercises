package com.renzo.exercises.model

data class PersonKt(var id: Int = 0, var name: String = "") {

    fun id(id: Int): PersonKt {
        this.id = id
        return this
    }

    fun name(name: String): PersonKt {
        this.name = name
        return this
    }

}

fun main() {

//    val person = Person(1, "Name")
//    println(person.toString())

}