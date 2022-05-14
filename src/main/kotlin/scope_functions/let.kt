
fun main(args: Array<String>) {


    var nombre : String? = null


    nombre?.let{
        println("El nombre no es nulo, es $it")
    }
     nombre = "Paul"
     nombre?.let {
        println("El nombre no es nulo, es $it")
    }

}



