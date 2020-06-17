public interface Rational {
    public int getNum();
    public int getDenom();
    public double numApprox();
    public Rational recip();
    public Rational negate();
    public Rational plus(Rational that);
    public Rational minus(Rational that);
    public Rational times(Rational that);
    public Rational dividedBy(Rational that);
    public Rational max(Rational that);
    public Rational min(Rational that);
    public boolean same(Rational that);
    public boolean lessThan(Rational that);
    public boolean greaterThan(Rational that);
    public boolean isWhole();
    public String toString();
}
