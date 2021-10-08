package tasks.task14;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Game {
    void start() {
        ArrayList<String> allCards = getUserCards();
        fillDecks(allCards);

        getWinner();
    }

    ArrayList<String> getUserCards() {
        Scanner scanner = new Scanner(System.in);

        String cards1 = scanner.nextLine();
        String cards2 = scanner.nextLine();

        ArrayList<String> allCards = new ArrayList<String>();
        allCards.add(cards1);
        allCards.add(cards2);

        return allCards;
    }

    ArrayList<String> getTestCards() {
        String cards1 = "13579"; //reverse for queue
        String cards2 = "24680"; //reverse for queue

        ArrayList<String> allCards = new ArrayList<String>();
        allCards.add(cards1);
        allCards.add(cards2);

        return allCards;
    }

    String reverseStr(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    void fillDecks(ArrayList<String> allCards) {
        char[] str1 = reverseStr(allCards.get(0)).toCharArray();
        char[] str2 = reverseStr(allCards.get(1)).toCharArray();

        for (Character ch: str1)
            pushItemToDeckWithNum(1, ch);
        for (Character ch: str2)
            pushItemToDeckWithNum(2, ch);
    }

    abstract void pushItemToDeckWithNum(int n, char item);

    void getWinner() {
        char cardOfPl1;
        char cardOfPl2;

        int i = 0;

        while (i < 106) {
            if (areBothDecksEmpty()) {
                System.out.println("Error. Wrong card values.");
                System.exit(1);
            }

            else if (checkIfPl1WinsTheGame()) {
                System.out.println("first " + String.valueOf(i));
                return;
            }

            else if (checkIfPl2WinsTheGame()) {
                System.out.println("second " + String.valueOf(i));
                return;
            }

            cardOfPl1 = getTopOfDeckWithNum(1);
            cardOfPl2 = getTopOfDeckWithNum(2);

            if (checkIfPl1WinsInMove(cardOfPl1, cardOfPl2)) {
                pushUnderDeck(1, cardOfPl1, cardOfPl2);
            }
            else if (checkIfPl2WinsInMove(cardOfPl1, cardOfPl2)) {
                pushUnderDeck(2, cardOfPl2, cardOfPl1);
            }
            i++;
        }
        printDraw();
    }

    abstract boolean areBothDecksEmpty();

    boolean checkIfPl1WinsTheGame() {
        return isDeck2Empty();
    }

    boolean checkIfPl2WinsTheGame() {
        return isDeck1Empty();
    }

    abstract char getTopOfDeckWithNum(int num);

    abstract boolean isDeck1Empty();
    abstract boolean isDeck2Empty();

    boolean checkIfPl1WinsInMove(char cardOfPl1, char cardOfPl2) {
        return ((cardOfPl1 > cardOfPl2) && !(cardOfPl1 == '9' && cardOfPl2 == '0') ||
                (cardOfPl1 == '0' && cardOfPl2 == '9'));
    }

    boolean checkIfPl2WinsInMove(char cardOfPl1, char cardOfPl2) {
        return ((cardOfPl1 < cardOfPl2) && !(cardOfPl1 == '0' && cardOfPl2 == '9') ||
                (cardOfPl1 == '9' && cardOfPl2 == '0'));
    }

    abstract void pushUnderDeck(int deckNum, char card1, char card2);

    void printDraw() {
        System.out.println("botva");
    }
}

public class Task14 {
    public static void main(String[] args) {
        DoubleListBasedGame game = new DoubleListBasedGame();
        game.start();
    }
}