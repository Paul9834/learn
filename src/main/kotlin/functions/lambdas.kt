

fun main(args: Array<String>) {

    val myLambda : (String) -> Int = {
        it.length
    }

    val lambdaEje:Int = myLambda("Kevin Montealegre Melo")

    println(lambdaEje)

    val saludos = listOf("Hello", "Hello", "Ciao")

    val LongSaludos = saludos.map(myLambda)
    println(LongSaludos)


}