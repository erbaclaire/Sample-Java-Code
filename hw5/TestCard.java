public class TestCard {

    public static void main(String[] args) {
	/*
	try {
	    Card c0 = new CardObj(Rank.WOAH,Suit.HEARTS);
	}
	catch (Exception e) {
	    System.out.println("c0: is invalid");
	}
	try {
	    Card c00 = new CardObj(Rank.TEN,Suit.LOOPS);
	}
	catch (Exception e) {
	    System.out.println("c00: is invalid");
	}
	*/
	try {
	    Card c000 = new CardObj(null,Suit.SPADES);
	}
	catch (Exception e) {
	    System.out.println("c000: is invalid");
	}
	Card c1 = new CardObj(Rank.ACE,Suit.HEARTS);
	Card c2 = new CardObj(Rank.SIX,Suit.SPADES);
	Card c3 = new Joker();
	

	System.out.println("c1 rank: " + c1.getRank());
	System.out.println("c1 suit: " + c1.getSuit());
	System.out.println("c1 is joker?: " + c1.isJoker());
	System.out.println("c1 is equal?: " + c1.equals(c1));
	System.out.println("c1 is equal?: " + c1.equals(c2));
	//System.out.println("c1 is equal?: " + c1.equals(c3));

	//tests
	try {
	    System.out.println("c3 rank: " + c3.getRank());
	}
	catch (Exception e) {
	    System.out.println("joker: no rank");
	}
	try {
	    System.out.println("c3 suit: " + c3.getSuit());
	}
	catch (Exception e) {
	    System.out.println("joker: no suit");
	}
	System.out.println("c3 is joker?: " + c3.isJoker());
	System.out.println("c3 is equal?: " + c3.equals(new Joker()));
	System.out.println("c3 is equal?: " + c3.equals(c2));
    }
}
