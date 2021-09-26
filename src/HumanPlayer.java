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

    void organizeHand(){

    } //organizeHand

    void pickCard(){
        try{
            System.out.println("Select the card you want to play or press n to take from the deck:");
            String userInput = Main.input.nextLine();
            if(userInput.equals("n")){
                getCardFromDeck();
                return;
            }
            int i = Integer.parseInt(userInput);
            Card c = cardsInHand.get(i-1);
            if (!tryPlayCard(c)){
                System.out.printf("The %s cannot go on the pile\n", c.getCardName());
                pickCard();
            }
        } catch (Exception e){
            System.out.println("Sorry, try again.");
            pickCard();
        }
    } //pickCard

} // end of class HumanPlayer