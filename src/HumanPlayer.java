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
    } // doTurn

} // end of class HumanPlayer