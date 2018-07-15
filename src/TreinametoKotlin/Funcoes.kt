package TreinametoKotlin

fun main(args: Array<String>) {

    // funcoes são blocos de codigos que fazem uma
    // determinada ação

    exibeMensagem()
    exibeMenssagemParametro("Márcio Heleno", 36)

    println(somar(12, 34))

}

// função

fun exibeMensagem() {
    // blocos de codigos
    println("Hello World!!! function is ready...")
}

// passando parametros
fun exibeMenssagemParametro(nome: String, idade: Int) {
    println("Hello World ${nome} nos seus $idade anos !!!")
}

// função com retorno
fun somar(numero1: Int, numero2: Int): Int {
    var total = numero1 + numero2
    return total
}