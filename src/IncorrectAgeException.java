public class IncorrectAgeException extends Exception {
    public IncorrectAgeException() {
        super("Age can not be less then one year.");
    }
}
