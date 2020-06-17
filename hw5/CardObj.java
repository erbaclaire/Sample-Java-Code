public class CardObj implements Card {

    private Rank r;
    private Suit s;

    public CardObj(Rank r, Suit s) {
        if (r==null || s==null)
            throw new IllegalArgumentException("rank or suit is null");
        this.r=r;
        this.s=s;
    }

    public Rank getRank() {
        return this.r;
    }

    public Suit getSuit() {
        return this.s;
    }

    public boolean isJoker() {
        return false;
    }

    public boolean equals(Object o) {
        if (o==null)
            return false;
        if (! (o instanceof Card))
            return false;
        Card that = (Card)o;
        return this.getRank().equals(that.getRank()) && this.getSuit().equals(that.getSuit());
    }

    public String toString() {
        return "[" + this.r + "," + this.s + "]";
    }

}
