package tasks.task14;

import java.util.Stack;

public class InteractiveStackBasedGame extends Game {
    Stack<Character> player1Deck;
    Stack<Character> player2Deck;

    public InteractiveStackBasedGame() {
        player1Deck = new Stack<Character>();
        player2Deck = new Stack<Character>();
    }

    void drawCards(char value1, char value2) {
        String horizontalBorder = "+-----+";
        String verticalBorder = "|     |";

        System.out.println(horizontalBorder + "\t" + horizontalBorder);

        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                StringBuilder val1Line = new StringBuilder(verticalBorder);
                val1Line.setCharAt(3,  value1);
                StringBuilder val2Line = new StringBuilder(verticalBorder);
                val2Line.setCharAt(3,  value2);
                System.out.println(val1Line + "\t" + val2Line);
            }
            else
                System.out.println(verticalBorder + "\t" + verticalBorder);
        }
        System.out.println(horizontalBorder + "\t" + horizontalBorder);
    }

    @Override
    void pushItemToDeckWithNum(int n, char item) {
        if (n == 1)
            player1Deck.push(item);
        else if (n == 2)
            player2Deck.push(item);

        else {
            String noDeckErrMsg = "Error: no deck with num " + item + ".";
            throw new java.lang.Error(noDeckErrMsg);
        }
    }

    @Override
    void getWinner() {
        char cardOfPl1;
        char cardOfPl2;

        int i = 0;

        while (i < 106) {
            System.out.println("Step #" + i);

            if (areBothDecksEmpty()) {
                System.out.println("Error. Wrong card values.");
                System.exit(1);
            }

            else if (checkIfPl1WinsTheGame()) {
                System.out.println("First player won this game in " + String.valueOf(i) + " steps!!!");
                return;
            }

            else if (checkIfPl2WinsTheGame()) {
                System.out.println("Second player won this game in " + String.valueOf(i) + " steps!!!");
                return;
            }

            cardOfPl1 = getTopOfDeckWithNum(1);
            cardOfPl2 = getTopOfDeckWithNum(2);

            drawCards(cardOfPl1, cardOfPl2);

            if (checkIfPl1WinsInMove(cardOfPl1, cardOfPl2)) {
                pushUnderDeck(1, cardOfPl1, cardOfPl2);
                System.out.println("Player 1 won this move!");
            }
            else if (checkIfPl2WinsInMove(cardOfPl1, cardOfPl2)) {
                pushUnderDeck(2, cardOfPl2, cardOfPl1);
                System.out.println("Player 2 won this move!");
            }
            System.out.println("Player 1 have " + player1Deck.size() + " cards");
            System.out.println("Player 2 have " + player2Deck.size() + " cards");
            System.out.println("\n");
            i++;
        }
        printDraw();
    }

    @Override
    boolean areBothDecksEmpty() {
        return (player1Deck.empty() && player2Deck.empty());
    }

    @Override
    char getTopOfDeckWithNum(int num) {
        if ((num == 1) && !(player1Deck.empty()))
            return player1Deck.pop();
        else if ((num == 2) && !(player2Deck.empty()))
            return player2Deck.pop();

        throw new java.lang.Error("Error: unable to get top item of stack (stack is empty).");
    }

    @Override
    boolean isDeck1Empty() {
        return player1Deck.empty();
    }

    @Override
    boolean isDeck2Empty() {
        return player2Deck.empty();
    }

    void pushUnderDeck(int deckNum, char card1, char card2) {
        Stack<Character> deck;

        if (deckNum == 1)
            deck = this.player1Deck;
        else if (deckNum == 2)
            deck = this.player2Deck;
        else
            return;

        Stack<Character> temp = (Stack<Character>)deck.clone();

        deck.clear();

        deck.push(card2);
        deck.push(card1);

        deck.addAll(temp);
    }

    public static void main(String[] args) {
        InteractiveStackBasedGame game = new InteractiveStackBasedGame();
        game.start();
    }
}
