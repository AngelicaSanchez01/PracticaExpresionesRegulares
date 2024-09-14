import javax.swing.JOptionPane;

public class ResidentialAddressesMedellin implements  interfaces.IValidate {
    @Override
    public void validate() {
        String text = JOptionPane
                .showInputDialog("Ingrese el texto que contiene las direcciones residenciales en Medellín:");
        Validator validator = new Validator("Calle|Carrera [0-9]+[A-Z]?[ ]?# [0-9]+[-][0-9]+",
                "La dirección residencial ingresada es válida.",
                "La dirección residencial ingresada no es válida.");
        validator.validate(text);
    }
}
