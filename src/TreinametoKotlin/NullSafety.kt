package TreinametoKotlin

fun main(args: Array<String>) {

    var texto: String? = null
//    texto = "Márcio"


    if ( texto != null ) println(texto.length) else println("O texto é $texto")

    // modo nullSafety
    println(texto?.length)

    // !! esse nunca pode ser nulo
    println(texto!!.length)

}