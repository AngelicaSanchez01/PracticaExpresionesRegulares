
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int option;

        do {
            option = Menu();
            switch (option) {
                case 1 -> new CarPlates().validate();
                case 2 -> new LandlinePhonesMedellin().validate();
                case 3 -> new MobilePhonesColombia().validate();
                case 4 -> new ResidentialAddressesMedellin().validate();
                case 5 -> new EmailAddresses().validate();
                case 6 -> new DateFormat().validate();
                case 7 -> new HourFormat().validate();
                case 8 -> new IDCardsColombia().validate();
                case 9 -> new VariableDeclarationsJava().validate();
                case 10 -> new URLFormat().validate();
                case 11 -> new FirstAndLastNames().validate();
                case 12 -> new SecurePassword().validate();
                case 13 -> new DoubleNumber().validate();
                case 0 -> JOptionPane.showMessageDialog(null, "Saliendo del programa");
                default -> JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (option != 0);
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

}
