public class AIPlayer extends Player {

    // AIPlayer instance variables

    // constructor(s)
    public AIPlayer(String _name) {
        super(_name);
    } // constructor 

    // AIPlayer methods/functions

    void doTurn() {
        super.doTurn();
        // name of player has x cards left
        System.out.printf("%s has %d cards left. \n", name, cardsInHand.size());
    } // doTurn

    void playCard() {
        for (Card c : cardsInHand) {
            if (tryPlayCard(c)) {
                System.out.printf("%s played %s \n", name, c.getCardName());
                return;
            }
        }
        getCardFromDeck();
    } // playCard

}// end of class AIPlayer