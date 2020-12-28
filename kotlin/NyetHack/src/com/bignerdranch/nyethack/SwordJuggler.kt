package com.bignerdranch.nyethack

import java.lang.Exception
import java.lang.IllegalStateException

fun main(){
    var swordsJuggling: Int? = null
    val isJugglingProficient = (1..3).shuffled().last() == 3
    if (isJugglingProficient){
        swordsJuggling = 2
    }
    try {
        proficiencyCheck(swordsJuggling)
        //forces the additon of 1 even if null
        swordsJuggling = swordsJuggling!!.plus(1)
        println("You juggle $swordsJuggling swords")
    }catch (e: Exception){
        println(e)
    }
}
fun proficiencyCheck(swordsJuggling: Int?){
    checkNotNull(swordsJuggling,{"Player can't juggle for shit"})
}
fun juggleSwords(swordsJuggling: Int){
    require(swordsJuggling >=3,{"Juggle at least 3 swords to be exciting"})
}
class UnskilledSwordJugglerException():
        IllegalStateException("Player cannot juggle for shit")