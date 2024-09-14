import javax.swing.JOptionPane;

public class FirstAndLastNames implements interfaces.IValidate {

    @Override
    public void validate() {
        String text = JOptionPane.showInputDialog("Ingrese el texto que contiene los nombres y apellidos:");
        Validator validator = new Validator("[A-ZÁÉÍÓÚÑ][a-záéíóúñ]+ [A-ZÁÉÍÓÚÑ][a-záéíóúñ]+",
                "El nombre y apellido ingresados son válidos.",
                "El nombre y apellido ingresados no son válidos.");
        validator.validate(text);
    }
    
}
