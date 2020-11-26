package com.bignerdranch.nyethack

const val TAVERN_NAME = "Taernyl's Folly"
fun main(){
    placeOrder("shandy, Dragon'sBreath,5.91")
    print("Enter a beverage: ")
    var beverage = readLine()?.let {
        if (it.isNotBlank()) {
            it.capitalize()
        } else {
            "Buttered Ale"
        }
    }
    val omSymbol = '\u0950'
    var beverageServed = beverage ?: "Buttered Ale"
    beverage?.let {
        beverage=it.capitalize()
    }?: println("Can't be null")
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
    println(canDrink)
    println(omSymbol)

}
private fun toDragonSpeak (phrase: String) =
        phrase.toLowerCase().replace(Regex("[aeiou]")){
            when(it.value){
                "a"->"4"
                "e"->"3"
                "i"->"1"
                "o"->"0"
                "u"->"|_|"
                else-> it.value
            }
        }
private fun placeOrder(menuData: String){
    val phrase = "Ah, delicious Bob!"
    println("Madrigal exclaims: ${toDragonSpeak(phrase)}")
}