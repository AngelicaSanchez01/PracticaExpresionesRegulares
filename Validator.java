import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Validator {
    private String patron;
    private String mensajeExito;
    private String mensajeError;

    public Validator(String patron, String mensajeExito, String mensajeError) {
        this.patron = patron;
        this.mensajeExito = mensajeExito;
        this.mensajeError = mensajeError;
    }

    public void validar(String texto) {
        Pattern pattern = Pattern.compile(this.patron);
        Matcher matcher = pattern.matcher(texto);

        boolean hayCoincidencias = false;

        while (matcher.find()) {
            hayCoincidencias = true;
            System.out.println("Coincidencia: " + matcher.group());
        }

        if (hayCoincidencias) {
            JOptionPane.showMessageDialog(null, this.mensajeExito);
        } else {
            JOptionPane.showMessageDialog(null, this.mensajeError);
        }
    }
}