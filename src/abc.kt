//Funções de interação com collection
fun main () {
    fun abc() {
        val numeros = (1..10).toList()

        val pares = numeros.filter { numero ->
            numero % 2 == 0
            //Versão curta
            //val pares = numeros.filter {}
        }

        println(pares)

    }
    abc()

    //map - estrutura básica
    fun a () {
        val numeros = (1..5).toList()

        val dobro = numeros.map {numero ->
            numero * 2
        }
        println(dobro)
    }
    a()

    //Reduce - estrutura básica (Como eu quero juntar tudo em um unico valor?)
    fun b(){
        val numeros = (1..5).toList()
        val soma = numeros.reduce {acumulador, numero ->
            acumulador + numero
        }
        println(soma) //15
    }
    b()
}


//