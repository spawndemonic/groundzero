package com.bignerdranch.nyethack
fun main(){
    print("Enter a beverage: ")
    var beverage = readLine()?.let {
        if (it.isNotBlank()) {
            it.capitalize()
        } else {
            "Buttered Ale"
        }
    }
        print("How old are you?")
        var canDrink = readLine()?.let {
            if (it.toInt() < 21) {
                println("Your too young to drink here")
                false
            } else {
                true
            }
        }


        println(beverage)
        print(canDrink)



}
