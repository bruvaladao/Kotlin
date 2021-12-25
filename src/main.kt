fun main() {
    println("Bem vindo ao Bytebank.")

    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 100.0

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0

    println("INFORMAÇÃO CONTA BRUNO")
    println("Titular: ${contaAlex.titular}")
    println("Número da conta: ${contaAlex.numero}")
    println("Saldo: ${contaAlex.saldo}")

    println("INFORMAÇÃO CONTA FRAN")
    println("Titular: ${contaFran.titular}")
    println("Número da conta: ${contaFran.numero}")
    println("Saldo: ${contaFran.saldo}")
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}