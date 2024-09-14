import javax.swing.JOptionPane;

public class SecurePassword implements  interfaces.IValidate {

    @Override
    public void validate() {
        String text = JOptionPane.showInputDialog("Ingrese el texto que contiene las contraseñas seguras:");
        Validator validator = new Validator("(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}",
                "La contraseña ingresada es válida.",
                "La contraseña ingresada no es válida.");
        validator.validate(text);
    }
    
}
