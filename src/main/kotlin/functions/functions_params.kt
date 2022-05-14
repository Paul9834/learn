

fun main(args: Array<String>) {

    imprimirNombre(nombre = "Kevin ", apellido ="Montealegre")


}


fun imprimirNombre (nombre:String, seNombre:String = "", apellido:String) {

    println("Mi nombre es $nombre $seNombre y mi apellido es $apellido")


}