import java.util.Scanner;

class LP_Atividade_N1_1_04_2040482612023 {

    public static final String NOME_INSTITUICAO = "FATEC Ipiranga";
    public static final int PRAZO_MAXIMO_DIAS = 14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de dias do empréstimo: ");
        final int diasEmprestimo = scanner.nextInt();

        // Tentativa de reatribuição a uma variável final gera erro de compilação:
        // diasEmprestimo = 20; // Erro: cannot assign a value to final variable
        // diasEmprestimo

        final int diasCalculados = calcularDiasDevolucao(diasEmprestimo);

        System.out.println("Instituição: " + NOME_INSTITUICAO);
        System.out.println("Prazo Máximo Padrão: " + PRAZO_MAXIMO_DIAS + " dias.");
        System.out.println("Dias calculados para devolução: " + diasCalculados);

        scanner.close();
    }

    public static int calcularDiasDevolucao(final int dias) {
        if (dias > PRAZO_MAXIMO_DIAS) {
            return PRAZO_MAXIMO_DIAS;
        }
        return dias;
    }
}