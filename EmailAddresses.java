import javax.swing.JOptionPane;

public class EmailAddresses implements  interfaces.IValidate {

    @Override
    public void validate() {
        String text = JOptionPane
                .showInputDialog("Ingrese el texto que contiene las direcciones de correo electrónico:");
        Validator validator = new Validator("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}",
                "El correo electrónico ingresado es válido.",
                "El correo electrónico ingresado no es válido.");
        validator.validate(text);
    }
    
}
