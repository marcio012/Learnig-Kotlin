package TreinametoKotlin

fun main(args: Array<String>) {
    // loops
        // while
        // for

    var numero = 1;

    while ( numero <= 5 ) {
        println(numero)
        ++numero

    }
    println("Final")


    // for

    for( numero in 1..5) {
        println("Executando: $numero")
    }

    val postagens = arrayOf(
        "aaaaaa",
        "bbbbbb",
        "cccccc"
    )

    for (postagem in postagens) {
        println(postagem)
    }

    println("-----------")

    for ((indice, postagem) in postagens.withIndex()) {
        println("$indice - $postagem")
    }
}