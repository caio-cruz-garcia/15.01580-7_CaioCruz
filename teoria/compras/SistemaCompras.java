package teoria.compras;


import teoria.models.Produto;

import java.util.ArrayList;
import java.util.List;

public class SistemaCompras {
    private final List<Produto> produtos;
    private final ListaCompras listaCompras;

    public SistemaCompras() {
        produtos = new ArrayList<Produto>();
        produtos.add(new Produto(1,"Final Fantasy 7", 299.00));
        produtos.add(new Produto(2,"Zelda BOTW", 299.00));
        produtos.add(new Produto(3,"Mario - Odyssey", 299.00));
        produtos.add(new Produto(4,"Animal Crossing", 299.00));

        listaCompras = new ListaCompras();
    }

    public void exibirListaProduto(){
        for (Produto produtoNovo: produtos) {
            System.out.println(produtoNovo);
        }
//        produtos.forEach((produto) -> System.out.println(produto));
    }

    public void run(){
        exibirListaProduto();
    }
}
