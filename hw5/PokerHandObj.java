import java.util.Arrays;

public class PokerHandObj implements PokerHand {

    private Card[] cards;

    public PokerHandObj(Card[] cards) {
        if (cards==null)
            throw new IllegalArgumentException("cards in null");
        for (Card c: cards)
            if (c==null)
                throw new IllegalArgumentException("card is null");
        if (cards.length!=5)
            throw new IllegalArgumentException("hand is not five cards");
        //note: sort cards here for it to be easier in later methods
        Card[] temp = new Card[1];
        //sort rank
        for (int i=0;i<5;i++) {
            for (int j=i+1;j<5;j++) {
                if (cards[i].getRank().ordinal()>cards[j].getRank().ordinal()) {
                    temp[0]=cards[i];
                    cards[i]=cards[j];
                    cards[j]=temp[0];   
                }
            }
	}
	//sort suit for unfair method
	for (int i=0;i<5;i++) {
            for (int j=i+1;j<5;j++) {
                if (cards[i].getRank().ordinal()==cards[j].getRank().ordinal()) {
                    if (cards[i].getSuit().ordinal()>cards[j].getSuit().ordinal()) {
                        temp[0]=cards[i];
                        cards[i]=cards[j];
                        cards[j]=temp[0];
                    }
                }
            }
        }
        this.cards=cards;
    }

    public Card[] getCards() {
        return this.cards;
    }

    //note: only needs to check the first four cards because fifth card is implicitly checked
    public boolean unfair() {
        for (int i=0;i<4;i++)
            if (this.cards[i].equals(this.cards[i+1]))
                    return true;
        return false;
    }

    public HandType classify() {
        if (this.unfair()) //note: if it is an unfair hand then it is NOTHING
            throw new IllegalArgumentException("cheating hand - not classified");
        if (this.isRoyalFlush())
            return HandType.ROYAL_FLUSH;
        if (this.isStraightFlush())
            return HandType.STRAIGHT_FLUSH;
        if (this.isFourOfKind())
            return HandType.FOUR_OF_A_KIND;
        if (this.isFullHouse())
            return HandType.FULL_HOUSE;
        if (this.isFlush())
            return HandType.FLUSH;
        if (this.isStraight())
            return HandType.STRAIGHT;
        if (this.isThreeOfKind())
            return HandType.THREE_OF_A_KIND;
        if (this.isTwoPair())
            return HandType.TWO_PAIR;
        if (this.isPair())
            return HandType.PAIR;
        return HandType.NOTHING;
    }
            

    //PRIVATE METHODS
    //note: only needs to check the first four cards because fifth card is implicitly checked
    private boolean isPair() {
        for (int i=0;i<4;i++)
            if (this.cards[i].getRank().equals(this.cards[i+1].getRank()))
                return true;
        return false;
    }

    //note: only needs to check the first two cards because rest of cards are checked in the loop
    private boolean isTwoPair() {
        for (int i=0;i<2;i++) {
            if (this.cards[i].getRank().equals(this.cards[i+1].getRank())
                && !this.cards[i].getRank().equals(this.cards[i+2].getRank())) {
                if (this.cards[i+2].getRank().equals(this.cards[i+3].getRank())) {
                    return true;
                }
                if (this.cards[i+3].getRank().equals(this.cards[i+4].getRank())) {
                    return true;
                }
            }
        }       
        return false;
    }
    
    //note: only needs to check the first three cards because fourth and fifth cards are implicitly checked
    private boolean isThreeOfKind() {
        for (int i=0;i<3;i++)
            if (this.cards[i].getRank().equals(this.cards[i+1].getRank())
                && this.cards[i].getRank().equals(this.cards[i+2].getRank()))
                return true;
        return false;
    }
    
    //note: only needs to check the first four cards because fifth card is implicitly checked
    private boolean isStraight() {
        //make sure 10,J,Q,K,A is accepted as an answer
        if (this.cards[0].getRank().equals(Rank.ACE) && this.cards[1].getRank().equals(Rank.TEN) && this.cards[2].getRank().equals(Rank.JACK)
            && this.cards[3].getRank().equals(Rank.QUEEN) && this.cards[4].getRank().equals(Rank.KING))
            return true;
        for (int i=0;i<4;i++)
            if (this.cards[i].getRank().ordinal()!=(this.cards[i+1].getRank().ordinal())-1)
                return false;
        return true;
    }
            
    private boolean isFlush() {
        Suit s = this.cards[0].getSuit();
        for(int i=1;i<5;i++)
            if (! (this.cards[i].getSuit().equals(s)))
                return false;
        return true;
    }

    //note: only needs to check the first card because rest of cards are checked in the loop
    private boolean isFullHouse() {
        for (int i=0;i<1;i++) {
            if (this.cards[i].getRank().equals(this.cards[i+1].getRank())
                && !this.cards[i].getRank().equals(this.cards[i+2].getRank())) {
                if (this.cards[i+2].getRank().equals(this.cards[i+3].getRank())
                    && this.cards[i+3].getRank().equals(this.cards[i+4].getRank())) {
                    return true;
                }
            }
            if (this.cards[i].getRank().equals(this.cards[i+1].getRank())
                && this.cards[i].getRank().equals(this.cards[i+2].getRank())
                && !this.cards[i].getRank().equals(this.cards[i+3].getRank())) {
                if (this.cards[i+3].getRank().equals(this.cards[i+4].getRank())) {
                    return true;
                }
            }
        }
        return false;                                           
    }
    
    //note: only needs to check the first two cards because third, fourth and fifth card are implicitly checked
    private boolean isFourOfKind() {
        for (int i=0;i<2;i++)
            if (this.cards[i].getRank().equals(this.cards[i+1].getRank())
                && this.cards[i].getRank().equals(this.cards[i+2].getRank())
                && this.cards[i].getRank().equals(this.cards[i+3].getRank()))
                return true;
        return false;
    }

    private boolean isStraightFlush() {
        return this.isFlush() && this.isStraight();
    }

    private boolean isRoyalFlush() {
        return this.isStraightFlush() && this.cards[0].getRank().equals(Rank.ACE) && this.cards[4].getRank().equals(Rank.KING);
    }
    
    public boolean equals(Object o) {
	if (o==null)
	    return false;
	if (!(o instanceof PokerHand))
	    return false;
	PokerHand that = (PokerHand)o;
	for (int i=0;i<5;i++)
	    if (this.cards[i]!=that.getCards()[i])
		return false;
	return true;
    }

}
                
   
        
        
