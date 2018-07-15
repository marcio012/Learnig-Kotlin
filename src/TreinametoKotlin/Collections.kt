package TreinametoKotlin

/*
    Collections ou coleções -> são implementações
    de estruturas de dados são elas:
        - List -> Imutável, tamanho fixo, apenas para leitura
        - Array List -> Mutável, sem tamanho fixo, pode adicionar ou remover
 */

fun main(args: Array<String>) {

    var listaItens = listOf("SP", "CE", "RJ")

    // List são imutaveis

    println(listaItens)

    println("______________")

    // array of não permite add
    var listaItemns2 = arrayOf("PE", "MS", "AM")

    for (item in listaItemns2) {
        println(item)
    }

    println(listaItemns2.size)

    listaItemns2.reverse()


    // arrayListOf permite add
    var listaItemns3 = arrayListOf("PE", "MS", "AM")

    for (item in listaItemns3) {
        println(item)
    }

    listaItemns3.add("DF")
    listaItemns3.remove("PE")
    listaItemns3.removeAt(0)
    println(listaItemns3.size)
    println(listaItemns3)
    for (item in listaItemns3) {
        println(item)
    }



    for (item in listaItemns2) {
        println(item)
    }




}