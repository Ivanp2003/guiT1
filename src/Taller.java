import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Taller extends JFrame {
    private JPanel taller;
    private JTextField nombre;
    private JTextField apellido;
    private JTextField direccion;
    private JTextField telefono;
    private JTextField nacimiento;
    private JTextField estatura;
    private JButton boton1;
    private JButton boton2;
    private JLabel resultado;

    public Taller() {
        setTitle("Taller");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(taller);
        setSize(500, 500);
        setVisible(true);

        // Acción del Botón 1: mostrar datos en JOptionPane
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String datos = obtenerDatos();
                JOptionPane.showMessageDialog(null, datos, "Datos Ingresados", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Acción del Botón 2: mostrar datos en JLabel
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String datos = obtenerDatos();
                resultado.setText("<html>" + datos.replaceAll("\n", "<br>") + "</html>");
            }
        });
    }

    // Metodo para recopilar todos los datos
    private String obtenerDatos() {
        return "Nombre: " + nombre.getText() + "\n" +
                "Apellido: " + apellido.getText() + "\n" +
                "Dirección: " + direccion.getText() + "\n" +
                "Teléfono: " + telefono.getText() + "\n" +
                "Nacimiento: " + nacimiento.getText() + "\n" +
                "Estatura: " + estatura.getText();
    }


}
