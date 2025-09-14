import java.util.Scanner;

public class AT05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço da viagem para Alemanha (em R$): ");
        double precoAlemanha = sc.nextDouble();
        System.out.print("Digite a quantidade de pessoas que irão para Alemanha: ");
        int pessoasAlemanha = sc.nextInt();

        System.out.print("Digite o preço da viagem para Portugal (em R$): ");
        double precoPortugal = sc.nextDouble();
        System.out.print("Digite a quantidade de pessoas que irão para Portugal: ");
        int pessoasPortugal = sc.nextInt();

        System.out.print("Digite o preço da viagem para Itália (em R$): ");
        double precoItalia = sc.nextDouble();
        System.out.print("Digite a quantidade de pessoas que irão para Itália: ");
        int pessoasItalia = sc.nextInt();

        double totalAlemanha = precoAlemanha * pessoasAlemanha;
        double totalPortugal = precoPortugal * pessoasPortugal;
        double totalItalia = precoItalia * pessoasItalia;

        double valorTotal = totalAlemanha + totalPortugal + totalItalia;
        int totalPessoas = pessoasAlemanha + pessoasPortugal + pessoasItalia;

        System.out.println("\nResumo da Eurotrip:");
        System.out.println("Valor total Alemanha: R$ " + totalAlemanha);
        System.out.println("Valor total Portugal: R$ " + totalPortugal);
        System.out.println("Valor total Itália: R$ " + totalItalia);
        System.out.println("Total de pessoas: " + totalPessoas);
        System.out.println("Valor total geral da viagem: R$ " + valorTotal);

        sc.close();
    }
}
