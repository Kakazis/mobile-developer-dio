package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Kakazis", 1000.0)
    val map1= mapOf(pair)

    map1.forEach{(k,v) -> println("Chave: $k - Valor: $v")}

    val map2 = mapOf("Mah" to 2500.0, "Kaique" to 3000.0)
    map2.forEach{(k,v) -> println("Chave: $k - Valor: $v")}
}