import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Validator {

    private String inPattern;
    private String successMessage;
    private String errorMessage;

    public Validator(String pattern, String successMessage, String errorMessage) {
        this.inPattern = pattern;
        this.successMessage = successMessage;
        this.errorMessage = errorMessage;
    }

    public void validate(String text) {
        Pattern pattern = Pattern.compile(this.inPattern);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            JOptionPane.showMessageDialog(null, this.successMessage);
            System.out.println("Coincidence: " + matcher.group());
        } else {
            JOptionPane.showMessageDialog(null, this.errorMessage);
        }
    }

}
