import javax.swing.JOptionPane;

public class URLFormat implements  interfaces.IValidate {

    @Override
    public void validate() {
        String text = JOptionPane.showInputDialog("Ingrese el texto que contiene las URLs:");
        Validator validator = new Validator("https?://[\\w.-]+\\.[a-z]{2,6}",
                "La URL ingresada es válida.",
                "La URL ingresada no es válida.");
        validator.validate(text);
    }
    
}
