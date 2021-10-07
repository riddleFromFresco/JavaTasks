package tasks.task14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class QueueBasedGame extends Game {
    Queue<Character> player1Deck;
    Queue<Character> player2Deck;

    public QueueBasedGame() {
        player1Deck = new LinkedList<Character>();
        player2Deck = new LinkedList<Character>();
    }

    @Override
    ArrayList<String> getTestCards() {
        String cards1 = reverseStr("13579");
        String cards2 = reverseStr("24680");

        ArrayList<String> allCards = new ArrayList<String>();
        allCards.add(cards1);
        allCards.add(cards2);

        return allCards;
    }

    @Override
    void pushItemToDeckWithNum(int n, char item) {
        if (n == 1)
            player1Deck.add(item);
        else if (n == 2)
            player2Deck.add(item);

        else {
            String noDeckErrMsg = "Error: no deck with num " + item + ".";
            throw new java.lang.Error(noDeckErrMsg);
        }
    }

    @Override
    boolean areBothDecksEmpty() {
        return (player1Deck.isEmpty() && player2Deck.isEmpty());
    }

    @Override
    char getTopOfDeckWithNum(int num) {
        if ((num == 1) && !(player1Deck.isEmpty())) {
            return player1Deck.poll();
        }
        else if ((num == 2) && !(player2Deck.isEmpty()))
            return player2Deck.poll();

        throw new java.lang.Error("Error: unable to get top item of queue (queue is empty).");
    }

    @Override
    boolean isDeck1Empty() {
        return player1Deck.isEmpty();
    }

    @Override
    boolean isDeck2Empty() {
        return player2Deck.isEmpty();
    }

    @Override
    void pushUnderDeck(int deckNum, char card1, char card2) {
        Queue<Character> deck;

        if (deckNum == 1)
            deck = this.player1Deck;
        else if (deckNum == 2)
            deck = this.player2Deck;
        else
            return;

        deck.add(card1);
        deck.add(card2);
    }

    public static void main(String[] args) {
        QueueBasedGame game = new QueueBasedGame();
        game.start();
    }
}