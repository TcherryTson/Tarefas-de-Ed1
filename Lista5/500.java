import java.util.Arrays;
import java.util.Scanner;

public class A500 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vetor vetorA = new Vetor(5);
        Vetor vetorB = new Vetor(5);
        boolean sair = false;

        while (!sair) {
            System.out.println("Menu:");
            System.out.println("1 - Digitar os dados do vetor A");
            System.out.println("2 - Digitar os dados do vetor B");
            System.out.println("3 - Imprimir os vetores");
            System.out.println("4 - Somar os vetores");
            System.out.println("5 - Subtrair os vetores");
            System.out.println("6 - Finalizar o programa");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite os elementos do vetor A:");
                    vetorA.lerDados(scanner);
                    break;
                case 2:
                    System.out.println("Digite os elementos do vetor B:");
                    vetorB.lerDados(scanner);
                    break;
                case 3:
                    System.out.println("Vetor A: " + vetorA);
                    System.out.println("Vetor B: " + vetorB);
                    break;
                case 4:
                    System.out.println("Soma dos vetores: " + vetorA.somar(vetorB));
                    break;
                case 5:
                    System.out.println("Subtração dos vetores: " + vetorA.subtrair(vetorB));
                    break;
                case 6:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}

class Vetor {
    private int[] elementos;

    public Vetor(int tamanho) {
        elementos = new int[tamanho];
    }

    public void lerDados(Scanner scanner) {
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = scanner.nextInt();
        }
    }

    public int[] somar(Vetor outro) {
        int[] resultado = new int[elementos.length];
        for (int i = 0; i < elementos.length; i++) {
            resultado[i] = this.elementos[i] + outro.elementos[i];
        }
        return resultado;
    }

    public int[] subtrair(Vetor outro) {
        int[] resultado = new int[elementos.length];
        for (int i = 0; i < elementos.length; i++) {
            resultado[i] = this.elementos[i] - outro.elementos[i];
        }
        return resultado;
    }

    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }
}
