import model.Carro
import model.CarroTunado

 fun main() {

     println("---------------")

     val carro = Carro()
     val carroTunado = CarroTunado()

     carro.modelo = "Fusca"
     carro.ano = -3009

     carroTunado.modelo = "silvia"
     carroTunado.ano = 1999
     carroTunado.ranking = 's'

     carro.acelerar()
     carroTunado.acelerar()

     println(carro.modelo)
     println(carro.ano)
     println(carro.consultarKm())



     println("---------------")


 /*
    val texto = "Bom dia, pessoal"

    println(texto)
    println(texto.length)
    println(texto.uppercase())
    println(texto.contains(other = "pessoal"))

    //val nome: String = "Alice"
    val idade = 19
    //println("Bom dia $nome! logo logo vocë fará ${idade + 1} anos!!")

    val textoDois = """
        Texto escrito
        em várias
        linhas para
        teste
        """.trimIndent()
    println(textoDois)

    val caracter = 'a'
    println(caracter)

    val bloqueado: Boolean = false
    println(bloqueado)

    val idadedois: Int = 67
    println(idadedois)

    val populacao = 6_76_767L
    println(populacao)

    val peso: Float = 67.1234567F
    println(peso)

    val altura: Double = 1.70
    println(altura)

    val x: Int = 10
    val y: Double = x.toDouble() //Obrigatório
    // val z: Double = x - Não funciona

    val a = 10
    val b = 3

    println(a + b)
    println(a % b)
    println(a / b)


    fun soma (a: Int, b: Int): Int {
        return a + b
    }

    val result = soma (10, 3)
    println(result)
    mandaSalve()
    mensagemParabens(idade = 28, nome = "Joao")





    val soma: (Int, Int) -> Int = {a, b -> a + b}
    val result1 = soma(10, 3)

    println(result1)


    val idade2 = 18

    if(idade2 >= 18) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }


    val nota = 7

    if(nota >= 9){
        println("Execelente")
    } else if (nota >=6) {
        print("Boa")
    } else {
        println("Reprovado")
    }

    val idade3 = 20
    val status = if(idade3 >= 18) {
        "Maior"
        println("Teste4")
        println(false)
    } else {
        "Menor"
    }

    println(status)


    val dia = 3
    val  nomedia = when (dia) {
        1 -> println("Domingo")
        2 -> println("Segunda")
        3 -> println("Terça")
        else -> println("Dia inválido")
    }

    val nota1 = 9

    when (nota) {
        9, 10 -> println("Excelente")
        7, 8 -> println("bom")
        6 -> println("Regular")
        else -> println("reprovado")
    }


    var nome: String? = "joao"
    nome = null

    if(nome != null) {
        println(nome?.length)
    }

    var numeros = arrayOf(1, 2, 2)

    println(numeros[0])
     numeros[1] = 50
    println(numeros[1])

    var frutas = listOf("Banana", "Maça", "Maça")
    println(frutas[0])
    //frutas.add("Limão")
    //frutas.remove(2)

    println(frutas.size)
    //printLn(frutas.first())
    println(frutas.last())
    println(frutas.contains("Maçã"))

    //Lista são imutáveis (listOf).
    //para criar uma lista mutável, se utiliza mutableListOf

    var carros = mutableListOf("Corsa", "Celta")
    println(carros.size)
    println(carros.last())
    println(carros.add("Fusca"))
    println(carros.last())



    //Set comum (imutável)
    //Para ser mutável utilizar mutableSetOf
    //Não permite repetição
    //Não garante ordem de inserção
    //Acesso ao valor por metodo
    //Não permite alteração
    val cores = mutableSetOf("Azul", "Verde", "Azul")
    println(cores)
    cores.add("Amarelo") //não funciona no comum
    cores.remove("Verde") // não funciona no comum

    println("---------------------------------")

    //Map (imutavel)
    val pessoas = mapOf(
        "João" to 25,
        "Maria" to 26
    )

    println(pessoas["João"])
    // println(pessoas["Pedro"])
    // pessoas["Maria"] = 27

    val produtos = mutableMapOf(
        "pc" to "computador",
        "cl" to "celular"
    )

    println(produtos["pc"])
    produtos["ms"] = "mouse"
    produtos.remove("pc")
    println("produtos")

    println("---------------------------------")

    //estruturas de repetição - while
    var i = 0 //serve como contador

    while (i < 10) {
        println(i)

        i++
    }


    //Operadores de intervalo
    // São operadores utilizados para gerar os "ranges"(intervalos)
    1 .. 5 // 1 a 5
    1 until 5 //1 a 4
    5 downTo  1 // 5 a 1
    1 .. 2 step  2 // 1, 3, 5, 7, 9

    println("---------------------------------")

    //estruturas de repetição - for
    //Em kotlin, o for funciona como "ranges"

    for (i in 1 ..5) {
        println(i)
    }

    println("---------------------------------")

    val carrosDois = listOf("Corsa", "celta", "fusca")
    for (carro in carros) {
        println(carro)
    }
    println("---------------------------------")
    for (indice in carros.indices) {
        println(indice)
    } // imprime 0, 1, 2
    println("---------------------------------")

    //Fala a ordem que cada item está
    for ( (indice, carro) in carros.withIndex()){
        println("O $carro está na posição $indice")
    }

    println("---------------------------------")

    val idade4 = 15
    when (idade4) {
        in 0..12 -> println("Criança")
        in 12..17 -> println("Adolescente")
        in 18..59 -> println("Adulto")
        else -> println("Idoso")
    }

*/


}





//fun mandaSalve(nome:String) {
//    println("Salve $nome!")
//};


fun mandaSalve(nome: String = "mano") {
    println("Salve $nome!")

};

fun mensagemParabens(nome: String, idade: Int) {
    println("Parabéns $nome pelos $idade anos de vida!")

};



// Oi

/*
Temos dois tipos de variaveis:
var - o valor pode ser alterado
val - o valor não pode ser alterado (equivalente a const)

em nenhum dos casos pode ser redeclarado

 == igual
 != diferente
 > maior
 < menor

 Operadores atribuição

 += - valor atual mais valor novo
 -= - valor atual menos valor novo
 *= - valor atual da multiplicado pelo novo valor
 /= - vallor atualdivididopelo novo valor
 %= = resto da divisão do valor atual pelo novo valor


    fun main () {
    nomeDaFuncao()
    }

    fun nomeDaFuncao () {
    println ("Oi")
    }

    funções com parametros


*/

//infencias; não há necessidade de declarar o tipo de uma variável

