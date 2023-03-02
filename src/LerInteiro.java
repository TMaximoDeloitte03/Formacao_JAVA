import java.util.InputMismatchException;
import java.util.Scanner;

public class LerInteiro {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void fecharScanner() {
        SCANNER.close();
    }

    public static int lerInteiro(int min, int max) {
        int num = -1;
        boolean erro;
        do {
            try {
                erro = false;
                if (SCANNER.hasNextInt()) {
                    num = SCANNER.nextInt();
                } else {
                    erro = true;
                    throw new InputMismatchException("Erro. Tem que introduzir um valor válido");
                }
                if (num < min || num > max) {
                    erro = true;
                    throw new InputMismatchException("Erro. Tem de inserir um valor entre " + min + " e " + max + "\n\nInsira: ");
                }
            } catch (Exception e) {
                erro = true;
                System.out.println(e.getMessage());
            }
            SCANNER.nextLine();
        } while (erro && num < min || num > max);
        return num;
    }
}
