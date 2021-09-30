package tasks.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MouseEnters extends JFrame {
    public MouseEnters() {
        super("Mouse position");

        this.setLayout(new BorderLayout());

        setSize(400, 400);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JLabel northLabel = new JLabel("<html>This is<br>North");
        northLabel.setOpaque(true);
        northLabel.setBackground(new Color(255,255,255));
        northLabel.setHorizontalAlignment(JTextField.CENTER);

        JLabel eastLabel = new JLabel("ガチムチ/がちむち");
        eastLabel.setHorizontalAlignment(JTextField.CENTER);
        eastLabel.setOpaque(true);
        eastLabel.setBackground(new Color(240,143,144));

        JLabel southLabel = new JLabel("<html>Obama<br>was born here");
        southLabel.setHorizontalAlignment(JTextField.CENTER);
        southLabel.setOpaque(true);
        southLabel.setBackground(new Color(255,0,0));

        JLabel westLabel = new JLabel("Oww rotting west...");
        westLabel.setHorizontalAlignment(JTextField.CENTER);
        westLabel.setOpaque(true);
        westLabel.setBackground(new Color(128, 166, 255));

        JLabel centerLabel = new JLabel("RUSSIA");
        centerLabel.setHorizontalAlignment(JTextField.CENTER);
        centerLabel.setOpaque(true);
        centerLabel.setBackground(new Color(161, 161, 180));

        add(northLabel, BorderLayout.NORTH);
        add(eastLabel, BorderLayout.EAST);
        add(southLabel, BorderLayout.SOUTH);
        add(westLabel, BorderLayout.WEST);
        add(centerLabel, BorderLayout.CENTER);


        northLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "North");
            }
            @Override
            public void mouseExited(MouseEvent e) {}
        });
        eastLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "East");
            }
            @Override
            public void mouseExited(MouseEvent e) {}
        });
        southLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "South");
            }
            @Override
            public void mouseExited(MouseEvent e) {}
        });
        westLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "West");
            }
            @Override
            public void mouseExited(MouseEvent e) {}
        });
        centerLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Center");
            }
            @Override
            public void mouseExited(MouseEvent e) {}
        });
    }
}

class MouseEventsListener {
    public static void main(String[] args) {
        MouseEnters me = new MouseEnters();
        me.setVisible(true);
    }
}