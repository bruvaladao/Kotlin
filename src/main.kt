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

    println("Despositando na conta do Alex")
    contaAlex.deposita(20.0)
    println(contaAlex.saldo)

    println("Depositando na conta da Fran")
    contaFran.deposita(100.0)
    println(contaFran.saldo)

    println("Sacando na conta do Alex")
    contaAlex.saca(20.0)
    println("Saldo da conta do Alex: ${contaAlex.saldo}")

    println("Transferindo para Fran")
    if (contaAlex.transfere(50.0, contaFran)){
        println("Transferencia com sucesso")
    } else{
        println("Falha na transferência")
    }

    println("Saldo da conta do Alex: ${contaAlex.saldo}")
    println("Saldo da conta da Fran: ${contaFran.saldo}")

}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }
}