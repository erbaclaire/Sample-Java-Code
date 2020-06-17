public interface Card {
    public Rank getRank();
    public Suit getSuit();
    public boolean isJoker();
    // the following are not named in interfaces, typically, since they're assumed
    // public boolean equals(Object o);
    // public String toString();
}

