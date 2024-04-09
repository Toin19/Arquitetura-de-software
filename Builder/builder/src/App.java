public class App {
    public static void main(String[] args) {
        Carro carro = new Carro.CarroBuilder()
            .setMarca("Toyota")
            .setModelo("Hilux")
            .setAno(2024)
            .setCor("Azul")
            .build();


        System.out.println(carro.toString());
    }
}