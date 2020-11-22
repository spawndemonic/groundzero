class Player{
    val name = "madrigal"
        get() = field.capitalize()
    var playerHealth = 74;
    val isBlessed = true;
    val isImmortal = false;
    val aura = isBlessed && playerHealth > 50 || isImmortal;
    val karma = (Math.pow(Math.random(),(110-playerHealth)/100.0)*20).toInt()
    fun castFireball (numFireballs:Int = 2) =
        println("A glass of Fireball springs into existence. (x$numFireballs)")
    fun auraColor():String {
        val auraVisible = isBlessed && playerHealth > 50 || isImmortal;
        return if (auraVisible) "GREEN" else "NONE";

    }
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
