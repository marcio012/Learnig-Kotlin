package TreinametoKotlin

class Casa2(var cor: String = "", var janelaQtd: Int = 0) {

    // propriedade == atributos
    // var cor: String = ""
    // var vagasGaragem = ""

    var janela: Boolean = false

    fun detalhesCasa() {
        println("A casa tem a cor $cor e um total de $janelaQtd janelas")
    }



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

    val casa2 = Casa2("Amarela", 3)
    casa2.detalhesCasa()


}