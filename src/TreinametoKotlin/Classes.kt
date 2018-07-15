package TreinametoKotlin

class Casa {

    // propriedade == atributos
    var cor: String = ""

    var janela: Boolean = false


    // Metodos == Funções
    fun abirJabela() {
        if (janela == false) {
            println("Janela aberta")
            janela = true
        } else {
            println("Janela Fechada")
            janela = false
        }
    }

    fun abrirPorta() {
        println("Abrir Porta!!!")
    }

    fun abirCasa() {
        this.abirJabela()
        this.abrirPorta()
    }


}

fun main(args: Array<String>) {

    // instance of class
    // a palavra new foi retirada
    val casa = Casa()
    casa.cor = "Yellow"

    println(casa.cor)

    val casa2 = Casa()
    casa2.cor = "green"

    println(casa2.cor)

    casa2.abirJabela()
    casa2.abirJabela()
    println(casa2.janela)

    casa2.abirCasa()



}