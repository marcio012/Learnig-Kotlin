package TreinametoKotlin

/*
    Set -> não permite elementos duplicados, é mais rápido que o ArrayList,
    não mantém a orddem dos elementos
    Map -> é uma implementação chave/valor
 */

fun main(args: Array<String>) {

    var itens = hashSetOf("a", "b", "c", "c")

    println(itens)

    for (item in itens)
        println(item)


    var numeros = hashSetOf(10, 20, 30, 50, 70)

    println(numeros)
    for (numero in numeros)
        println(numero)


    // map

    var map = hashMapOf(
            "urso " to " Animal que hiberna",
            "ganço " to " Animal que bica",
            "cão " to " O melhor amigo do homem"
    )

    println(map)

    map.put("passaro", "Gosta de voar")

    println(map)

    for (item in map)
        println(item)

    println("---------------")

    for (item in map.values)
        println(item)

    println("---------------")

    map.remove("passaro")

    for (item in map.values)
        println(item)

    println("---------------")

}