import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Lucas", "Antônio", "Carlos", "Anderson");

        NomeIterator iterator = new NomeIterator(nomes);

        while (iterator.hasNext()) {
            String nome = iterator.next();
            System.out.println("Nome : " + nome);
        }
    }
}