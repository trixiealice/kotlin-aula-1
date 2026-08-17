fun main() {

val texto = "Bom dia, pessoal"

    println(texto)
    println(texto.length)
    println(texto.uppercase())
    println(texto.contains(other = "pessoal"))

    val nome: String = "Alice"
    val idade = 19
    println("Bom dia $nome! logo logo vocë fará ${idade + 1} anos!!")

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
}



// Oi

/*
Temos dois tipos de variaveis:
var - o valor pode ser alterado
val - o valor não pode ser alterado (equivalente a const)

em nenhum dos casos pode ser redeclarado

*/

//infencias; não há necessidade de declarar o tipo de uma variável

