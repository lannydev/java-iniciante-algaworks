package primeirasClasses;

public class PrimeiroProduto {
    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.nome = "Chaveiro em Resina";
        produto.preco = 25.0;
        produto.quantidadeEmEstoque = 20;

        consultarEstoque(produto);

    }

    static void consultarEstoque(Produto produto){
        System.out.println("Quantidade em estoque: " + produto.quantidadeEmEstoque);

    }
}
