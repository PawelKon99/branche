import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);


    public static void CreateUser(){

        String name, lastName;
        int age;

        System.out.println("Podaj imie: ");
        name = scanner.next();

        System.out.println("Podaj Nazwisko");
        lastName=scanner.next();

        System.out.println("Podaj wiek");
        age = scanner.nextInt();

        User user = new User(name,lastName,age);
        System.out.println("otworzono usera: " + user.toString());
    }

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
        CreateUser();
    }
}
