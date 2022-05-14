

fun main(args: Array<String>) {

    val vocalesRepet = setOf("a","e","i","o","u","a","e")
    println(vocalesRepet)


    val numFav = mutableSetOf(1,2,3,4)
    println(numFav)
    numFav.add(5)
    println(numFav)

    println(numFav)
    numFav.remove(5)
    println(numFav)

    val valordelSet: Int? = numFav.firstOrNull {num ->
    num > 7
    }
    println(valordelSet)






}