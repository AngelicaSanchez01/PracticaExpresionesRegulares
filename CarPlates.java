
import javax.swing.JOptionPane;

public class CarPlates implements interfaces.IValidate {

    @Override
    public void validate() {
        String text = JOptionPane.showInputDialog("Ingrese el texto que contiene las placas de carros:");
        Validator validator = new Validator("[A-Z]{3}+[ |-]+[0-9]{2,3}+",
                "La placa ingresada es válida.",
                "La placa ingresada no es válida.");
        validator.validate(text);
    }

}
