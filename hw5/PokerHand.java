public interface PokerHand {
    public Card[] getCards();
    public boolean unfair(); // return true if hand contains duplicates
    public HandType classify(); // classify the hand as its *best* hand type
}
