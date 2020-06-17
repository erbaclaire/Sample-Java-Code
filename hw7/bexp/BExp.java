public interface BExp {

    public boolean isTrueConst();
    public boolean isFalseConst();

    public BExp getE1();
    public BExp getE2();

    public int size();
    public int height();

    public int numOperators();
    public int numConstants();

    public String java();
    public String python();

    public BExp eval();
    public boolean sameResult(BExp that);

    // public boolean equals(Object o);
    // public String toString();

}
