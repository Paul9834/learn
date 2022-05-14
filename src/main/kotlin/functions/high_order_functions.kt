import java.util.StringJoiner

fun main(args: Array<String>) {

    val valorInic = superFuncion(valor = "Hola!") {
        it.length
    }


    print(valorInic)


    val lambdaIn: () -> String = functionInception("Kevin")

    val valorLambdaIn:String = lambdaIn()
    println(valorLambdaIn)

}


fun superFuncion(valor :String, block : (String) -> Int ) : Int {
    return block(valor)
}

fun functionInception(nombre: String) : () -> String {
    return {
        "Hola en lambda $nombre"
    }
}