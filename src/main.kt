fun main() {
    println("Bem vindo ao Bytebank")

    val contaCorrente = ContaCorrente("Alex", 1000)
    val contaPoupanca = ContaPoupanca("Fran", 1001)

    contaPoupanca.deposita(1000.0)
    contaCorrente.deposita(1000.0)

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo corrente pos: ${contaCorrente.saldo}")
    println("Saldo poupança pos: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Saldo corrente trans: ${contaCorrente.saldo}")
    println("Saldo poupança trans: ${contaPoupanca.saldo}")
}