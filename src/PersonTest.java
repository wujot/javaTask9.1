import java.util.Scanner;

public class PersonTest {

    public static void main(String[] args) {

        Person person = new Person();

        Scanner sc = new Scanner(System.in);

        System.out.println("Type first name: ");
        person.setFirstName(sc.nextLine());
        System.out.println("Type last name: ");
        person.setLastName(sc.nextLine());
        System.out.println("Type age: ");
        person.setAge(Integer.parseInt(sc.nextLine()));
        System.out.println("Type pesel: ");
        person.setPesel(Integer.parseInt(sc.nextLine()));

        sc.close();

        System.out.println(person.toString());
    }
}
