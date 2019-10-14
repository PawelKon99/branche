import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void createUser(){

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

    public static void main(String[] args) {
        createUser();
    }
}
