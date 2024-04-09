public class App {
    public static void main(String[] args) {
        Bebida cafe = new Cafe();
        cafe.preparar();

        System.out.println();

        Bebida cha = new Cha();
        cha.preparar();
    }
}