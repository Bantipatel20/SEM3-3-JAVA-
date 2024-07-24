import java.util.*;

public class p7_4 {
    public static void main(String[] args) {
        Person person = createPerson("23CS058");
        System.out.println("Person's name: " + person.name);
        System.out.println("This Practical is made by 23CS058-Banti Patel");
    }

    public static Person createPerson(String name) {
        return new Person(name);
    }
}
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}


