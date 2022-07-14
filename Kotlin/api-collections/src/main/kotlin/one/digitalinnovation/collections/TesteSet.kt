package one.digitalinnovation.collections

fun main() {
    val kaka = Funcionario("Kakazis", 7000.0, "CLT")
    val mah = Funcionario("Mairinha", 3000.0, "CLT")
    val kakik = Funcionario("Kaique", 8000.0, "PJ")

    val funcionarios1 = setOf(kaka, mah)
    val funcionarios2 = setOf(kakik)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("--------------")
    val funcionarios3 = setOf(kaka, mah, kakik)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("--------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}