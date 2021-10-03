package tasks.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFont extends JFrame {
    MenuBar menuBar = new MenuBar();
    Menu fontMenu = new Menu("Font");
    Menu colorSubMenu = new Menu("Color");
    Menu fontStyleSubMenu = new Menu("Font style");

    MenuItem tnr;
    MenuItem arial;
    MenuItem calibri;

    MenuItem white;
    MenuItem blue;
    MenuItem red;

    JTextArea ta;

    TextFont() {
        setUpWindow();
        setUpMenus();
        setUpColorItems();
        setUpFontStyles();

        createMenus();
        createFontColorListeners();
        createFontStyleListeners();

        setUpTextArea();

        add(ta, BorderLayout.CENTER);

        menuBar.add(fontMenu);
        this.setMenuBar(menuBar);

        this.setVisible(true);
    }

    void setUpWindow() {
        setSize(400, 400);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        setTitle("Text font");
    }

    void setUpMenus() {
        menuBar = new MenuBar();
        fontMenu = new Menu("Font");
        colorSubMenu = new Menu("Color");
        fontStyleSubMenu = new Menu("Font style");
    }

    void setUpColorItems() {
        white = new MenuItem("white");
        blue = new MenuItem("blue");
        red = new MenuItem("red");
    }

    void setUpFontStyles() {
        tnr = new MenuItem("times new roman");
        arial = new MenuItem("arial");
        calibri = new MenuItem("calibri");
    }

    void createMenus() {
        fontMenu.add(colorSubMenu);
        fontMenu.add(fontStyleSubMenu);

        colorSubMenu.add(white);
        colorSubMenu.add(blue);
        colorSubMenu.add(red);

        fontStyleSubMenu.add(tnr);
        fontStyleSubMenu.add(arial);
        fontStyleSubMenu.add(calibri);
    }

    void createFontColorListeners() {
        white.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setForeground(new Color(255, 255, 255));
            }
        });

        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setForeground(new Color(0, 0, 255));
            }
        });

        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setForeground(new Color(255, 0, 0));
            }
        });
    }

    void createFontStyleListeners() {
        tnr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setFont(new Font("times new roman", Font.BOLD, 20));
            }
        });

        arial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setFont(new Font("arial", Font.BOLD, 20));
            }
        });

        calibri.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setFont(new Font("calibri", Font.BOLD, 20));
            }
        });
    }

    void setUpTextArea() {
        ta = new JTextArea();
        ta.setBackground(new Color(0xB6B6C4));
        ta.setFont(new Font("arial", Font.PLAIN, 20));
    }
}

class TextFontTest {
    public static void main(String[] args) {
        TextFont tf = new TextFont();
    }
}