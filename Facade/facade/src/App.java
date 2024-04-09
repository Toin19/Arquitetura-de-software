public class App {
    public static void main(String[] args) throws Exception {
        ClienteBanco cliente = new ClienteBanco("Cauã Vinicius Gomes Monteiro");
        ContaBancaria conta = new ContaBancaria("1234-8");

        Fachada facade = new Fachada();
        facade.fazerDeposito(150, cliente, conta);
    }
}
