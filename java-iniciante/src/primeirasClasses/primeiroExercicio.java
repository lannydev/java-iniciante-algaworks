package primeirasClasses;

public class primeiroExercicio {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Caneta peersonalizada";
        produto.quantidadeEmEstoque = 12;

        precisaReporEstoque(produto);

    }

    static boolean precisaReporEstoque(Produto produto){
        if(produto.quantidadeEmEstoque < 10){
            System.out.println(true);
            return true;
        }else {
            System.out.println(false);
            return false;
        }

    }
}
