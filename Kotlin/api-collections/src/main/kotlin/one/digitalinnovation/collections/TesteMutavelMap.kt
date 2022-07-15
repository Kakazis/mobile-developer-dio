package one.digitalinnovation.collections

fun main() {
    val kaka = Funcionario("Kakazis", 7000.0, "CLT")
    val mah = Funcionario("Mairinha", 3000.0, "CLT")
    val kakik = Funcionario("Kaique", 8000.0, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(kaka.nome, kaka)
    repositorio.create(mah.nome, mah)
    repositorio.create(kakik.nome, kakik)

    println(repositorio.findById(kaka.nome))

    println("----------------")
    repositorio.findAll().forEach { println(it) }
}