package TreinametoKotlin

fun main(args: Array<String>) {

    /*
    Relational
        ==  ( Igual a )
        !=  ( Diferente )
        >   ( maior que )
        <   ( menor que )
        >=  ( maior igual a que )
        <=  ( menor igual a que )

    Logic

        && (  e  )
        || ( ou )

     */

    println( 5 == 5)    // true
    println( 4 > 3)     // true
    println( 6 != 7)    // true
    println("--------------")
    // logica
    println("Tabela Vedade 'e'")
    println( true  && true  )
    println( true  && false )
    println( false && true  )
    println( false && false )

    println("Tabela verdade 'ou'")

    println( true  || true  )
    println( true  || false )
    println( false || true  )
    println( false || false )

}