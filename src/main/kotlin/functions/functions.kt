
fun main(args: Array<String>) {
    val frase = "Kevin Paul Montealegre Melo".randomCaseOwn()

    imprimirFrase(frase)
}

fun imprimirFrase (frase: String) : Unit {
    println("Tu frase es $frase")
}


fun String.randomCaseOwn () : String {

    val numberRandom = 0..99
    val resultado = numberRandom.random()

    return if(resultado.rem(2) == 0) {
         this.uppercase()
    } else {
         this.toLowerCase()
    }
}