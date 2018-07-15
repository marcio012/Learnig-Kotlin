package TreinametoKotlin

/*
    Enum (Enumeracao) -> é um tipo de dados
    que consiste em um conjunto de constantes
*/

enum class StatusPedido {
    PROCESSANDO, APROVADO, REPROVADO
}


class Pedidos {

    var status: StatusPedido = StatusPedido.PROCESSANDO

}


fun main(args: Array<String>) {

    val pedido = Pedidos()

    if (pedido.status == StatusPedido.PROCESSANDO) {
        println("Pedido está sendo processado.")
    } else if (pedido.status == StatusPedido.APROVADO) {
        println("Pedido foi aprovado.")
    } else if (pedido.status == StatusPedido.REPROVADO){
        println("Pedido foi reprovado.")
    } else {
        println("Processando...")
    }
    
    println("------------------")

    when (pedido.status) {
        StatusPedido.PROCESSANDO -> println("Pedido está sendo processado.")

        StatusPedido.APROVADO -> println("Pedido foi Aprovado")

        StatusPedido.REPROVADO -> println("Pedido foi Reprovado")

        else -> println("Não enche o saco")
    }



}
