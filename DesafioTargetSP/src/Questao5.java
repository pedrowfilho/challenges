<<<<<<< HEAD
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String txtOriginal = scanner.nextLine();

        String txtInvertido = "";

        for (int i = txtOriginal.length() - 1; i >= 0; i--) {
            txtInvertido += txtOriginal.charAt(i);
        }

        System.out.println("Texto original: " + txtOriginal);
        System.out.println("Texto invertido: " + txtInvertido);

        scanner.close();
    }

}
=======
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String txtOriginal = scanner.nextLine();

        String txtInvertido = "";

        for (int i = txtOriginal.length() - 1; i >= 0; i--) {
            txtInvertido += txtOriginal.charAt(i);
        }

        System.out.println("Texto original: " + txtOriginal);
        System.out.println("Texto invertido: " + txtInvertido);

        scanner.close();
    }

}
>>>>>>> b6705379ff8dfe824885de3f3b1bbb1566417cb2