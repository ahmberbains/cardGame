import java.util.ArrayList;
import java.util.Stack;
public class Game {

    // Game instance variables
    // to add items to a stack we use push()
    // to remove we use pop()
    // we always push/pop to the top of the stack
    public static Stack<Card> deck = new Stack<>();
    public static Stack<Card> pile = new Stack<>();
    ArrayList<Player> players = new ArrayList<>();
    int nCardsPerPlayer = 7;

    // constructor(s)
    public Game() {
        // initializing the deck
        createDeck();
        shuffleDeck();
        // initializing the players and dealing cards
        players.add(new Player("Steve"));
        players.add(new Player("Stacy"));
        handOutCards();
        // start pile, by taking the top card from deck and putting it on the pile
        pile.push(deck.pop()); // we can do both in one line
        // start the game
        while(true){
            for(Player p: players){
                p.doTurn();
                if(p.cardsInHand.size() == 0){
                    System.out.printf("%s won! Let's have a party.\n", p.name);
                    return;
                }
            }
        }

    } // constructor 

    // Game methods/functions

    void handOutCards(){
        for(int i=0; i < players.size(); i++){
            Player p = players.get(i);
        }
        for(Player p : players){
            for(int i=0; i < nCardsPerPlayer; i++){
                Card topCard = deck.pop();
                p.cardsInHand.add(topCard);
            }
        }

    } // handOutCards

    void shuffleDeck(){
        // loop over every card in the deck
        // for each card, choose a random card and swap
        for (int i=0; i < deck.size(); i++){
            Card currentCard = deck.get(i);
            int r = Main.rand.nextInt(deck.size());
            Card randomCard = deck.get(r);
            deck.set(i, randomCard);
            deck.set(r, currentCard);
        }
    }

    void createDeck(){
        for(int i=2; i <= 14; i++){
            /*
            Card hearts = new Card(i,Card.Suit.Hearts);
            Card diamonds = new Card(i,Card.Suit.Diamonds);
            Card spades = new Card(i,Card.Suit.Spades);
            Card clubs = new Card(i,Card.Suit.Clubs);
            System.out.println(hearts.getCardName());
            System.out.println(diamonds.getCardName());
            System.out.println(spades.getCardName());
            System.out.println(clubs.getCardName());
             */
            deck.push(new Card(i,Card.Suit.Hearts));
            deck.push(new Card(i,Card.Suit.Diamonds));
            deck.push(new Card(i,Card.Suit.Spades));
            deck.push(new Card(i,Card.Suit.Clubs));
        }
    }

    void printDeck(){
        for (int i=0; i < deck.size(); i++){
            Card currentCard = deck.get(i); // access element from a stack
            System.out.println(currentCard.getCardName());
        }
    } // printDeck

} // end of class Game