import FastFood.Companion.carrinhoBebida
import FastFood.Companion.carrinhoLanche
import ReceberInput.Companion.lerInteiro

class Carrinho{

    var totalLanches = 0.0
    var totalBebidas = 0.0

    fun exibeCarrinho(){
        val codigo = (1..100).random()
        println("Seu carrinho:")

        totalLanches = carrinhoLanche.sumOf { it.valorUnitario * it.quantidade }
        carrinhoLanche.forEach { itemLanche ->
            println("Lanche: ${itemLanche.nome}\nQuantidade: ${itemLanche.quantidade}\nCódigo: ${codigo}\nTotal: R$${itemLanche.valorUnitario * itemLanche.quantidade}")
        }

        totalBebidas = carrinhoBebida.sumOf { it.valorUnitario * it.quantidade }
        carrinhoBebida.forEach { itemBebida ->
            println("Bebida: ${itemBebida.nome}\nQuantidade: ${itemBebida.quantidade}\nCódigo: ${codigo}\nTotal: R$${itemBebida.valorUnitario * itemBebida.quantidade}")
        }

    }
    fun calcularTotal(): Double{
        return  totalLanches + totalBebidas

    }
    fun removerLanche(string: String){
        if (carrinhoLanche.isNotEmpty()) {
            println("Digite a quantidade que deseja remover")
            val quantidadeRemovida = lerInteiro()
            println("Quantidade removida foi: $quantidadeRemovida")

            val itemRemover = carrinhoLanche.find { it.nome == string }
            if (itemRemover != null && itemRemover.quantidade >= quantidadeRemovida) {
                itemRemover.quantidade -= quantidadeRemovida
                exibeCarrinho()
            } else {
                println("Quantidade inválida! A quantidade a ser removida não pode ser maior do que a quantidade presente no carrinho.")
            }
        } else {
            println("Carrinho de Lanches vazio!")
        }
    }
    fun removerBebida(string: String){
        if (carrinhoBebida.isNotEmpty()) {
            println("Digite a quantidade que deseja remover")
            val quantidadeRemovida = lerInteiro()
            println("Quantidade removida foi: $quantidadeRemovida")

            val itemRemover = carrinhoBebida.find { it.nome == string }
            if (itemRemover != null && itemRemover.quantidade >= quantidadeRemovida) {
                itemRemover.quantidade -= quantidadeRemovida
                exibeCarrinho()
            } else {
                println("Quantidade inválida! A quantidade a ser removida não pode ser maior do que a quantidade presente no carrinho.")
            }
        } else {
            println("Carrinho de Bebidas vazio!")
        }
    }

    fun removerItens() {
        println("Escolha uma opção para remover:")
        println("1-> X-Burguer \n2-> X-Salada \n3 -> Refrigerante \n4 -> Suco Natural")

        when (lerInteiro()) {
            1-> removerLanche("X-Burguer")
            2-> removerLanche("X-Burguer")
            3-> removerBebida("Refrigerante")
            4-> removerBebida("Suco Natural")
        }

    }
}