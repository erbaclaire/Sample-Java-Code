public class Not extends AbstractBExp implements BExp {

    private BExp e1;

    public Not(BExp e1) {
	if (e1==null)
	    throw new IllegalArgumentException("e1 is null");
	this.e1=e1;
    }

    public BExp getE1() {
	return this.e1;
    }

    public int size() {
	return 1 + this.e1.size();
    }

    public int height() {
	return 1 + this.e1.height();
    }

    public int numOperators() {
	return 1 + this.e1.numOperators();
    }
    
    public int numConstants() {
	return this.e1.numConstants();
    }

    public String java() {
	return "(!" + this.e1.java() + ")";
    }

    public String python() {
	return "(not " + this.e1.python() + ")";
    }
    
    public BExp eval() {
	return this.e1.eval().isTrueConst() ? BE.FALSE : BE.TRUE;
    }
    
    public boolean sameResult(BExp that) {
	return this.eval().equals(that.eval());
    }
    
    public boolean equals(Object o) {
	if (o==null || !(o instanceof BExp))
	    return false;
	BExp that = (BExp)o;
	return (that instanceof Not) && this.e1.equals(that.getE1());
    }
    
    public String toString() {
	return this.java();
    }

}
