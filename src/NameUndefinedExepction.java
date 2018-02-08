public class NameUndefinedExepction extends Exception {
    public NameUndefinedExepction() {
        super("First name and last name can not be null or less then two letters.");
    }
}
