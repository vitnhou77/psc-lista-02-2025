import java.util.Scanner;

public class AT01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println("O número informado foi " + numero + ".");

        sc.close();
    }
}
