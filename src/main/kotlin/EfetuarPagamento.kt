import ReceberInput.Companion.lerInteiro

class EfetuarPagamento {

    fun efetuarPagamento(total: Double) {

        exibirFormaDePagamento()
        when (lerInteiro()) {
            1 -> {
                pagamentoComDinheiro(total)
            }
            2 -> {
                println("Pagamento no cartão de crédito realizado.")
            }

            3 -> {
                println("Pagamento no cartão de debito realizado.")
            }

            4 -> {
                println("Pagamento no cartão refeição realizado.")
            }
            else -> {
                println("Opção inválida. Pagamento não efetuado.")

            }
        }
    }
    fun exibirFormaDePagamento(){
        println("Formas de pagamento:")
        println("1 -> Dinheiro")
        println("2 -> Cartão de Crédito")
        println("3 -> Cartão de Debito")
        println("4 -> Vale refeição")
    }
    fun pagamentoComDinheiro(total: Double){
        println("Digite o valor em dinheiro:")
        val valorEmDinheiro = readln()?.toDoubleOrNull() ?: 0.0

        if (valorEmDinheiro >= total) {
            val troco = valorEmDinheiro - total
            println("Pagamento realizado com sucesso! Troco: R$%.2f".format(troco))
        } else {
            println("Valor insuficiente. Pagamento não efetuado.")
        }
    }
}