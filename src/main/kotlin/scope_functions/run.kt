

fun main(args: Array<String>) {


    val listaColores = mutableListOf("Rojo","Azul", "Verde")
        .run {
            removeIf{
                it.contains("Rojo")
            }
            this
        }

    println(listaColores)

}


