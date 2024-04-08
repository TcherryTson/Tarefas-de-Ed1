import java.util.Scanner;

public class A480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (isPalindrome(numero)) {
            System.out.println("O número é capicua.");
        } else {
            System.out.println("O número não é capicua.");
        }
    }
    
    public static boolean isPalindrome(int numero) {
        String numeroStr = String.valueOf(numero);
        int comprimento = numeroStr.length();
        
        for (int i = 0; i < comprimento / 2; i++) {
            if (numeroStr.charAt(i) != numeroStr.charAt(comprimento - 1 - i)) {
                return false;
            }
        }
        
        return true;
    }
}
