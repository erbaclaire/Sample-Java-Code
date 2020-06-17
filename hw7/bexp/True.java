public class True extends AbstractBExp implements BExp {

    public boolean isTrueConst() {
        return true;
    }
    
    public String java() {
        return "true";
    }

    public String python() {
        return "True";
    }

    public BExp eval() {
        return this;
    }
    
    public boolean sameResult(BExp that) {
        return that.eval().equals(this.eval());
    }
    
    public boolean equals(Object o) {
        if (o==null || !(o instanceof BExp))
            return false;
        BExp that = (BExp)o;
        return that.isTrueConst();
    }
    
    public String toString() {
        return this.java();
    }

}
