import FastFood.Companion.carrinhoBebida

interface Bebida {
    fun exibirOpcoes()
    fun adicionarAoCarrinho(quantidade: Int)
}
class Refrigerante : Bebida {
    private val nome = "Refrigerante"
    private val valor = 8.0

    override fun exibirOpcoes() {
        println("Refrigerante selecionado")
        println("Digite a quantidade que deseja")
    }
    override fun adicionarAoCarrinho(quantidade: Int) {
        println("Pedido adicionado no carrinho")
        val adicionarRefri = ItemBebida(nome, quantidade, valor)
        carrinhoBebida.add(adicionarRefri)
    }
}
class SucoNatural : Bebida {
    private val nome = "Suco Natural"
    private val valor = 6.0

    override fun exibirOpcoes() {
        println("Suco Natural selecionado")
        println("Digite a quantidade que deseja")
    }

    override fun adicionarAoCarrinho(quantidade: Int) {
        println("Pedido adicionado no carrinho")
        val adicionarSuco = ItemBebida(nome, quantidade, valor)
        carrinhoBebida.add(adicionarSuco)
    }
}


