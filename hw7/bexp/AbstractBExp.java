public abstract class AbstractBExp implements BExp {

    public boolean isTrueConst()  {return false;}
    public boolean isFalseConst() {return false;}

    public BExp getE1() {throw new UnsupportedOperationException();}
    public BExp getE2() {throw new UnsupportedOperationException();}

    public int size()         {return 1;}
    public int height()       {return 1;}

    public int numOperators() {return 0;}
    public int numConstants() {return 1;}

}
