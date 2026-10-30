import java.util.Scanner;

public class RegistroGmail {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        int edad = scanner.nextInt();

        scanner.close();
        if (edad > 14){
            System.out.println("Puedes crear una cuenta");
    }
        else {
            System.out.println("Eres menor de 14, pide ayuda a un adulto");
        }

    }
}
