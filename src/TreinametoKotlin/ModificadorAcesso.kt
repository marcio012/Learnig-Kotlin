package TreinametoKotlin

// são palavras utilizadas para definir a visibilidade
// de propriedades e metodos

// private      -> Visivel apenas dentro da classe
// protected    -> Funciona como o privete, mas e visível em subclasses
// public       -> Visível em todoo lugar, caso não seja definido é o padrão
// internal     -> Lembra o public, mas sua visibilidade é restringida ao módulo
//                 sendo então visível dentro de um mesmo módulo.

open class Animal2 {

    protected var nome = "marley"

    fun dormir() {
        println("Dormir")
    }
}


class Cao2: Animal2() {

    fun exibeNome() {
        println("Método exibe nome: $nome")
    }
}


fun main(args: Array<String>) {


//    val animalMod = Animal2()
//    println(animalMod.nome)
    val cao3 = Cao2()
    cao3.exibeNome()


}