import java.util.Scanner;

public class Imprimimedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        float[] nt1 = new float[5];
        float[] nt2 = new float[5];
        float[] media = new float[5];

      
        for (int A = 0; A < 5; A++) {
            System.out.print("Digite o nome do aluno " + (A + 1) + ": ");
            nomes[A] = scanner.nextLine();
            System.out.print("Digite a nota 1 do aluno " + nomes[A] + ": ");
            nt1[A] = scanner.nextFloat();
            System.out.print("Digite a nota 2 do aluno " + nomes[A] + ": ");
            nt2[A] = scanner.nextFloat();
            scanner.nextLine(); 
            media[A] = (nt1[A] + nt2[A]) / 2;
        }

   
        System.out.println("\n RELACAO FINAL ");
        for (int A = 0; A < 5; A++) {
            System.out.println("\nAluno: " + nomes[A]);
            System.out.println("Nota 1: " + nt1[A]);
            System.out.println("Nota 2: " + nt2[A]);
            System.out.println("Média: " + media[A]);
        }
    }
}
