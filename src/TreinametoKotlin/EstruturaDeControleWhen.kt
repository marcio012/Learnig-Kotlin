package TreinametoKotlin

fun main(args: Array<String>) {
    /*
        When uma opção para o if
     */


    when( 3 ) {
        1 -> println("Valor 1")
        2 -> println("Valor 2")
        3 -> println("Valor 3")
        4 -> println("Valor 4")
    }

    println("-------------")


    println("Opção do menu: ")
    println("-------------")
    println("Café com leite.")
    println("Chocolate quente")
    println("-------------")
    println("Escolha do menu: ")

    val opcao = 1

    when( opcao ) {
        1 -> {
            println("Café com leite")
            println("A especialidade da casa.")
        }
        2 -> println("Chocolate quente")
        else -> println("Nenhuma opção selecionada")
    }

    println("------------")

    var opcao3 = 1
    var resultado = when ( opcao3 ) {
        1 -> "opcão 1"
        2 -> "opção 2"
        else -> "Nenhuma opção selecionada"
    }

    println(resultado)



}