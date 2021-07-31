package com.wildan.tes

import java.lang.Exception


fun main(){
    print("""
        Select Questions : 
    """.trimIndent())
    val input = readLine()
    println("")

    when (input) {
        // nomor 1
        "1" -> HelloWorld()
        // nomor 2
        "2" -> Email()
        "3" -> ConvertTime()
        "4" -> ReverseWord()
        "5" -> CheckRev()
    }

}

fun ConvertTime() {
    print("Insert Time( HH:MM:SS [AM/PM] ) : ")
    val input = readLine()
    var loop = 0
    var newTime = ""
    if (input != null) {
        while (loop <= 4) {
            newTime += input[loop].toString()
            loop++
        }
        if (input.contains("PM",true)) {
            val firstDigit = newTime[0] - '0'
            val secondDigit = newTime[1] - '0'
            val newVal = arrayListOf(firstDigit *2, secondDigit*2, newTime[2], newTime[3], newTime[4])
            print("The converted time is ")
            newVal.forEach { print(it) }
        }
        else if (input.contains("AM")){
            print("The converted time is ")
            newTime.forEach { print(it) }
        }

    }
}

fun CheckRev() {
    print("insert Words : ")
    val input = readLine()
    if (input != null) {
        val rev = input.reversed()
        if (input.equals(rev)) print("Palindrom")
        else print("Bukan palindrom")
    }
}

fun ReverseWord() {
    print("input words : ")
    val input = readLine()
    if (input != null) {
        println(input.reversed())
    }
}

fun Email() {
    print("input email : ")
    val input = readLine()
    if (input != null) {
        if (input.length > 20) {
            print("melebihi batas character")
        }
        else if (!input.contains("@")) {
            print("email harus ada '@'")
        }
        else if (!input.contains(".")) {
            print("email harus pakai titik setelah @")
        }
        else if (!input.contains(".co.id",true) || !input.contains(".id",true)) {
            println("Hanya bisa pake domain id atau co.id")
        }
        else {
            println("email yang diinputkan : $input")
        }

    }
}

fun HelloWorld() {
    print("input number : ")
    val input = readLine()
    try {
        val res = input?.toInt()
        if (res != null) {
            if (res.rem(5) ==0 && res.rem(3) == 0) {
                println("Hello World")
            }
            else if (res.rem(3) == 0) {
                println("Hello")
            }
            else if (res.rem(5) == 0) {
                println("World")
            }
        }

    }
    catch (e : Exception) {
        print("Not Number!")
    }
}