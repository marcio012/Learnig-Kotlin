package TreinametoKotlin

open class Animal() {

//     var cor: String = ""
//     var tamanho:Int = 0

    open fun dormir() {
        println("Dormir")
    }

    open fun correr() {
        println("Correr")
    }

}

class Cao: Animal() {

    override fun dormir() {
        super.dormir()
        println("como cao.")
    }

    fun latir() {
        println("Latir")
    }

}


fun main(args: Array<String>) {

    var cao = Cao()
//    println(cao.cor)
//    println(cao.tamanho)
    cao.dormir()
    cao.correr()
    cao.latir()

}