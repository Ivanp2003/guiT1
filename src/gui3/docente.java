package gui3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class docente extends JFrame{
    private JPanel docente;
    private JTextField nombre;
    private JTextField carrera;
    private JTextField materia;
    private JButton limpiar;

    public docente() {
        setTitle("Registro docentes");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(docente);
        setLocationRelativeTo(null);

        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombre.setText(" ");
                carrera.setText(" ");
                materia.setText(" ");
            }
        });
    }
}
