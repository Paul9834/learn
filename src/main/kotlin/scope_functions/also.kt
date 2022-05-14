

fun main(args: Array<String>) {

    val listaColores = mutableListOf("Rojo","Azul", "Verde")
        .also {

            println("El valor original de la lista es $it")
        }.asReversed()

    println(listaColores)

}