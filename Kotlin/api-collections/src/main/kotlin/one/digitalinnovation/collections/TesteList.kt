package one.digitalinnovation.collections

fun main() {
    val kaka = Funcionario("Kakazis", 7000.0, "CLT")
    val mah = Funcionario("Mairinha", 3000.0, "CLT")
    val kakik = Funcionario("Kaique", 8000.0, "PJ")

    val funcionarios = listOf(kaka, mah, kakik)

    funcionarios.forEach { println(it) }

    println("-----")
    println(funcionarios.find { it.nome == "Kakazis" })

    println("-----")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("-----")
    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
        """.trimIndent()
}