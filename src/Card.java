public class Card {

    // enum = enumeration (kind of like a mini class - we're calling it Suit)
    public enum Suit {Hearts, Diamonds, Spades, Clubs}

    // Card instance variables
    int number;
    Suit suit;

    // constructor(s)
    public Card(int _number, Suit _suit) {
        number = _number;
        suit = _suit;
    } // constructor 

    // Card methods/functions
    String getCardName(){
        String cardName = Main.cardIdToName.get(number) + " of " + suit;
        return cardName;
    } // getCardName

} // end of class Card