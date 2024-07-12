package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Biografia {
    private JButton verHobbieButton;
    public JPanel PanelBiografia;
    private JTextPane BioText;

    public Biografia() {
        verHobbieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame3 = new JFrame();
                frame3.setTitle("Hobbie");
                frame3.setContentPane(new Hobbie().PanelHobbie);
                frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame3.setSize(400,300);
                frame3.setLocationRelativeTo(null);
                frame3.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(verHobbieButton)).dispose();
            }
        });
    }
}
