fun main() {
    println("Bem vindo ao Bytebank")
    val bruno = Funcionario("Bruno", "370.380.238-37", 1000.0)
    println("Nome: ${bruno.nome}")
    println("CPF: ${bruno.cpf}")
    println("Salário: ${bruno.salario}")
    println("Bonificação: ${bruno.bonificacao()}")

    val pamela = Gerente("Pamela", "388.109.208-05", 2000.0, 1234)
    println("Nome: ${pamela.nome}")
    println("CPF: ${pamela.cpf}")
    println("Salário: ${pamela.salario}")
    println("Bonificação: ${pamela.bonificacao()}")

    if(pamela.autentica(1234)){
        println("Autenticou com sucesso.")
    } else{
        println("Falha na autenticação.")
    }

    val gisele = Diretor("Gisele", "333.333.333-33", 4000.0, 4000, 500.0)

    println("Nome: ${gisele.nome}")
    println("CPF: ${gisele.cpf}")
    println("Salário: ${gisele.salario}")
    println("PLR: ${gisele.prl}")

    if (gisele.autentica(4000)){
        println("Autentificado com sucesso.")
    } else{
        println("Falha na autentificação.")
    }
}