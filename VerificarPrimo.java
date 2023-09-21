import java.util.Scanner;

public class VerificarPrimo {

    public static boolean Primo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            if (Primo(numero)) {
                System.out.println(numero + " é primo.");
            } else {
                System.out.println(numero + " não é primo.");
            }
        } else {
            System.out.println("Por favor, insira um número válido.");
        }
        scanner.close();
    }
}
