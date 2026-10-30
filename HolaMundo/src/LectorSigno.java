import java.util.Scanner;

public class LectorSigno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un numero");
        int numero = scanner.nextInt();

        if (numero == 0) {
            System.out.println("Tu numero es 0");
        } else if (numero > 0) {
            System.out.println("Tu numero es positivo");
        } else {
            System.out.println("Tu numero es negativo");
        }

        scanner.close();
    }
}
