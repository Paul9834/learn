
fun main(args: Array<String>) {

    val listaColores = mutableListOf("Rojo","Azul", "Verde")
        .apply {

            removeIf {
                it.contains("Azul")

            }
        }

    println(listaColores)

    val listaColoresNull:MutableList<String>? = mutableListOf("Rojo","Azul", "Verde")

    listaColoresNull?.apply {
        println("Los colores son $this")
        println("La cantidad es $size")
    }



}

