// Justificativa: O laco 'while' e o mais adequado pois a quantidade de vendas e desconhecida e existe a 
// possibilidade de o turno ser encerrado de imediato (0 vendas), devendo testar a condicao antes de processar.

import java.util.Scanner;
import java.util.Locale;

public class LP_Atividade_N2_02_1234567890123 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double totalVendido = 0.0;
        int quantidadeVendas = 0;

        System.out.print("Valor da venda (ou 0 para encerrar): ");
        double valorVenda = scanner.nextDouble();

        while (valorVenda != 0) {
            totalVendido += valorVenda;
            quantidadeVendas++;

            System.out.print("Valor da venda (ou 0 para encerrar): ");
            valorVenda = scanner.nextDouble();
        }

        if (quantidadeVendas > 0) {
            double valorMedio = totalVendido / quantidadeVendas;
            System.out.printf(Locale.US, "Total vendido no turno: R$ %.2f%n", totalVendido);
            System.out.println("Quantidade de vendas: " + quantidadeVendas);
            System.out.printf(Locale.US, "Valor médio por venda: R$ %.2f%n", valorMedio);
        } else {
            System.out.println("Nenhuma venda registrada nesta sessão de caixa.");
        }

        scanner.close();

        // para ver sobre Locale.US vi na fonte:
        // https://docs.oracle.com/javase/8/docs/api/java/util/Locale.html
    }
}