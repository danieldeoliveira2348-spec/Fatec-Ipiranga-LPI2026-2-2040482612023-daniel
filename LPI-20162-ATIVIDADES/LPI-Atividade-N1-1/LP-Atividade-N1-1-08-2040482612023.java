import java.util.Scanner;

class LP_Atividade_N1_1_08_2040482612023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor total da compra em reais: ");
        double valorTotalReais = scanner.nextDouble();

        System.out.print("Informe o número de parcelas: ");
        int numeroParcelas = scanner.nextInt();

        long valorCentavos = Math.round(valorTotalReais * 100);
        long parcelaCentavos = valorCentavos / numeroParcelas;
        double valorExibicao = parcelaCentavos / 100.0;

        System.out.println("--- Calculadora Financeira Escalar (Mapeamento em Centavos) ---");
        System.out.println("Valor total convertido: " + valorCentavos + " centavos.");
        System.out.println("Divisão de R$" + String.format("%.2f", valorTotalReais) + " por " + numeroParcelas
                + " em centavos: " + parcelaCentavos + " centavos por parcela.");
        System.out.println("Valor convertido para exibição: R$ " + String.format("%.2f", valorExibicao));

        // Vantagens do Mapeamento Escalar (Inteiros/Centavos) vs. BigDecimal:
        // Vantagens:
        // 1. Desempenho computacional significativamente superior (operações primitivas
        // diretamente na CPU/ALU).
        // 2. Impossibilidade total de erros de arredondamento por ponto flutuante
        // durante a aritmética básica (soma/subtração).
        // 3. Menor ocupação de memória por usar tipos primitivos de tamanho fixo
        // (long/int).
        //
        // Desvantagens:
        // 1. Menor flexibilidade para lidar com frações de centavos ou moedas com casas
        // decimais variáveis (ex: taxas de câmbio).
        // 2. Risco de estouro de capacidade (Overflow) se o valor ultrapassar o limite
        // do tipo inteiro (Long.MAX_VALUE).
        // 3. Exige conversões manuais e cuidados constantes nas saídas para exibição
        // amigável ao usuário.
        // consultado em: https://www.devmedia.com.br/arredondando-numeros-em-java/28248

        scanner.close();
    }
}