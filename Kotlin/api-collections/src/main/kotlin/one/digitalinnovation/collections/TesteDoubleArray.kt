package one.digitalinnovation.collections

fun main() {
    val salario = DoubleArray(3)
    salario[0] = 1000.0
    salario[1] = 3000.0
    salario[2] = 500.0

    salario.forEach { println(it) }

    salario.forEachIndexed { index, salarios ->
        salario[index] = salarios * 1.1
    }
    salario.forEach { println(it) }


    println("-----------")
    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0 )
    salarios2.sort()
    salarios2.forEach { println(it) }

}