import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        number1 = scanner.nextInt();

        System.out.println("Informe o segundo número: ");
        number2 = scanner.nextInt();

        try {
            var result = number1 / number2;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("Divisor igual ou menor que 0");
        } finally {
            System.out.println("Programa finalizado!");
        }
    }
}