
fun main(args: Array<String>) {


    val edadHeroe = mapOf(
        "Superman" to 30,
        "Ironman" to 45,
        "Spiderman" to 20,
        "Capitan America" to 99
    )

    println(edadHeroe)

    val edadHeroesMutable = mutableMapOf(
        "Superman" to 30,
        "Ironman" to 45,
        "Spiderman" to 20,
        "Capitan America" to 99
    )

    println(edadHeroesMutable)

    edadHeroesMutable.put("Wolverine", 50)
    println(edadHeroesMutable)

    edadHeroesMutable["Storm"] = 25
    println(edadHeroesMutable)

    val edadIronMan = edadHeroesMutable["Spiderman"]
    println(edadIronMan)

    edadHeroesMutable.remove("Spiderman")
    println(edadHeroesMutable)

    println(edadHeroesMutable.keys)
    println(edadHeroesMutable.values)


}