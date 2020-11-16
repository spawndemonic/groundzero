fun main(){
    val playerName = "Estragon"
    var experiencePoints = 5;
    var hasSteed  = false;
    var goldPieces = 50;
    val wineMenu = arrayOf("wine","mead","LaCroix");
    val pubName = "The Unicorn's Horn";
    experiencePoints += 5;
    println(pubName.reversed());
    println("A mirror of yourself "+mirror(playerName))
}
fun mirror (string: String): String {
    return string.reversed();
}
