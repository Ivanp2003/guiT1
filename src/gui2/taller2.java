package gui2;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class taller2 extends JFrame{
    private JPanel taller2;
    private JTextField nombre;
    private JTextField apellido;
    private JTextField edad;
    private JTextField carrera;
    private JTextField nota1;
    private JTextField nota2;
    private JTextField nota3;
    private JButton calcular;
    private JButton limpiar;
    private JButton verDocente;

    public taller2() {
        setTitle("Registro estudiantes");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(taller2);
        setLocationRelativeTo(null);

        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //borrar
                nombre.setText(" ");
                apellido.setText(" ");
                edad.setText(" ");
                carrera.setText(" ");
                nota1.setText(" ");
                nota2.setText(" ");
                nota3.setText(" ");
            }
        });
        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double n1= Double.parseDouble(nota1.getText());
                Double n2= Double.parseDouble(nota2.getText());
                Double n3= Double.parseDouble(nota3.getText());

                Double promedio= (n1+n2+n3)/3;
                if(promedio>=4){
                    JOptionPane.showMessageDialog(null, "El estudiante se encuentra aprobado con un promedio de: " + promedio);
                }else{
                    JOptionPane.showMessageDialog(null, "El estudiante se encuentra reprobado con un promedio de: " + promedio);
                }
            }
        });

        verDocente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abrir formulario "docente"
                new gui3.docente().setVisible(true);
                dispose(); // Cierra esta ventana si no la necesitas abierta
            }
        });

    }
}


