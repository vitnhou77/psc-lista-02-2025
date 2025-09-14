import java.util.Scanner;

public class AT03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a 1ª nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a 2ª nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a 3ª nota: ");
        double nota3 = sc.nextDouble();

        System.out.print("Digite a 4ª nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das notas é: " + media);

        sc.close();
    }
}
