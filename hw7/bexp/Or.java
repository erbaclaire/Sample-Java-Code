public class Or extends AbstractBExp implements BExp {

    private BExp e1;
    private BExp e2;

    public Or(BExp e1,BExp e2) {
        if (e1==null || e2==null)
            throw new IllegalArgumentException("e1 or e2 is null");
        this.e1=e1;
        this.e2=e2;
    }

    public BExp getE1() {
        return this.e1;
    }

    public BExp getE2() {
        return this.e2;
    }
    
    public int size() {
        return 1 + this.e1.size() + this.e2.size();
    }

    public int height() {
        return this.e1.height()>this.e2.height() ? 1 + this.e1.height() : 1 + this.e2.height();
    }

    public int numOperators() {
        return 1 + this.e1.numOperators() + this.e2.numOperators();
    }
    
    public int numConstants() {
        return this.e1.numConstants() + this.e2.numConstants();
    }

    public String java() {
        return ("(" + this.e1.java() + " || " + this.e2.java() + ")");
    }

    public String python() {
        return ("(" + this.e1.python() + " or " + this.e2.python() + ")");
    }
    
    public BExp eval() {
        return (this.e1.eval().isFalseConst() && this.e2.eval().isFalseConst()) ? BE.FALSE : BE.TRUE;
    }
    
    public boolean sameResult(BExp that) {
        return this.eval().equals(that.eval());
    }
    
    public boolean equals(Object o) {
        if (o==null || !(o instanceof BExp))
            return false;
        BExp that = (BExp)o;
        return (that instanceof Or) &&
            ((this.e1.equals(that.getE1()) && this.e2.equals(that.getE2())) || (this.e1.equals(that.getE2()) && this.e2.equals(that.getE1())));
    }
    
    public String toString() {
        return this.java();
    }

}
