public class Nil implements IUT {

    public boolean isEmpty() {
        return true;
    }

    public int first() {
        throw new UnsupportedOperationException("no first");
    }
    
    public IUT rest() {
        throw new UnsupportedOperationException("no rest");
    }

    public Integer maxItem() {
        return null;
    }
    
    public Integer minItem() {
        return null;
    }

    public boolean contains(int n) {
        return false;
    }
    
    public int count(int n) {
        return 0;
    }

    public int length() {
        return 0;
    }

    public boolean isAsc() {
        return true;
    }

    public boolean isMonoIncr() {
        return true;
    }

    public boolean isDesc() {
        return true;
    }

    public boolean isMonoDecr() {
        return true;
    }

    public boolean isMonotonic() {
        return true;
    }

    public IUT square() {
        return this;
    }

    public IUT cube() {
        return this;
    }

    public IUT add(int n) {
        return this;
    }

    public IUT keepAbove(int threshold) {
        return this;
    }
    
    public IUT rejectAbove(int threshold) {
        return this;
    }

    public IUT putlast(int n) {
        return new Cons(n);
    }
    
    public IUT append(IUT that) {
	if (that==null)
	    return this;
        return that;
    }
    
    public IUT reverse() {
        return this;
    }

    public boolean equals(Object o) {
        if (o==null)
            return false;
        return ((o instanceof IUT) && ((IUT)o).isEmpty());
    }

    public String toString() {
        return "nil";
    }
}
