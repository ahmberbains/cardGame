import java.util.HashMap;
import java.util.Random;

public class Main {

    // public main variables

    // we need a hashmap to associate each card number with its corresponding name.
    // to use a hashmap, you give the hashmap a "key" to associate with some value (this is called a put)

    public static HashMap<Integer, String> cardIdToName;
    // need a random variable
    public static Random rand;

    public static void main(String[] args) {
        mainInit();
        new Game();

    } // main 

    // Main methods/functions
    static void mainInit(){
        // initialize random variable
        rand = new Random();
        cardIdToName = new HashMap<>();
        cardIdToName.put(2, "2");
        cardIdToName.put(3, "3");
        cardIdToName.put(4, "4");
        cardIdToName.put(5, "5");
        cardIdToName.put(6, "6");
        cardIdToName.put(7, "7");
        cardIdToName.put(8, "8");
        cardIdToName.put(9, "9");
        cardIdToName.put(10, "10");
        cardIdToName.put(11, "Jack");
        cardIdToName.put(12, "Queen");
        cardIdToName.put(13, "King");
        cardIdToName.put(14, "Ace");
    } // mainInit

} // end of class Main