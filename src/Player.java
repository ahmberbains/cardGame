import java.util.ArrayList;

public class Player {

    // Player instance variables
    String name;
    ArrayList<Card> cardsInHand = new ArrayList<>();

    // constructor(s)
    public Player(String _name) {
        name = _name;
    } // constructor 

    // Player methods/functions
    void doTurn(){
        System.out.printf("\nIt's %s's turn. \n", name);
        // notice the peek() function, same as pop except does not remove from stack
        System.out.printf("Card on pile: %s\n", Game.pile.peek().getCardName());
        System.out.println("------");
    }

    void displayHand(){
        for(int i=0; i < cardsInHand.size(); i++){
            System.out.printf("[%d] %s\n",i+1, cardsInHand.get(i).getCardName());
        }
    } // displayHand

} // end of class Player