package tasks.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Random;

class GameFrame extends JFrame {
    JLabel rulesLabel;
    JTextField answerField;
    JButton okButton;
    GridBagLayout grid;
    GridBagConstraints gridCons;

    JLabel animLabel;

    int hiddenRandNum;
    int attemptsCounter;

    final String RULES_OF_GAME_TEXT = "Enter number between 0 and 20. You have only 3 attempts.";
    final String HIDDEN_IS_BIGGER_MESSAGE_TEXT = "You are wrong. The hidden number is bigger than the entered.";
    final String HIDDEN_IS_SMALLER_MESSAGE_TEXT = "You are wrong. The hidden number is less than the entered.";
    final String WIN_MESSAGE_TEXT = "You win!!!";
    final String GAME_OVER_MESSAGE_TEXT = "Game Over";

    final String DEFAULT_TITLE_TEXT = "Wanga simulator";
    final String CONGRATS_TITLE_TEXT = "Congratulations!!!";
    final String LOSS_TITLE_TEXT = "You lose";
    final String CONGRATS_GIF_PATH = "congratulations.gif";
    final String LOSER_GIF_PATH = "loser.gif";

    public GameFrame() throws IOException {
        initValues();
        setUpWindow();

        setUpGridItems();

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int enteredData = Integer.valueOf(answerField.getText());
                if (enteredData != 0) {
                    try {
                        printResult(enteredData);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
    }

    void initValues() {
        Random random = new Random();
        hiddenRandNum = random.nextInt(20);
        attemptsCounter = 0;
    }

    void setUpWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        setTitle(DEFAULT_TITLE_TEXT);
    }

    void setUpGridItems() {
        rulesLabel = new JLabel(RULES_OF_GAME_TEXT);

        answerField = new JTextField(10);
        setUpTextField();
        okButton = new JButton("OK");

        setGridLayout();
        addItemsToGrid();
    }

    void setUpTextField() {
        answerField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                String val = answerField.getText();
                int len = val.length();
                answerField.setEditable((e.getKeyChar() >= '0' && e.getKeyChar() <= '9') || e.getKeyChar() == '\b');
            }
        });

        answerField.setHorizontalAlignment(JTextField.CENTER);
    }

    void setGridLayout() {
        this.grid = new GridBagLayout();
        setLayout(grid);
    }

    void addItemsToGrid() {
        gridCons = new GridBagConstraints();

        setUpGrid(2, 0, 0.25);
        this.grid.setConstraints(rulesLabel, gridCons);
        add(rulesLabel);

        setUpGrid(2, 1, 0.25);
        this.grid.setConstraints(answerField, gridCons);
        add(answerField);

        setUpGrid(2, 2, 0.25);
        this.grid.setConstraints(okButton, gridCons);
        add(okButton);
    }

    void setUpGrid(int grw, int gry, double wy) {
        gridCons.gridwidth = grw;
        gridCons.gridy = gry;
        gridCons.weighty = wy;
    }

    void printResult(int enteredData) throws IOException {
        if (enteredData < hiddenRandNum)
            JOptionPane.showMessageDialog(null, HIDDEN_IS_BIGGER_MESSAGE_TEXT);
        else if (enteredData > hiddenRandNum)
            JOptionPane.showMessageDialog(null, HIDDEN_IS_SMALLER_MESSAGE_TEXT);
        else {
            JOptionPane.showMessageDialog(null, WIN_MESSAGE_TEXT);
            showCongrats();

            return;
        }

        attemptsCounter++;

        if (attemptsCounter > 2) {
            JOptionPane.showMessageDialog(null, GAME_OVER_MESSAGE_TEXT);
            showLoseScreen();
        }
    }

    void showCongrats() throws IOException {
        showResultScreen(CONGRATS_TITLE_TEXT, CONGRATS_GIF_PATH);
    }

    void showLoseScreen() throws IOException {
        showResultScreen(LOSS_TITLE_TEXT, LOSER_GIF_PATH);
    }

    void showResultScreen(String title, String pathToImage) {
        clearScreen();

        this.setTitle(title);
        Icon icon = new ImageIcon(pathToImage);

        animLabel = new JLabel(icon);
        this.getContentPane().add(animLabel);

        pack();
    }

    void clearScreen() {
        this.getContentPane().removeAll();
        this.repaint();

        setLayout(new FlowLayout());
    }
}

class GameTest {
    public static void main(String[] args) throws IOException {
        GameFrame f = new GameFrame();
        f.setVisible(true);
    }
}