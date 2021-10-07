package tasks.task14;

import java.util.Stack;

class StackBasedGame extends Game {
    Stack<Character> player1Deck;
    Stack<Character> player2Deck;

    public StackBasedGame() {
        player1Deck = new Stack<Character>();
        player2Deck = new Stack<Character>();
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
        StackBasedGame game = new StackBasedGame();
        game.start();
    }
}
