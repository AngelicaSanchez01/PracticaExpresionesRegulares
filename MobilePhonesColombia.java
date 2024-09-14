import javax.swing.JOptionPane;

public class MobilePhonesColombia implements  interfaces.IValidate {
    @Override
    public void validate(){
         String text = JOptionPane
                .showInputDialog("Ingrese el texto que contiene los números de teléfonos celulares en Colombia:");
        Validator validator = new Validator("[3][0-9]{9}",
                "El número de teléfono celular ingresado es válido.",
                "El número de teléfono celular ingresado no es válido.");
        validator.validate(text);
    }
}
