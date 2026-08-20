// Justificativa: O laco 'do-while' foi utilizado pois o sistema deve obrigatoriamente solicitar o PIN ao menos
// uma vez antes de realizar a verificacao se a senha fornecida esta correta.

import java.util.Scanner;

public class LP_Atividade_N2_03_1234567890123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        public static final int PIN_CORRETO = 1234;

        int pinDigitado;
        int tentativas = 0;

        do {
            System.out.print("Informe o PIN de acesso: ");
            pinDigitado = scanner.nextInt();
            tentativas++;

            if (pinDigitado != PIN_CORRETO) {
                System.out.println("PIN incorreto. Tente novamente.");
            }
        } while (pinDigitado != PIN_CORRETO);

        System.out.println("Acesso concedido! Você utilizou " + tentativas + " tentativa(s).");

        scanner.close();
    }
}