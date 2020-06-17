public class False extends AbstractBExp implements BExp {

    public boolean isFalseConst() {
        return true;
    }
    
    public String java() {
        return "false";
    }

    public String python() {
        return "False";
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
        return that.isFalseConst();
    }
    
    public String toString() {
        return this.java();
    }

}
