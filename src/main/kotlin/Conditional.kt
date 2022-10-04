fun main() {
    val isSamboGuilty = true
    val isFalse = false

    if (isSamboGuilty) {
        println("He will be jailed")
    } else if (isFalse){
        println("Something wrong with this country")
    } else{
        println("no comment")
    }

    val lamaTahanan = if(isSamboGuilty)50 else 0
    println(lamaTahanan)

    val num = 11

    val result = when{
        num > 5 -> "Positive"
        num < 10 -> "Negative"
        else -> "out of bound"
    }
    println(result)
}