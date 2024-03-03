import java.util.Scanner;

public class Procuranome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomes[] = new String[5];
        
        for (int L = 0; L < 5; L++) {
            System.out.println("Digite o nome da pessoa " + (L + 1) + ": ");
            nomes[L] = scanner.nextLine();
        }
        
        System.out.println("Digite o número da pessoa: ");
        int numeroPessoa = scanner.nextInt();
        
        while (numeroPessoa < 1 || numeroPessoa > 5) {
            System.out.println("Número fora do intervalo!");
            System.out.println("Digite o número de outra pessoa:");
            numeroPessoa = scanner.nextInt();
        }
        
        System.out.println("Nome da pessoa " + numeroPessoa + ": " + nomes[numeroPessoa - 1]);
    }
}
