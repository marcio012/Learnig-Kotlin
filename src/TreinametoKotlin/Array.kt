package TreinametoKotlin

fun main(args: Array<String>) {

    // Arrays um conjunto de variavies
    var nomes =  arrayOf("Márcio", "Cleideana", "Levi", "Leticia", "Dede")

    println(nomes)
    println(nomes[0])
    println(nomes[1])
    println(nomes[2])
    println(nomes[3])
    println(nomes[4])

    // write indices
    nomes[0] = "Márcio Heleno"
    println(nomes[0])

    // size
    println(nomes.size)

    println("------------------------------")

    var arrayMesclas = arrayOf(1212, "Jogar", "Pc", 12.1212, true)

    // print of arrayMesclas
    for (itens in arrayMesclas)
        println(itens)

    println("------------------------------")

    // array Int
    var numbers = intArrayOf(20, 30, 40)

    // alterando elementos
    numbers.set(2, 35)

    for (number in numbers)
        println(number)


}