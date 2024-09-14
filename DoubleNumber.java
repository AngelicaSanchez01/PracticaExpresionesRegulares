
import javax.swing.JOptionPane;

public class DoubleNumber implements interfaces.IValidate {

    @Override
    public void validate() {
        String text = JOptionPane.showInputDialog("Ingrese el texto que contiene números en formato double:");
        Validator validator = new Validator("-?\\d+\\.\\d+",
                "El número double ingresado es válido.",
                "El número double ingresado no es válido.");
        validator.validate(text);
    }

}
