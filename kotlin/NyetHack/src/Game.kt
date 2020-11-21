fun main(){
    val name = "madrigal";
    var playerHealth = 74;
    val karma = (Math.pow(Math.random(),(110-playerHealth)/100.0)*20).toInt()
    val isBlessed = true;
    val isImmortal = false;
    val aura = isBlessed && playerHealth > 50 || isImmortal;
    val playerStatus = getStatus(playerHealth, isBlessed);
    val auracolor = auraColor(isBlessed, playerHealth, isImmortal);
    printPlayerStatus(auracolor, isBlessed, name, playerStatus);
    println(playerStatus);
    println("Karma: $karma");
    castFireball();
    val printer: () -> String = {
        "Hello"
    }
    println(printer())

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

private fun auraColor(isBlessed: Boolean, playerHealth: Int, isImmortal: Boolean):String {
    val auraVisible = isBlessed && playerHealth > 50 || isImmortal;
    return if (auraVisible) "GREEN" else "NONE";

}

private fun getStatus(playerHealth: Int, isBlessed: Boolean)=
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
private fun castFireball (numFireballs:Int = 2) =
    println("A glass of Fireball springs into existence. (x$numFireballs)")
fun anonFunmess(){
    val numLetters= "mississippi".count(){letter->letter ==  's'};
    print(numLetters);
}