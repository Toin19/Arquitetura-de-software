public class Cafe extends Bebida {
    @Override
    void ferverAgua() {
        System.out.println("Fervendo água para o café...");
    }

    @Override
    void adicionarIngredientes() {
        System.out.println("Adicionando café...");
    }

    @Override
    void servir() {
        System.out.println("Servindo café!");
    }
}