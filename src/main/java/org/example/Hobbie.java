package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hobbie {
    private JLabel ImageLabel;
    public JPanel PanelHobbie;
    private JButton regresarButton;

    ImageIcon imageIcon=new ImageIcon("C:\\Users\\PANCHITO\\IdeaProjects\\IMAGENES");
    JLabel imageLabel=new JLabel(imageIcon);

    public Hobbie() {
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame segundaV=new JFrame();
                segundaV.setTitle("Biografía");
                segundaV.setContentPane(new Biografia().PanelBiografia);
                segundaV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                segundaV.setSize(500,300);
                segundaV.setLocationRelativeTo(null);
                segundaV.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(regresarButton)).dispose();
            }
        });
    }
}
