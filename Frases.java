import java.util.HashMap;
import java.util.Scanner;

public class Frases{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> ocorrencias = new HashMap<String, Integer>();
        String frase;

        // Lê várias frases do usuário e conta as ocorrências de cada palavra
        while (true) {
            System.out.print("Digite uma frase (ou 'fim' para encerrar): ");
            frase = scanner.nextLine();

            if (frase.equals("fim")) {
                break;
            }

            String[] palavras = frase.split(" ");
            for (String palavra : palavras) {
                if (ocorrencias.containsKey(palavra)) {
                    ocorrencias.put(palavra, ocorrencias.get(palavra) + 1);
                } else {
                    ocorrencias.put(palavra, 1);
                }
            }
        }

        // Exibe o número de ocorrências de cada palavra
        System.out.println("\nOcorrências de cada palavra:");
        for (String palavra : ocorrencias.keySet()) {
            int numOcorrencias = ocorrencias.get(palavra);
            System.out.printf("%s: %d\n", palavra, numOcorrencias);
        }
    }
}
//Exercício 3