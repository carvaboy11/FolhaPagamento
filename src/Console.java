import java.util.Scanner;

public class Console {
    private static final Scanner scanner = new Scanner(System.in);

    public static String lerString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static float lerFloat(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextFloat()) {
            System.out.print("Entrada inválida! " + mensagem);
            scanner.next(); 
        }
        return scanner.nextFloat();
    }

    public static void fecharScanner() {
        scanner.close();
    }
}

