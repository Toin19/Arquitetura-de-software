public class Fachada {
    private ClienteBanco cliente;
    private ContaBancaria conta;

    public Fachada(){
        this.cliente = new ClienteBanco();
        this.conta = new ContaBancaria();
    }

    public void fazerDeposito(int quantidade, ClienteBanco cliente, ContaBancaria conta){
        System.out.println("Olá, o beneficiário de seu depósito é o(a) cliente: " + cliente.obterNomeDoCliente());
        System.out.println("Você escolheu a conta: " + conta.obterNumConta());
        System.out.println("O saldo dessa conta é: " + conta.obterSaldo());
        System.out.println("Você está depositando R$: " + quantidade);
        conta.setSaldo(conta.getSaldo() + quantidade);
        System.out.println("Depositando R$: " + quantidade + " na conta de: "+ cliente.obterNomeDoCliente());
        System.out.println("O saldo desta conta é: R$: " + conta.obterSaldo());
    }

    public ClienteBanco getCliente(){
        return cliente;
    }

    public void setCliente(ClienteBanco cliente){
        this.cliente = cliente;
    }

    public ContaBancaria getConta(){
        return conta;
    }
}
