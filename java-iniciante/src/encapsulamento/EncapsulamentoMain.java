package encapsulamento;

public class EncapsulamentoMain {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setName("Elaine Cruz");
        cliente.setPhone("71986100159");

        System.out.println("Me chamo " + cliente.getName() + ", e meu telefone é " + cliente.getPhone());
    }
}
