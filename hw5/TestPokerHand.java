import java.util.Arrays;

public class TestPokerHand {

    public static void main(String[] args) {
        
        //MAKE HANDS TO TEST
        //hand 0 - should throw an exception
        Card [] c0 = new CardObj[5];
        c0[0] = new CardObj(Rank.KING,Suit.SPADES);
        c0[1] = new CardObj(Rank.SEVEN,Suit.HEARTS);
        c0[2] = new CardObj(Rank.JACK,Suit.DIAMONDS);
        c0[3] = null;
        c0[4] = new CardObj(Rank.KING,Suit.DIAMONDS);
        try {
            PokerHand h0 = new PokerHandObj(c0);
        }
        catch (IllegalArgumentException e) {
            System.out.println("validates");
        }
        
        //hand 00 - should throw an exception
        Card [] c00 = new CardObj[4];
        c00[0] = new CardObj(Rank.NINE,Suit.SPADES);
        c00[1] = new CardObj(Rank.SEVEN,Suit.HEARTS);
        c00[2] = new CardObj(Rank.JACK,Suit.DIAMONDS);
        c00[3] = new CardObj(Rank.ACE,Suit.HEARTS);
        try {
            PokerHand h00 = new PokerHandObj(c00);
        }
        catch (IllegalArgumentException e) {
            System.out.println("validates");
        }

        //hand 000 - should throw an exception
        Card [] c000 = null;
        try {
            PokerHand h000 = new PokerHandObj(c000);
        }
        catch (IllegalArgumentException e) {
            System.out.println("validates");
        }
        
        //hand 1 - both three of a kind and pair - should return three of a kind
        Card [] c1 = new CardObj[5];
        c1[0] = new CardObj(Rank.KING,Suit.SPADES);
        c1[1] = new CardObj(Rank.SEVEN,Suit.HEARTS);
        c1[2] = new CardObj(Rank.JACK,Suit.DIAMONDS);
        c1[3] = new CardObj(Rank.KING,Suit.HEARTS);
        c1[4] = new CardObj(Rank.KING,Suit.DIAMONDS);
        PokerHand h1 = new PokerHandObj(c1);

        //hand 2 - both four of a kind, three of a kind, and pair - should return four of a kind
        Card [] c2 = new CardObj[5];
        c2[0] = new CardObj(Rank.JACK,Suit.HEARTS);
        c2[1] = new CardObj(Rank.FIVE,Suit.SPADES);
        c2[2] = new CardObj(Rank.JACK,Suit.CLUBS);
        c2[3] = new CardObj(Rank.JACK,Suit.SPADES);
        c2[4] = new CardObj(Rank.JACK,Suit.DIAMONDS);
        PokerHand h2 = new PokerHandObj(c2);

        //hand 3 - should return flush
        Card [] c3 = new CardObj[5];
        c3[0] = new CardObj(Rank.QUEEN,Suit.SPADES);
        c3[1] = new CardObj(Rank.TWO,Suit.SPADES);
        c3[2] = new CardObj(Rank.SEVEN,Suit.SPADES);
        c3[3] = new CardObj(Rank.NINE,Suit.SPADES);
        c3[4] = new CardObj(Rank.JACK,Suit.SPADES);
        PokerHand h3 = new PokerHandObj(c3);

        //hand 4 - should return straight
        Card [] c4 = new CardObj[5];
        c4[0] = new CardObj(Rank.FIVE,Suit.CLUBS);
        c4[1] = new CardObj(Rank.THREE,Suit.SPADES);
        c4[2] = new CardObj(Rank.SEVEN,Suit.HEARTS);
        c4[3] = new CardObj(Rank.FOUR,Suit.DIAMONDS);
        c4[4] = new CardObj(Rank.SIX,Suit.SPADES);
        PokerHand h4 = new PokerHandObj(c4);

        //hand 5 - should return straight
        Card [] c5 = new CardObj[5];
        c5[0] = new CardObj(Rank.JACK,Suit.CLUBS);
        c5[1] = new CardObj(Rank.ACE,Suit.SPADES);
        c5[2] = new CardObj(Rank.TEN,Suit.HEARTS);
        c5[3] = new CardObj(Rank.KING,Suit.DIAMONDS);
        c5[4] = new CardObj(Rank.QUEEN,Suit.SPADES);
        PokerHand h5 = new PokerHandObj(c5);

        //hand 6 - straight flush, flush, and straight - should return straight flush
        Card [] c6 = new CardObj[5];
        c6[0] = new CardObj(Rank.NINE,Suit.CLUBS);
        c6[1] = new CardObj(Rank.JACK,Suit.CLUBS);
        c6[2] = new CardObj(Rank.TEN,Suit.CLUBS);
        c6[3] = new CardObj(Rank.EIGHT,Suit.CLUBS);
        c6[4] = new CardObj(Rank.QUEEN,Suit.CLUBS);
        PokerHand h6 = new PokerHandObj(c6);

        //hand 7 - royal flush, straight flush, flush, and straight - should return royal flush
        Card [] c7 = new CardObj[5];
        c7[0] = new CardObj(Rank.KING,Suit.DIAMONDS);
        c7[1] = new CardObj(Rank.JACK,Suit.DIAMONDS);
        c7[2] = new CardObj(Rank.TEN,Suit.DIAMONDS);
        c7[3] = new CardObj(Rank.ACE,Suit.DIAMONDS);
        c7[4] = new CardObj(Rank.QUEEN,Suit.DIAMONDS);
        PokerHand h7 = new PokerHandObj(c7);

        //hand 8 - both pair and two pair - should return two pair
        Card [] c8 = new CardObj[5];
        c8[0] = new CardObj(Rank.FIVE,Suit.CLUBS);
        c8[1] = new CardObj(Rank.QUEEN,Suit.SPADES);
        c8[2] = new CardObj(Rank.SEVEN,Suit.HEARTS);
        c8[3] = new CardObj(Rank.FIVE,Suit.DIAMONDS);
        c8[4] = new CardObj(Rank.QUEEN,Suit.DIAMONDS);
        PokerHand h8 = new PokerHandObj(c8);

        //hand 9 - should return pair
        Card [] c9 = new CardObj[5];
        c9[0] = new CardObj(Rank.NINE,Suit.HEARTS);
        c9[1] = new CardObj(Rank.JACK,Suit.DIAMONDS);
        c9[2] = new CardObj(Rank.TWO,Suit.SPADES);
        c9[3] = new CardObj(Rank.NINE,Suit.DIAMONDS);
        c9[4] = new CardObj(Rank.ACE,Suit.SPADES);
        PokerHand h9 = new PokerHandObj(c9);

        //hand 10 - should return nothing
        Card [] c10 = new CardObj[5];
        c10[0] = new CardObj(Rank.KING,Suit.HEARTS);
        c10[1] = new CardObj(Rank.JACK,Suit.DIAMONDS);
        c10[2] = new CardObj(Rank.TWO,Suit.SPADES);
        c10[3] = new CardObj(Rank.NINE,Suit.DIAMONDS);
        c10[4] = new CardObj(Rank.ACE,Suit.SPADES);
        PokerHand h10 = new PokerHandObj(c10);

        //hand 11 - unfair hand - should throw an exception
        Card [] c11 = new CardObj[5];
        c11[0] = new CardObj(Rank.NINE,Suit.HEARTS);
        c11[1] = new CardObj(Rank.JACK,Suit.DIAMONDS);
        c11[2] = new CardObj(Rank.TWO,Suit.SPADES);
        c11[3] = new CardObj(Rank.NINE,Suit.HEARTS);
        c11[4] = new CardObj(Rank.ACE,Suit.SPADES);
        PokerHand h11 = new PokerHandObj(c11);

        //hand 12 - full house, three of a kind, and a pair - should return full house
        Card [] c12 = new CardObj[5];
        c12[0] = new CardObj(Rank.ACE,Suit.HEARTS);
        c12[1] = new CardObj(Rank.ACE,Suit.DIAMONDS);
        c12[2] = new CardObj(Rank.QUEEN,Suit.SPADES);
        c12[3] = new CardObj(Rank.ACE,Suit.CLUBS);
        c12[4] = new CardObj(Rank.QUEEN,Suit.DIAMONDS);
        PokerHand h12 = new PokerHandObj(c12);

        //hand 13 - full house, three of a kind, and a pair - should return full house
        Card [] c13 = new CardObj[5];
        c13[0] = new CardObj(Rank.ACE,Suit.HEARTS);
        c13[1] = new CardObj(Rank.ACE,Suit.DIAMONDS);
        c13[2] = new CardObj(Rank.QUEEN,Suit.SPADES);
        c13[3] = new CardObj(Rank.QUEEN,Suit.CLUBS);
        c13[4] = new CardObj(Rank.QUEEN,Suit.DIAMONDS);
        PokerHand h13 = new PokerHandObj(c13);

        //hand 14 - unfair hand - should throw an exception
        Card [] c14 = new CardObj[5];
        c14[0] = new CardObj(Rank.NINE,Suit.HEARTS);
        c14[1] = new CardObj(Rank.NINE,Suit.DIAMONDS);
        c14[2] = new CardObj(Rank.TWO,Suit.SPADES);
        c14[3] = new CardObj(Rank.NINE,Suit.HEARTS);
        c14[4] = new CardObj(Rank.ACE,Suit.SPADES);
        PokerHand h14 = new PokerHandObj(c14);

        //hand 15 - both pair and two pair - should return two pair
        Card [] c15 = new CardObj[5];
        c15[0] = new CardObj(Rank.NINE,Suit.CLUBS);
        c15[1] = new CardObj(Rank.QUEEN,Suit.SPADES);
        c15[2] = new CardObj(Rank.SEVEN,Suit.HEARTS);
        c15[3] = new CardObj(Rank.NINE,Suit.DIAMONDS);
        c15[4] = new CardObj(Rank.QUEEN,Suit.DIAMONDS);
        PokerHand h15 = new PokerHandObj(c15);

        //hand 16 - both pair and two pair - should return two pair
        Card [] c16 = new CardObj[5];
        c16[0] = new CardObj(Rank.NINE,Suit.CLUBS);
        c16[1] = new CardObj(Rank.QUEEN,Suit.SPADES);
        c16[2] = new CardObj(Rank.KING,Suit.HEARTS);
        c16[3] = new CardObj(Rank.NINE,Suit.DIAMONDS);
        c16[4] = new CardObj(Rank.QUEEN,Suit.DIAMONDS);
        PokerHand h16 = new PokerHandObj(c16);

        //hand 17 - random
        Card [] c17 = new CardObj[5];
        c17[0] = new CardObj(Rank.FOUR,Suit.HEARTS);
        c17[1] = new CardObj(Rank.QUEEN,Suit.SPADES);
        c17[2] = new CardObj(Rank.TWO,Suit.HEARTS);
        c17[3] = new CardObj(Rank.KING,Suit.CLUBS);
        c17[4] = new CardObj(Rank.ACE,Suit.SPADES);
        PokerHand h17 = new PokerHandObj(c17);
        
        //TEST
        System.out.println("h17 cards: " + Arrays.toString(h17.getCards()));
        System.out.println("h17 unfair?: " + h17.unfair());
        System.out.println("h17 classify: " + h17.classify());
	System.out.println("h17 equals: " + h17.equals(h1));
	System.out.println("h17 equals: " + h17.equals(h17));
	System.out.println("h17 equals: " + h17.equals(new NVLineObj(6,7)));
        
        System.out.println("h1 cards: " + Arrays.toString(h1.getCards()));
        System.out.println("h1 unfair?: " + h1.unfair());
        System.out.println("h1 classify: " + h1.classify());
        
        System.out.println("h2 cards: " + Arrays.toString(h2.getCards()));
        System.out.println("h2 unfair?: " + h2.unfair());
        System.out.println("h2 classify: " + h2.classify());

        System.out.println("h3 cards: " + Arrays.toString(h3.getCards()));
        System.out.println("h3 unfair?: " + h3.unfair());
        System.out.println("h3 classify: " + h3.classify());

        System.out.println("h4 cards: " + Arrays.toString(h4.getCards()));
        System.out.println("h4 unfair?: " + h4.unfair());
        System.out.println("h4 classify: " + h4.classify());

        System.out.println("h5 cards: " + Arrays.toString(h5.getCards()));
        System.out.println("h5 unfair?: " + h5.unfair());
        System.out.println("h5 classify: " + h5.classify());

        System.out.println("h6 cards: " + Arrays.toString(h6.getCards()));
        System.out.println("h6 unfair?: " + h6.unfair());
        System.out.println("h6 classify: " + h6.classify());

        System.out.println("h7 cards: " + Arrays.toString(h7.getCards()));
        System.out.println("h7 unfair?: " + h7.unfair());
        System.out.println("h7 classify: " + h7.classify());

        System.out.println("h8 cards: " + Arrays.toString(h8.getCards()));
        System.out.println("h8 unfair?: " + h8.unfair());
        System.out.println("h8 classify: " + h8.classify());

        System.out.println("h9 cards: " + Arrays.toString(h9.getCards()));
        System.out.println("h9 unfair?: " + h9.unfair());
        System.out.println("h9 classify: " + h9.classify());

        System.out.println("h10 cards: " + Arrays.toString(h10.getCards()));
        System.out.println("h10 unfair?: " + h10.unfair());
        System.out.println("h10 classify: " + h10.classify());

        System.out.println("h11 cards: " + Arrays.toString(h11.getCards()));
        System.out.println("h11 unfair?: " + h11.unfair());
        try {
            System.out.println("h11 classify: " + h11.classify());
        }
        catch (IllegalArgumentException e) {
            System.out.println("h11 classify: this is an illegal hand and cannot be classified");
        }

        System.out.println("h12 cards: " + Arrays.toString(h12.getCards()));
        System.out.println("h12 unfair?: " + h12.unfair());
        System.out.println("h12 classify: " + h12.classify());

        System.out.println("h13 cards: " + Arrays.toString(h13.getCards()));
        System.out.println("h13 unfair?: " + h13.unfair());
        System.out.println("h13 classify: " + h13.classify());

        System.out.println("h14 cards: " + Arrays.toString(h14.getCards()));
        System.out.println("h14 unfair?: " + h14.unfair());
        try {
            System.out.println("h14 classify: " + h14.classify());
        }
        catch (IllegalArgumentException e) {
            System.out.println("h14 classify: this is an illegal hand and cannot be classified");
        }

        System.out.println("h15 cards: " + Arrays.toString(h15.getCards()));
        System.out.println("h15 unfair?: " + h15.unfair());
        System.out.println("h15 classify: " + h15.classify());

        System.out.println("h16 cards: " + Arrays.toString(h16.getCards()));
        System.out.println("h16 unfair?: " + h16.unfair());
        System.out.println("h16 classify: " + h16.classify());
    }
}
        
