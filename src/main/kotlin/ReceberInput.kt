class ReceberInput {
    companion object{
        fun lerInteiro(): Int {
            var valor: Int? = null
            while (valor == null) {
                try {
                    valor = readln()?.toInt()
                } catch (e: NumberFormatException) {
                    println("Formato inválido, para escolher o item, voce deve informar o numero dele")
                }
            }
            return valor
        }
    }
}