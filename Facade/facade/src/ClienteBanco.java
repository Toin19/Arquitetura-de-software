public class ClienteBanco {
    private String nome;

    public String obterNomeDoCliente(){
        return this.nome;
    }

    public ClienteBanco(){}

    public ClienteBanco(String nome){
        this.nome = nome;
    }
}
