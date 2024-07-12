package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField UserDato;
    private JPasswordField ContraDato;
    private JButton ingresarButton;
    public JPanel PanelLogin;

    String usuario="Dennis Díaz";
    String contra="12345";
    public Login() {
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String user = UserDato.getText();
                String contra = ContraDato.getText();

                if(user.equals(usuario) && contra.equals(contra)){
                    JFrame frame2 = new JFrame();
                    frame2.setContentPane(new Biografia().PanelBiografia);
                    frame2.setTitle("Biografía");
                    frame2.setSize(500,300);
                    frame2.setLocationRelativeTo(null);
                    frame2.setVisible(true);
                    ((JFrame)   SwingUtilities.getWindowAncestor(ingresarButton)).dispose();
                }else{
                    JOptionPane.showMessageDialog(null,"Error de Credenciales. Ingrese de nuevo");
                    UserDato.setText("");
                    ContraDato.setText("");
                }
            }
        });
    }
}
