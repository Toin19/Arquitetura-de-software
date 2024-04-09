public class Cha extends Bebida {
        @Override
        void ferverAgua() {
            System.out.println("Fervendo água para o chá...");
        }
    
        @Override
        void adicionarIngredientes() {
            System.out.println("Adicionando folhas de chá...");
        }
    
        @Override
        void servir() {
            System.out.println("Servindo chá!");
        }
    }