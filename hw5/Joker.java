public class Joker implements Card {
    public Rank getRank() {
        throw new UnsupportedOperationException("joker");
    }
    public Suit getSuit() {
        throw new UnsupportedOperationException("joker");
    }
    public boolean isJoker() {
        return true;
    }
    public boolean equals(Object o) {
        return ((o instanceof Card) && ((Card)o).isJoker());
    }
    public String toString() {
        return "joker";
    }
}
