package TreinametoKotlin

fun main(args: Array<String>) {

    // Double,  | 1.7e308 até 1.7e+308  | val decimal = 3.5
    // FLoat,   | 3.4e308 até 3.4e+308  | val float = 3.5f
    // Long,    | -92233... até 92233   | val long = 652636L
    // Int      | -21474 até 21474      | val int = 65365

    // String   | val string = "Márcio Heleno"
    // Boolean  | val boolean = true

    // obs o kotlin tem a inferencia automatica

    // Double
    var numero = 3.5123123123
    var numeroD: Double = 3.5123123123

    println(numero)
    println(numeroD)

    // Float
    var numFloat = 5.4
    var numFloat1: Float = 5.4F

    println(numFloat)
    println(numFloat1)

    // Int
    var numero1 = 123123
    var numero1I: Int = 123123

    println(numero1)
    println(numero1I)

    //Long
    var numeroL = 1000000000000000001L
    var numeroL2: Long = 1010101001010011231L

    println(numeroL)
    println(numeroL2)

    var text1 = "Márcio"
    var text: String = "Márcio Heleno is String"

    println(text1)
    println(text)

    // boolean
    var resulado = true
    var resultado2: Boolean = false

    println(resulado)
    println(resultado2)


}