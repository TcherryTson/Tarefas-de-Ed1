import java.util.Scanner;

public class A460 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            int dobroNumero = numeros[i] * 2;
            System.out.println("O dobro do " + (i + 1) + "º número é: " + dobroNumero);
        }
    }
}
