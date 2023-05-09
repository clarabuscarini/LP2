import java.util.HashSet;
import java.util.Scanner;

public class Cadastro{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        HashSet<String> palavras = new HashSet<String>();
        String[] palavrasArray = frase.split(" ");

        for (String palavra : palavrasArray) {
            palavras.add(palavra);
        }

        int numPalavrasNaoRepetidas = palavras.size();
        System.out.printf("A frase contém %d palavras não repetidas.\n", numPalavrasNaoRepetidas);
    }
}
//Exercício 2