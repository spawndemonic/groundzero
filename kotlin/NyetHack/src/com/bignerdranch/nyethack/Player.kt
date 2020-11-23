package com.bignerdranch.nyethack

import java.io.File

class Player(_name:String,var playerHealth:Int,val isBlessed:Boolean,val isImmortal:Boolean){
    constructor(name: String):this(name,
            playerHealth=80,
            isBlessed=true,
            isImmortal=false)
    init {
        require(_name.length > 2, {"Your name should have a a minimum length of three."})
        require(_name.isNotBlank(),{"Player must have a name"})
    }
    val aura = isBlessed && playerHealth > 50 || isImmortal;
    val karma = (Math.pow(Math.random(),(110-playerHealth)/100.0)*20).toInt()
    val hometown = selectHomeTown()
        get()=field

    val name = _name
        get() = field.capitalize()
    fun castFireball (numFireballs:Int = 2) =
        println("A glass of Fireball springs into existence. (x$numFireballs)")
    fun auraColor():String {
        val auraVisible = isBlessed && playerHealth > 50 || isImmortal;
        return if (auraVisible) "GREEN" else "NONE";
    }
    fun selectHomeTown()=File("towns.txt")
        .readText()
        .split("\n")
        .shuffled()
        .first()
    fun getStatus()=
        when (playerHealth) {
            100 -> "Damn fine"
            in 90..99 -> "ight"
            in 75..89 -> if (isBlessed) {
                "Hurt but covered"
            } else {
                "hurt"
            }
            else -> "Sucks to be me"
        };
}
