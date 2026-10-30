import java.util.Scanner;

public class ConcatenarCadenas {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Dime tu nombre");
        String nombre= scanner.nextLine();

        System.out.println("Bienvenid@ " + nombre);

        scanner.close();
    }
}
