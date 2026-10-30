import java.util.Scanner;

public class LeerDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame un numero");

        int numero = scanner.nextInt();
        System.out.println("numero = " + numero);

        scanner.close();


    }
}
