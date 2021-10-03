package tasks.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FootballTable extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;

    JButton milanBtn;
    JButton madridBtn;
    JLabel resultLbl;
    JLabel lastScorerLbl;
    JLabel winnerLbl;

    public FootballTable() {
        super("Match");
        setSize(500, 200);

        setLayout(new BorderLayout());

        initAllElements();

        setMilanBtn();
        setMadridBtn();
        addAllElementsToLayout();
    }

    void initAllElements(){
        this.milanBtn = new JButton("AC Milan");
        this.madridBtn = new JButton("Real Madrid");
        this.resultLbl = new JLabel("Result 0 X 0", SwingConstants.CENTER);
        this.lastScorerLbl = new JLabel("Last scorer: N/A", SwingConstants.CENTER);
        this.winnerLbl = new JLabel("Winner: DRAW", SwingConstants.CENTER);
    }

    void setMilanBtn() {
        milanBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                lastScorerLbl.setText("Last scorer: Milan");
                updateScore();
                displayWinner();
            }
        });
    }

    void setMadridBtn() {
        madridBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                lastScorerLbl.setText("Last scorer: Real Madrid");
                updateScore();
                displayWinner();
            }
        });
    }

    void updateScore() {
        resultLbl.setText("Result: " + Integer.toString(milanScore) + " X " + Integer.toString(madridScore));
    }

    void displayWinner() {
        if (milanScore > madridScore) {
            winnerLbl.setText("Winner: Milan");
        } else if (milanScore < madridScore) {
            winnerLbl.setText("Winner: Real Madrid");
        } else {
            winnerLbl.setText("DRAW");
        }
    }

    void addAllElementsToLayout() {
        add(winnerLbl, BorderLayout.NORTH);
        add(milanBtn, BorderLayout.WEST);
        add(resultLbl, BorderLayout.CENTER);
        add(madridBtn, BorderLayout.EAST);
        add(lastScorerLbl, BorderLayout.SOUTH);
    }
}

class FootballTableTest {
    public static void main(String[] args) {
        new FootballTable().setVisible(true);
    }
}