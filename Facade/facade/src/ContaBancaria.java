public class ContaBancaria {
    public String conta;
    public int saldo;

    public int depositar(int valor){
        System.out.println("Depositando...");
        return this.setSaldo(this.getSaldo() + valor);
    }

    public String obterNumConta(){
        System.out.println("Obtendo número da conta...");
        return this.conta;
    }

    public int obterSaldo(){
        System.out.println("Obtendo saldo...");
        return this.getSaldo();
    }

    public ContaBancaria(){}

    public ContaBancaria(String conta){
        this.conta = conta;
    }

    public int getSaldo(){
        return saldo;
    }

    public int setSaldo(int saldo){
        this.saldo = saldo;
        return saldo;
    }
}
