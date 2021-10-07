package tasks.task14;

import java.util.ArrayDeque;

class DequeBasedGame extends Game {
    ArrayDeque<Character> player1Deck;
    ArrayDeque<Character> player2Deck;

    public DequeBasedGame() {
        player1Deck = new ArrayDeque<Character>();
        player2Deck = new ArrayDeque<Character>();
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
            return player1Deck.pollLast();
        }
        else if ((num == 2) && !(player2Deck.isEmpty()))
            return player2Deck.pollLast();

        throw new java.lang.Error("Error: unable to get top item of deque (deque is empty).");
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
        ArrayDeque<Character> deck;

        if (deckNum == 1)
            deck = this.player1Deck;
        else if (deckNum == 2)
            deck = this.player2Deck;
        else
            return;

        deck.addFirst(card1);
        deck.addFirst(card2);
    }

    public static void main(String[] args) {
        DequeBasedGame game = new DequeBasedGame();
        game.start();
    }
}