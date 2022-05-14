// Declaramos los valores de nuestras respuestas
const val RESPUESTA_AFIRMATIVA = "✅"
const val RESPUESTA_NEGATIVA = "❌"
const val RESPUESTA_DUDOSA = "?"

//Unimos las respuestas con los valores
val respuestas = mapOf(
    "Sí" to RESPUESTA_AFIRMATIVA,
    "Es cierto" to RESPUESTA_AFIRMATIVA,
    "Totalmente" to RESPUESTA_AFIRMATIVA,
    "Sin duda" to RESPUESTA_AFIRMATIVA,
    "Pregunta en otro momento" to RESPUESTA_DUDOSA,
    "No puedo decirte en este momento" to RESPUESTA_DUDOSA,
    "Puede que si o puede que no" to RESPUESTA_DUDOSA,
    "No va a suceder" to RESPUESTA_NEGATIVA,
    "No cuentes con ello" to RESPUESTA_NEGATIVA,
    "Definitivamente no" to RESPUESTA_NEGATIVA,
    "No lo creo" to RESPUESTA_NEGATIVA,
)

fun main(args: Array<String>) {

    println("Hola soy tu bola 8 magica en Kotlin. ¿Cual opción deseas?")
    println("1. Realizar una pregunta")
    println("2. Revisar todas las respuetas")
    println("3. Salir")


    val valorIngresado = readLine()

    when(valorIngresado) {
        "1" -> realizarPregunta()
        "2" -> mostrarRespuestas()
        "3" -> salir()
        else -> mostrarError()

    }
}

fun mostrarError() {
    println("Adios!")
}

fun salir() {
    println("Adios")
}

fun realizarPregunta() {
    println("Que pregunta desea?")
    readLine()
    println("Asi que esa era tu pregunta.. La respuesta a eso es:")
    val respuestaGenerada = respuestas.keys.random()
    println(respuestaGenerada)
}

fun mostrarRespuestas() {
    println("Selecciona una opcion")
    println("1. Revisar todas las respuestas")
    println("2. Revisar todas las respuestas afirmativas")
    println("3. Revisar todas las respuestas dudodas")
    println("4. Revisar solo las respuestas negativas")

    val opcionIngresada = readLine()
    when (opcionIngresada) {
        "1" -> mostrarRespuestasPorTipo()
        "2" -> mostrarRespuestasPorTipo(respuesta = RESPUESTA_AFIRMATIVA)
        "3" -> mostrarRespuestasPorTipo(respuesta = RESPUESTA_NEGATIVA)
        "4" -> mostrarRespuestasPorTipo(respuesta = RESPUESTA_DUDOSA)
        else -> println("Respuestas invalida")
    }

}

fun mostrarRespuestasPorTipo(respuesta:String = "TODOS") {

    when(respuesta) {
        "TODOS" -> respuestas.keys.forEach{ println(respuesta) }
        RESPUESTA_AFIRMATIVA -> respuestas.filterValues {  it == RESPUESTA_AFIRMATIVA}
            .also {
                println(it.keys)
            }

        RESPUESTA_NEGATIVA -> respuestas.filterValues {  it == RESPUESTA_NEGATIVA}
            .also {
                println(it.keys)
            }

        RESPUESTA_DUDOSA -> respuestas.filterValues {  it == RESPUESTA_DUDOSA}
            .also {
                println(it.keys)
            }


    }

}

