
import java.util.Scanner;

public class A490 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[10];
        
        for (int L = 0; L < 10; L++) {
            System.out.println("Digite uma palavra em letras minúsculas:");
            nome[L] = scanner.nextLine();
            int caracteresRemovidos = restantes(nome[L], nome[L].length(), 'c');
            System.out.println("Total de caracteres removidos: " + caracteresRemovidos);
        }
        
        for (int L = 0; L < 10; L++) {
            System.out.println((L + 1) + " - " + nome[L]);
        }
    }
    
    public static int restantes(String vet, int tam, char x) {
        int cont = 0;
        char[] caracteres = vet.toCharArray();
        for (int i = 0; i < tam; i++) {
            if (caracteres[i] == x) {
                caracteres[i] = '*';
                cont++;
            }
        }
        return cont;
    }
}
