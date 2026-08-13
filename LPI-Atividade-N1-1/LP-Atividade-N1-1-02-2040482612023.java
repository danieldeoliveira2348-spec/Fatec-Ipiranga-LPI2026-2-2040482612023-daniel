import java.util.Scanner;

public class LP_Atividade_N1_1_02_2040482612023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor para comparação de primitivos: ");
        int valorPrimitivo = scanner.nextInt();

        System.out.print("Valor para comparação de objetos (new Integer): ");
        int valorObjeto = scanner.nextInt();

        System.out.print("Valor dentro do Integer Cache (-128 a 127): ");
        int valorCache = scanner.nextInt();

        System.out.print("Valor fora do Integer Cache: ");
        int valorForaCache = scanner.nextInt();

        int aPrimitivo = valorPrimitivo;
        int bPrimitivo = valorPrimitivo;

        Integer aObjeto = new Integer(valorObjeto);
        Integer bObjeto = new Integer(valorObjeto);

        Integer xCache = valorCache;
        Integer yCache = valorCache;

        Integer xForaCache = valorForaCache;
        Integer yForaCache = valorForaCache;

        System.out.println("--- Comparação de Primitivos (int) ---");
        System.out.println("aPrimitivo == bPrimitivo: " + (aPrimitivo == bPrimitivo));

        System.out.println("--- Comparação de Objetos via 'new Integer()' ---");
        System.out.println("aObjeto == bObjeto (Identidade): " + (aObjeto == bObjeto));
        System.out.println("aObjeto.equals(bObjeto) (Valor): " + aObjeto.equals(bObjeto));

        System.out.println("--- Comparação com Autoboxing e Integer Cache ---");
        System.out.println("Dentro do Cache (" + valorCache + ") -> xCache == yCache: " + (xCache == yCache));
        System.out.println("Fora do Cache (" + valorForaCache + ") -> xForaCache == yForaCache: " + (xForaCache == yForaCache));
        System.out.println("Fora do Cache (" + valorForaCache + ") -> xForaCache.equals(yForaCache): " + xForaCache.equals(yForaCache));

        scanner.close();
    }
}
