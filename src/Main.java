import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void Calculate(){

        int x,y;

        System.out.println("Podaj pierwsza liczbe");
        x = scanner.nextInt();

        System.out.println("Podaj druga liczbe");
        y=scanner.nextInt();

        System.out.println("Dodawanie: " + Calculator.add(x,y));
        System.out.println("Odejmowanie: " + Calculator.subtract(x,y));
        System.out.println("Mnozenie: " + Calculator.multiply(x,y));
        System.out.println("Dzielenie: " + Calculator.divide(x,y));
    }

    public static void main(String[] args) {
        Calculate();
    }
}
