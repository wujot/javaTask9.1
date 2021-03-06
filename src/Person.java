public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int pesel;

    public Person() {}

    public Person(String firstName, String lastName, int age, int pesel) throws NameUndefinedExepction, IncorrectAgeException {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setPesel(pesel);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws NameUndefinedExepction {
        this.firstName = firstName;
        if (this.firstName == null || this.firstName.length() < 2) {
            throw new NameUndefinedExepction();
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NameUndefinedExepction {
        this.lastName = lastName;
        if (this.lastName == null || this.lastName.length() < 2) {
            throw new NameUndefinedExepction();
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException {
        this.age = age;
        if (this.age < 1) {
            throw new IncorrectAgeException();
        }
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel=" + pesel +
                '}';
    }
}
