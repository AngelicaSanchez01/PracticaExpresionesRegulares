import javax.swing.JOptionPane;

public class IDCardsColombia implements interfaces.IValidate {
    @Override
    public void validate() {
        String text = JOptionPane.showInputDialog("Ingrese el texto que contiene las cédulas en Colombia:");
        Validator validator = new Validator("\\d{8,10}",
                "La cédula ingresada es válida.",
                "La cédula ingresada no es válida.");
        validator.validate(text);
    }
}
