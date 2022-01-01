class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val prl: Double
) : Funcionario(
    nome,
    cpf,
    salario
) {

//    fun bonificacao(): Double {
//        return salario * 0.2
//    }

    fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }
}