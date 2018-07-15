package TreinametoKotlin

/*
    Interface a grosso modo é um controto que quando assumido
    por uma classe deve ser implentado.

    Interface é ultilizada pois podemos ter muitos objetos
    (classes) que podem possuir a mesma ação (Métodos) porém,
    podem executá-las de maneira diferente
 */

interface Develop {
    fun developTeam()
}


open class Cidadao {
    open fun direitosDeveres() {
        println("Todo cidadão tem direitos e deveres!")
    }
}


class Marcio: Cidadao(), Develop {
    override fun developTeam() {
        println("Foi Admitido no Google!!!")
    }

}

class Heleno: Cidadao(), Develop{
    override fun developTeam() {
        println("Foi promovido no NATI")
    }

}


fun main(args: Array<String>) {

    val marcio = Marcio()
    marcio.direitosDeveres()
    marcio.developTeam()

    val heleno = Heleno()
    heleno.direitosDeveres()
    heleno.developTeam()
}