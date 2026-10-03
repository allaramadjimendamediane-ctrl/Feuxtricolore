package org.example;

import javax.swing.*;
import java.awt.*;

public class InterfaceFeux extends JFrame {

    JLabel label;

    public InterfaceFeux() {

        setTitle("Feux Tricolores");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new FlowLayout());

        JButton vert = new JButton("🟢 Circulation");
        JButton orange = new JButton("🟠 Ralentir");
        JButton rouge = new JButton("🔴 Arrêter");

        label = new JLabel("Etat des feux");

        label.setFont(new Font("Arial", Font.BOLD, 25));

        add(vert);
        add(orange);
        add(rouge);
        add(label);

        vert.addActionListener(e -> {

            getContentPane().setBackground(Color.GREEN);

            label.setText("🟢 CIRCULATION");
        });

        orange.addActionListener(e -> {

            getContentPane().setBackground(Color.ORANGE);

            label.setText("🟠 RALENTIR");
        });

        rouge.addActionListener(e -> {

            getContentPane().setBackground(Color.RED);

            label.setText("🔴 ARRETER");
        });

        setVisible(true);
    }
}