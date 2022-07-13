package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Mah"
    nomes[1] = "Kaka"
    nomes[2] = "Kaique"

    for ( nome in nomes) {
        println(nome)
    }

    nomes.sort()
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Maria", "Zazá", "Coninga")
    nomes2.sort()
    nomes2.forEach { println {it}}
}