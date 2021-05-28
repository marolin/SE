import java.util.Scanner;

public class scan {
    public void checkconditionfield(String fieldsString, String labe) {
        if (fieldsString == null) {
            throw new NullPointerException("the argument is needed.");
        } else if (fieldsString.isEmpty() || fieldsString.isBlank()) {
            throw new IllegalArgumentException("the argument should not be blank.");
        }
    }
}
