package TreinametoKotlin

fun main(args: Array<String>) {

    /*
        Controle de fluxo de execução
        if (Condição) {
            condição para acontecer
        }

    */

    if ( false )
        println("Verdadeiro")
    else
        println("Falso")

    println("----------")

    if (5 == 6) {
        println("Verdadeiro")
    } else {
        println("False")
    }

    println("----------")

    val idade = 18 // pedir a idade ao usuário

    if (idade >= 18)
        println("Entrada Permitida. ")
    else
        println("Entrada não Permitida. ")

    if (5 == 5 && 6 == 6 ) {
        println("Verdadeiro")
    } else {
        println("false")
    }

    println("-----------")

    val idade3 = 14
    if (idade < 14)
        println("Criança")
    else if (idade >= 14 && idade < 18)
        println("Adolescente")
    else
        println("Aduto")


    println("---------------")

    // if pode ser guardado em uma variavel

    var media = 8
    var result = if ( media >= 6) "aporvado" else "Reprovado"

    println("O resultado final é $result")
}