import java.util.Scanner;

class LP_Atividade_N1_1_01_2040482612023 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Idade do Aluno: ");
        byte idade = Byte.parseByte(scanner.nextLine());
        // byte: 8 bits | Intervalo: -128 a 127

        System.out.print("Número de Faltas: ");
        short faltas = Short.parseShort(scanner.nextLine());
        // short: 16 bits | Intervalo: -32768 a 32767

        System.out.print("Matrícula ID: ");
        int matriculaId = Integer.parseInt(scanner.nextLine());
        // int: 32 bits | Intervalo: -2147483648 a 2147483647

        System.out.print("Código Nacional do Estudante: ");
        long codigoNacional = Long.parseLong(scanner.nextLine());
        // long: 64 bits | Intervalo: -9223372036854775808 a 9223372036854775807

        System.out.print("Nota do Trabalho: ");
        float notaTrabalho = Float.parseFloat(scanner.nextLine());
        // float: 32 bits | Intervalo: 1.4E-45 a 3.4028235E38

        System.out.print("Nota da Prova Final: ");
        double notaProvaFinal = Double.parseDouble(scanner.nextLine());
        // double: 64 bits | Intervalo: 4.9E-324 a 1.7976931348623157E308

        System.out.print("Conceito Final do Aluno: ");
        char conceitoFinal = scanner.nextLine().charAt(0);
        // char: 16 bits | Intervalo: 0 a 65535

        System.out.print("Aluno está Aprovado (true/false): ");
        boolean aprovado = Boolean.parseBoolean(scanner.nextLine());
        // boolean: 2 estados lógicos (true e false)

        System.out.println("--- Dados do Aluno Fictício ---");
        System.out.println("Idade do Aluno: " + idade + " anos");
        System.out.println("Número de Faltas: " + faltas);
        System.out.println("Matrícula ID: " + matriculaId);
        System.out.println("Código Nacional do Estudante: " + codigoNacional);
        System.out.println("Nota do Trabalho: " + notaTrabalho);
        System.out.println("Nota da Prova Final: " + notaProvaFinal);
        System.out.println("Conceito Final do Aluno: " + conceitoFinal);
        System.out.println("Aluno está Aprovado? " + aprovado);

        // Os tamanhos em bits e os intervalos exibidos nos comentários acima foram
        // consultados
        // e obtidos através das estruturas das Wrapper Classes: Tipo.SIZE,
        // Tipo.MIN_VALUE e Tipo.MAX_VALUE.

        scanner.close();
    }
}