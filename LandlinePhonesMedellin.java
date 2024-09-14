
import javax.swing.JOptionPane;

public class LandlinePhonesMedellin implements interfaces.IValidate {

    @Override
    public void validate() {
        String text = JOptionPane
                .showInputDialog("Ingrese el texto que contiene los números de teléfonos fijos en Medellín:");
        Validator validator = new Validator("604[-]?[0-9]{7}",
                "El número de teléfono fijo ingresado es válido.",
                "El número de teléfono fijo ingresado no es válido.");
        validator.validate(text);
    }
}
