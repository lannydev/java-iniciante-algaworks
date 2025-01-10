package metodoInstancia;

public class MetodoInstancia {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.nome = "Elaine";
        cliente.sobrenome = "Cruz";
        cliente.telefone = "71986100159";
        cliente.email = "e.cristina00@gmail.com";

        System.out.println("Nome Completo: " + Cliente.obterNomeCompleto(cliente));

        System.out.printf("DDD: %s%n", cliente.obterDdd());

    }
}
