package estruturas_controle

fun main(){
    println("Imforme algo:")
    val valor = readLine()
     when(valor){
         "Murilo" -> println("Achei você!")
         "Teste2" -> println("Aqui 2")
         "lala" -> {
             println("Teste de Varios comandos")
             println("Ate aqui beleza")
         }
         else ->
             println("Valor padrão")
     }

    //Para validações de valores númericos
    when(valor!!.length){
        in 1..10 -> println("Até 10 digitado")
        15 -> print("Size == 15")
        else -> println("Caso padrão")
    }
}