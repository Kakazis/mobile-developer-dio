package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1400.0, 2250.0, 5000.0)
    for (salario in salarios) {
        println(salario)
    }

    println("---------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    val salariosMaiorQue2000 = salarios.filter { it > 2500.0 }

    salariosMaiorQue2000.forEach { println(it) }
    println("---------")
    println(salarios.count {it in 2000.0..5000.0})

    println("---------")
    println(salarios.find {it == 2250.0})

    println("---------")
    println(salarios.any {it == 2250.0})
}