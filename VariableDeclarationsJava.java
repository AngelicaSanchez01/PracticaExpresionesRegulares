
import javax.swing.JOptionPane;

public class VariableDeclarationsJava implements interfaces.IValidate {

    @Override
    public void validate() {
        String text = JOptionPane
                .showInputDialog("Ingrese el texto que contiene una declaración de variables en Java:");
        Validator validator = new Validator("(int|double|String) [a-zA-Z_][a-zA-Z0-9_]* = .*;",
                "La declaración de variable en Java es válida.",
                "La declaración de variable en Java no es válida.");
        validator.validate(text);
    }

}
