package one.digitalinnovation.collections

fun main() {
    val kaka = Funcionario("Kakazis", 7000.0, "CLT")
    val mah = Funcionario("Mairinha", 3000.0, "CLT")
    val kakik = Funcionario("Kaique", 8000.0, "PJ")

    println("---LIST---")
    val funcionarios = mutableListOf(kaka, mah)
    funcionarios.forEach { println(it) }

    println("------")
    funcionarios.add(kakik)
    funcionarios.forEach { println(it) }

    println("------")
    funcionarios.remove(kaka)
    funcionarios.forEach { println(it) }

    println("---SET---")
    val funcionarioSet = mutableSetOf(kaka)
    //funcionarioSet.forEach { println(it) }

    funcionarioSet.add(mah)
    funcionarioSet.add(kakik)
    funcionarioSet.forEach { println(it) }
}

