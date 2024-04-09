public class App {
    public static void imprimirInfo(Cafe c){
        System.out.println("Preço: " + c.informarPreco() + ", ingredientes: " + c.informarIngredientes());
    }
    public static void main(String[] args) throws Exception {
        Cafe c = new CafeSimples();
        imprimirInfo(c);

        c = new ComLeite(c);
        imprimirInfo(c);

        c = new CafeSimples();
        c = new ComSorvete(c);
        imprimirInfo(c);
    }
}
