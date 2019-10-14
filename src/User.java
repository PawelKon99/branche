public class User {

    private String name;
    private String lastName;
    private int age;

    public User(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String toString(){
        return "imie: "+name+"nazwisko: "+lastName+"wiek: " + age;
    }
}
