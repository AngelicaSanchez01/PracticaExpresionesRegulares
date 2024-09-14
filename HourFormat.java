import javax.swing.JOptionPane;

public class HourFormat implements  interfaces.IValidate {

    @Override
    public void validate() {
        String text = JOptionPane.showInputDialog("Ingrese el texto que contiene las horas en formato hh:mm:ss:");
        Validator validator = new Validator("\\d{2}:\\d{2}:\\d{2}",
                "La hora ingresada es válida.",
                "La hora ingresada no es válida.");
        validator.validate(text);
    }
    
}
