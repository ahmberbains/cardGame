public class HumanPlayer extends Player {

    // HumanPlayer instance variables

    // constructor(s)
    public HumanPlayer(String _name) {
        super(_name);
    } // constructor 

    // HumanPlayer methods/functions

    // overriding function;
    void doTurn(){
        super.doTurn();
        displayHand();
        pickCard();
    } // doTurn

    void pickCard(){
        try{
            String userInput = Main.input.nextLine();
            int i = Integer.parseInt(userInput);
            Card c = cardsInHand.get(i-1);
            if (!tryPlayCard(c)){
                System.out.println();
            }
        } catch (Exception e){
            System.out.println("Sorry, try again.");
            pickCard();
        }
    } //pickCard

} // end of class HumanPlayer