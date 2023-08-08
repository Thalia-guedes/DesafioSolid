import ReceberInput.Companion.lerInteiro

interface CarrinhoItem {
    val nome: String
    val quantidade: Int
    val valorTotal: Double
}

data class ItemLanche(override val nome: String, override var quantidade: Int, val valorUnitario: Double) :
    CarrinhoItem {
    override val valorTotal: Double
        get() = quantidade * valorUnitario
}

data class ItemBebida(override val nome: String, override var quantidade: Int, val valorUnitario: Double) :
    CarrinhoItem {
    override val valorTotal: Double
        get() = quantidade * valorUnitario
}

class FastFood(val carrinho: Carrinho, val efetuarPagamento: EfetuarPagamento) {
    companion object {
        val carrinhoLanche = mutableListOf<ItemLanche>()
        val carrinhoBebida = mutableListOf<ItemBebida>()
    }

    fun lanche() {
        println("Escolha seu lanche")
        println("1 -> X-Burger\n2 -> X-Salada")

        var lanche: Lanche?
        when (lerInteiro()) {
            1 -> {

                lanche = XBurguer()
            }

            2 -> {

                lanche = XSalada()
            }

            else -> {
                lanche = null
                println("Opção inválida")
                println("AVISO -> Retornando as opções do cardápio!")
            }
        }
        lanche!!.exibirOpcoes()
        val quantidadeLanche = lerInteiro()
        lanche!!.adicionarAoCarrinho(quantidadeLanche)

    }

    fun bebidas() {
        println("Escolha sua Bebida")
        println("1 -> Refrigerante \n2 -> Suco Natural")
        var bebida: Bebida?

        when (lerInteiro()) {
            1 -> {
                bebida = Refrigerante()
            }

            2 -> {
                bebida = SucoNatural()
            }

            else -> {
                bebida = null
                println("Opção inválida")
                println("AVISO -> Retornando as opções do cardápio!")
            }
        }
        bebida!!.exibirOpcoes()
        val quantidadeBebida = lerInteiro()
        bebida!!.adicionarAoCarrinho(quantidadeBebida)

    }

}