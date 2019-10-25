import java.util.Scanner;

public class NumberTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        int number = scanner.nextInt();

        System.out.println("Sum of this number is: " + Numbers.numbersSumCalculator(number));

    }
}
