import java.util.Scanner;

public class Vetor4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[15];
        int[] pr1 = new int[15];
        int[] pr2 = new int[15];
        int[] media = new int[15];
        String[] sit = new String[15];
        
      
        for (int L = 0; L <= 14; L++) {
            System.out.println("Digite o " + (L + 1) + "º nome:");
            nomes[L] = scanner.nextLine();
            
          
            while (nomes[L].length() > 30) {
                System.out.println("Nomes com até 30 caracteres.");
                System.out.println("Digite o " + (L + 1) + "º nome:");
                nomes[L] = scanner.nextLine();
            }
            
           
            int t = 30 - nomes[L].length();
            for (int c = 1; c <= t; c++) {
                nomes[L] += " ";
            }
            
           
            System.out.println("Digite a 1ª nota:");
            pr1[L] = scanner.nextInt();
            System.out.println("Digite a 2ª nota:");
            pr2[L] = scanner.nextInt();
            
            
            media[L] = (int) ((pr1[L] + pr2[L]) / 2 + 0.0001);
            if (media[L] >= 5) {
                sit[L] = "AP";
            } else {
                sit[L] = "RP";
            }
            
          
            scanner.nextLine();
        }
        
      
        System.out.println("RELACAO FINAL");
        for (int L = 0; L <= 14; L++) {
            System.out.println((L + 1) + " - " + nomes[L] + "\t" + pr1[L] + "\t" + pr2[L] + "\t" + media[L] + "\t" + sit[L]);
        }
    }
}
