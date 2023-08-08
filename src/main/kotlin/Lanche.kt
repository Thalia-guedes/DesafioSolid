import FastFood.Companion.carrinhoLanche

interface Lanche {
    fun exibirOpcoes()
    fun adicionarAoCarrinho(quantidade: Int)
}

class XBurguer : Lanche {
    private val nome = "X-Burguer"
    private val valor = 10.0

    override fun exibirOpcoes() {
        println("X-Burguer selecionado")
        println("Digite a quantidade que deseja")
    }

    override fun adicionarAoCarrinho(quantidade: Int) {
        println("Pedido adicionado no carrinho")
        val adicionarXBurguer = ItemLanche(nome, quantidade, valor)
        carrinhoLanche.add(adicionarXBurguer)
    }
}

class XSalada : Lanche {
    private val nome = "X-Salada"
    private val valor = 12.0

    override fun exibirOpcoes() {
        println("X-Salada selecionado")
        println("Digite a quantidade que deseja")
    }

    override fun adicionarAoCarrinho(quantidade: Int) {
        println("Pedido adicionado no carrinho")
        val adicionarXSalada = ItemLanche(nome, quantidade, valor)
        carrinhoLanche.add(adicionarXSalada)
    }
}