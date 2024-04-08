import java.util.Scanner;

public class Enq85 { 
    public static void main(String[] args) {    
          Scanner scanner = new Scanner(System.in);
          System.out.println("MENU");
          System.out.println("1 - Imprime o comprimento da frase ");
          System.out.println("2 - Imprime os dois primeiros e os dois últimos caracteres da frase");
          System.out.println("3 - Imprime a frase espelhada ");
          System.out.println("4 - Termina o algoritmo");
          System.out.println("OPÇÃO");
        int opcao = scanner.nextInt();
        if(opcao == 1){
            System.out.println("Digite uma frase: ");
            Scanner cf = new Scanner(System.in);
            String fr = cf.nextLine();
            System.out.println("O comprimento é: " + fr.length());
        }else if(opcao == 2){
            System.out.println("Digite uma frase: ");
            Scanner pu = new Scanner(System.in);
            String fr = pu.nextLine();
            System.out.println("Oo dois primeiros são: " + fr.substring(0 , 2));
            int tam = fr.length();
            System.out.println("os dois útlimos são: " + fr.substring(tam -2) );
        } else if(opcao == 3){
        System.out.println("Digite uma frase: ");
        Scanner fe = new Scanner(System.in);
        String fr = fe.nextLine();
        System.out.println("A frase espelhada é: " + new StringBuilder(fr).reverse().toString());
        } else if( opcao == 4){
            System.out.println("Progama encerrado!");
        }else{
            System.out.println("Opção invalida!");
        }
    }
}
