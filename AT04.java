import java.util.Scanner;

public class AT04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o preço do litro da gasolina: R$ ");
        double precoLitro = sc.nextDouble();

        System.out.print("Digite a quantidade de litros vendidos: ");
        double litros = sc.nextDouble();

        double valorTotal = precoLitro * litros;

        System.out.println("O valor a ser pago é: R$ " + valorTotal);

        sc.close();
    }
}
