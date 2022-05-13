

fun main(args: Array<String>) {

    val numerosDeLoteria = listOf(11, 22, 43,56,78,66)

    val numerosDeLoteria2 = listOf(10, 20, 30, 40, 50 ,60)

    val numerosOrdenados = numerosDeLoteria.sorted()
    println(numerosOrdenados)

    val numerosDeLoteriasDesc = numerosDeLoteria.sortedDescending()
    println(numerosDeLoteriasDesc)

    val ordenarPorMultiplos = numerosDeLoteria2.sortedBy { numero ->
        numero < 50
    }
    println(ordenarPorMultiplos)

    val numerosRandom = numerosDeLoteria.shuffled()
    println(numerosRandom)

    val numerosEnReversa = numerosDeLoteria.reversed()
    println(numerosEnReversa)

    val mensajesDeNumeros = numerosDeLoteria.map {numero ->
        "Tu numero de loteria es $numero"
    }
    println(mensajesDeNumeros)

    val numerosFiltrados = numerosDeLoteria.filter {numero ->
        numero > 50
    }

    println(numerosFiltrados)






}