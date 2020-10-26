package colecoes

fun main(){
    //Array
    val meuVetor = arrayOf(1,2,3)
    var item : Int
    for (item in meuVetor){
        println(item)
    }
    println("tamanho do array: ${meuVetor.size}")
    println("Primeiro elemento: ${meuVetor[0]}")
    println("Maior valor: ${meuVetor.max()}")

    //Lista
    //Objeto Lista não mutável
    val minhaLista = listOf("Oi", "ola", "denovo")
    println(minhaLista)

    val minhaListaQueMuda = mutableListOf("Oi", "ola", "denovo")
    println(minhaListaQueMuda)
    minhaListaQueMuda.add("Goku")
    println(minhaListaQueMuda)
    // Não pode ser executado pois a variavel foi criada com val
//    minhaListaQueMuda = mutableListOf("Oi", "ola", "denovo")
}