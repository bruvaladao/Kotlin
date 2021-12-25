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

    println("INFORMAÇÃO CONTA ALEX")
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

fun testaLacos() {
    var i: Int = 0
    while (i <= 5) {
        println(i)
        i++
    }

    for (i in 5 downTo 1) {
        val titular = "Bruno $i"
        val numeroConta = 1000
        var saldo = -100.0
        saldo = 100.0
        saldo += 200

        println("Titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo da conta: $saldo")

    }
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta é positiva.")
    } else if (saldo == 0.0) {
        println("Conta neutra")
    } else {
        println("Conta negativa")
    }
}