import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int opcion;

        do {
            opcion = Menu();
            switch (opcion) {
                case 1:
                    PlacasCarro();
                    break;
                case 2:
                    TelefonosFijosMedellin();
                    break;
                case 3:
                    TelefonosCelularesColombia();
                    break;
                case 4:
                    DireccionesResidencialesMedellin();
                    break;
                case 5:
                    CorreosElectronicos();
                    break;
                case 6:
                    FechaFormato();
                    break;
                case 7:
                    HoraFormato();
                    break;
                case 8:
                    CedulasColombia();
                    break;
                case 9:
                    DeclaracionVariablesJava();
                    break;
                case 10:
                    URLFormato();
                    break;
                case 11:
                    NombresApellidos();
                    break;
                case 12:
                    ContraseñaSegura();
                    break;
                case 13:
                    CodigoDouble();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opcion != 0);
    }

    public static int Menu() {
        return Integer.parseInt(JOptionPane.showInputDialog("***Menu Principal***\n\n"
                + "Ingrese la opción para la expresión regular que deseas probar \n\n"
                + "1. Placas de carro en Colombia \n"
                + "2. Números de teléfonos fijos en Medellín \n"
                + "3. Números de teléfonos celulares en Colombia\n"
                + "4. Direcciones Residenciales en Medellín\n"
                + "5. Correos electrónicos\n"
                + "6. Fecha en formato dd/mm/aaaa\n"
                + "7. Hora en formato hh:mm:ss\n"
                + "8. Cédulas en Colombia\n"
                + "9. Declaración de variables en Java\n"
                + "10. URL\n"
                + "11. Nombres y apellidos con tildes y ñ\n"
                + "12. Contraseña segura\n"
                + "13. Código formato para representar un número double\n"
                + "0. Salir\n"));
    }

    // Métodos para cada opción del menú con entrada de texto personalizada por el
    // usuario
    public static void PlacasCarro() {
        String texto = JOptionPane.showInputDialog("Ingrese el texto que contiene las placas de carros:");
        Validator validador = new Validator("[A-Z]{3}+[ |-]+[0-9]{2,3}+",
                "La placa ingresada es válida.",
                "La placa ingresada no es válida.");
        validador.validar(texto);
    }

    public static void TelefonosFijosMedellin() {
        String texto = JOptionPane
                .showInputDialog("Ingrese el texto que contiene los números de teléfonos fijos en Medellín:");
        Validator validador = new Validator("604[-]?[0-9]{7}",
                "El número de teléfono fijo ingresado es válido.",
                "El número de teléfono fijo ingresado no es válido.");
        validador.validar(texto);
    }

    public static void TelefonosCelularesColombia() {
        String texto = JOptionPane
                .showInputDialog("Ingrese el texto que contiene los números de teléfonos celulares en Colombia:");
        Validator validador = new Validator("[3][0-9]{9}",
                "El número de teléfono celular ingresado es válido.",
                "El número de teléfono celular ingresado no es válido.");
        validador.validar(texto);
    }

    public static void DireccionesResidencialesMedellin() {
        String texto = JOptionPane
                .showInputDialog("Ingrese el texto que contiene las direcciones residenciales en Medellín:");
        Validator validador = new Validator("Calle|Carrera [0-9]+[A-Z]?[ ]?# [0-9]+[-][0-9]+",
                "La dirección residencial ingresada es válida.",
                "La dirección residencial ingresada no es válida.");
        validador.validar(texto);
    }

    public static void CorreosElectronicos() {
        String texto = JOptionPane
                .showInputDialog("Ingrese el texto que contiene las direcciones de correo electrónico:");
        Validator validador = new Validator("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}",
                "El correo electrónico ingresado es válido.",
                "El correo electrónico ingresado no es válido.");
        validador.validar(texto);
    }

    public static void FechaFormato() {
        String texto = JOptionPane.showInputDialog("Ingrese el texto que contiene las fechas en formato dd/mm/aaaa:");
        Validator validador = new Validator("\\d{2}/\\d{2}/\\d{4}",
                "La fecha ingresada es válida.",
                "La fecha ingresada no es válida.");
        validador.validar(texto);
    }

    public static void HoraFormato() {
        String texto = JOptionPane.showInputDialog("Ingrese el texto que contiene las horas en formato hh:mm:ss:");
        Validator validador = new Validator("\\d{2}:\\d{2}:\\d{2}",
                "La hora ingresada es válida.",
                "La hora ingresada no es válida.");
        validador.validar(texto);
    }

    public static void CedulasColombia() {
        String texto = JOptionPane.showInputDialog("Ingrese el texto que contiene las cédulas en Colombia:");
        Validator validador = new Validator("\\d{8,10}",
                "La cédula ingresada es válida.",
                "La cédula ingresada no es válida.");
        validador.validar(texto);
    }

    public static void DeclaracionVariablesJava() {
        String texto = JOptionPane
                .showInputDialog("Ingrese el texto que contiene una declaración de variables en Java:");
        Validator validador = new Validator("(int|double|String) [a-zA-Z_][a-zA-Z0-9_]* = .*;",
                "La declaración de variable en Java es válida.",
                "La declaración de variable en Java no es válida.");
        validador.validar(texto);
    }

    public static void URLFormato() {
        String texto = JOptionPane.showInputDialog("Ingrese el texto que contiene las URLs:");
        Validator validador = new Validator("https?://[\\w.-]+\\.[a-z]{2,6}",
                "La URL ingresada es válida.",
                "La URL ingresada no es válida.");
        validador.validar(texto);
    }

    public static void NombresApellidos() {
        String texto = JOptionPane.showInputDialog("Ingrese el texto que contiene los nombres y apellidos:");
        Validator validador = new Validator("[A-ZÁÉÍÓÚÑ][a-záéíóúñ]+ [A-ZÁÉÍÓÚÑ][a-záéíóúñ]+",
                "El nombre y apellido ingresados son válidos.",
                "El nombre y apellido ingresados no son válidos.");
        validador.validar(texto);
    }

    public static void ContraseñaSegura() {
        String texto = JOptionPane.showInputDialog("Ingrese el texto que contiene las contraseñas seguras:");
        Validator validador = new Validator("(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}",
                "La contraseña ingresada es válida.",
                "La contraseña ingresada no es válida.");
        validador.validar(texto);
    }

    public static void CodigoDouble() {
        String texto = JOptionPane.showInputDialog("Ingrese el texto que contiene números en formato double:");
        Validator validador = new Validator("-?\\d+\\.\\d+",
                "El número double ingresado es válido.",
                "El número double ingresado no es válido.");
        validador.validar(texto);
    }
}
