package com.bignerdranch.nyethack

fun main(){
    val player = Player("Frank")
    val playerStatus = player.getStatus();
    val auracolor = player.auraColor();
    printPlayerStatus(auracolor, player.isBlessed, player.name, playerStatus);
    println(playerStatus);
    player.castFireball();
    val printer = {
        val name = "bob"
        "Hello $name"
    }
    val greetingFun :(String,Int) ->String ={playername,numBuildings ->
        val currentYear = 2020
       println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playername (Copyright $currentYear)"
    }
    val greetingFun2 ={ playerName: String, numBuildings: Int ->
        val currentYear = 2020
        println("building $numBuildings houses")
        "Welcome $playerName (copybullshit $currentYear)"
    }
    var currentRoom = Room("foyer")
    println(currentRoom.description())
    println(printer())
    println(greetingFun2("Bob",3))
    println(player.hometown)
    println(player.name)
}

private fun printPlayerStatus(
    auracolor:String,
    isBlessed: Boolean,
    name: String,
    playerStatus: String
) {
    println("(Aura: $auracolor) " + "(Blessed: ${if (isBlessed) "YES" else "NO"})");
    println("$name $playerStatus");
}


fun anonFunmess(){
    val numLetters= "mississippi".count(){letter->letter ==  's'};
    print(numLetters);
}