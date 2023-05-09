import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

public class Datas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, DayOfWeek> datas = new HashMap<String, DayOfWeek>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data;
        LocalDate dataFormatada;
        DayOfWeek diaDaSemana;

        while (true) {
            System.out.print("Digite uma data no formato dd/mm/yyyy (ou 'fim' para encerrar): ");
            data = scanner.nextLine();

            if (data.equals("fim")) {
                break;
            }

            dataFormatada = LocalDate.parse(data, formatter);
            diaDaSemana = dataFormatada.getDayOfWeek();
            datas.put(data, diaDaSemana);
        }

        int[] numDatasPorDiaDaSemana = new int[7];
        for (DayOfWeek dia : datas.values()) {
            numDatasPorDiaDaSemana[dia.getValue() - 1]++;
        }

        System.out.println("\nDatas armazenadas por dia da semana:");
        System.out.printf("Segunda-feira: %d\n", numDatasPorDiaDaSemana[0]);
        System.out.printf("Terça-feira: %d\n", numDatasPorDiaDaSemana[1]);
        System.out.printf("Quarta-feira: %d\n", numDatasPorDiaDaSemana[2]);
        System.out.printf("Quinta-feira: %d\n", numDatasPorDiaDaSemana[3]);
        System.out.printf("Sexta-feira: %d\n", numDatasPorDiaDaSemana[4]);
        System.out.printf("Sábado: %d\n", numDatasPorDiaDaSemana[5]);
        System.out.printf("Domingo: %d\n", numDatasPorDiaDaSemana[6]);
    }
}
//Exercício 4