package metodoInstancia;

public class Cliente {

    String nome;
    String sobrenome;
    String telefone;
    String email;

    static String obterNomeCompleto(Cliente cliente){
        String nomeCompleto = cliente.nome + " " + cliente.sobrenome;
        return nomeCompleto;
    }

    String obterDdd(){
        String ddd = telefone.substring(0, 2);
        return ddd;
    }
}
