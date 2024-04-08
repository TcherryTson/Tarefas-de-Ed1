import java.util.Scanner;

import java.util.Scanner;

public class Vetor8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ultdia = new int[12];
        String[] signo = new String[12];

        for (int i = 0; i < 12; i++) {
            System.out.print("\nDigite o signo: ");
            signo[i] = scanner.nextLine();
            System.out.print("Digite o último dia: ");
            ultdia[i] = scanner.nextInt();
            scanner.nextLine(); 
        }

        System.out.print("\nDigite a data no formato ddmm ou 9999 para terminar: ");
        int data = scanner.nextInt();
        while (data != 9999) {
            int dia = data / 100;
            int mes = data % 100 - 1;
            if (dia > ultdia[mes]) {
                mes = (mes + 1) % 12;
            }
            System.out.println("\nSigno: " + signo[mes] + "\n");

            System.out.print("Digite a data no formato ddmm ou 9999 para terminar: ");
            data = scanner.nextInt();
        }
        System.out.println();
        scanner.close();
    }
}
