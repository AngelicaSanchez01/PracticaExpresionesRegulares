import javax.swing.JOptionPane;

public class DateFormat implements  interfaces.IValidate {

    @Override
    public void validate() {
        String text = JOptionPane.showInputDialog("Ingrese el texto que contiene las fechas en formato dd/mm/aaaa:");
        Validator validator = new Validator("\\d{2}/\\d{2}/\\d{4}",
                "La fecha ingresada es válida.",
                "La fecha ingresada no es válida.");
        validator.validate(text);
    }
    
}
