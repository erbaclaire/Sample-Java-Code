public class Cons implements IUT {

    private int first;
    private IUT rest;

    public Cons(int first, IUT rest) {
        if (rest==null)
            throw new IllegalArgumentException("rest is null");
        this.first=first;
        this.rest=rest;
    }

    public Cons(int first) {
        this.first=first;
        this.rest=new Nil();
    }

    public boolean isEmpty() {
        return false;
    }

    public int first() {
        return this.first;
    }
    
    public IUT rest() {
        return this.rest;
    }

    public Integer maxItem() {
        if (this.rest.isEmpty())
            return this.first;
        if (this.first>this.rest.maxItem())
            return this.first;
        return this.rest.maxItem();
    }
    
    public Integer minItem() {
        if (this.rest.isEmpty())
            return this.first;
        if (this.first<this.rest.minItem())
            return this.first;
        return this.rest.minItem();
    }

    public boolean contains(int n) {
        return (this.first==n || this.rest.contains(n));
    }
    
    public int count(int n) {
        return this.first==n ? 1+this.rest.count(n) : this.rest.count(n);
    }

    public int length() {
            return 1 + this.rest.length();
    }

    public boolean isAsc() {
        return this.rest.isEmpty() ? true : (this.first<this.rest.first() && this.rest.isAsc()); 
    }

    public boolean isMonoIncr() {
        return this.rest.isEmpty() ? true :  (this.first<=this.rest.first() && this.rest.isMonoIncr());
    }

    public boolean isDesc() {
        return this.rest.isEmpty() ? true : (this.first>this.rest.first() && this.rest.isDesc());
    }

    public boolean isMonoDecr() {
        return this.rest.isEmpty() ? true : (this.first>=this.rest.first() && this.rest.isMonoDecr());
    }

    public boolean isMonotonic() {
        return (this.isMonoIncr() || this.isMonoDecr());
    }

    public IUT square() {
        return this.rest.isEmpty() ? new Cons(this.first*this.first) : new Cons(this.first*this.first, this.rest.square());
    }

    public IUT cube() {
        return this.rest.isEmpty() ? new Cons(this.first*this.first*this.first) : new Cons(this.first*this.first*this.first, this.rest.cube());
    }

    public IUT add(int n) {
        return this.rest.isEmpty() ? new Cons(this.first+n) : new Cons(this.first+n, this.rest.add(n));
    }

    public IUT keepAbove(int threshold) {
        if (this.rest.isEmpty() && this.first>threshold)
            return new Cons(this.first);
        if (this.rest.isEmpty())
            return new Nil();
        if (this.first>threshold)
            return new Cons(this.first,this.rest.keepAbove(threshold));
        return this.rest.keepAbove(threshold);
    }

    
    public IUT rejectAbove(int threshold) {
       if (this.rest.isEmpty() && this.first<=threshold)
            return new Cons(this.first);
        if (this.rest.isEmpty())
            return new Nil();
        if (this.first<=threshold)
            return new Cons(this.first,this.rest.rejectAbove(threshold));
        return this.rest.rejectAbove(threshold);
    }

    public IUT putlast(int n) {
        return this.rest.isEmpty() ? new Cons(this.first,new Cons(n)) : new Cons(this.first,this.rest.putlast(n));
    }
    
    public IUT append(IUT that) {
	if (that==null)
	    return this;
        return this.rest.isEmpty() ? new Cons(this.first,that) : new Cons(this.first,this.rest.append(that));
    }
    
    public IUT reverse() {
        if (this.rest.isEmpty())
            return new Cons(this.first);
        IUT mostOfReverse = new Cons(this.rest.reverse().first(), this.rest.reverse().rest());
        return mostOfReverse.putlast(this.first);
    }

    public boolean equals(Object o) {
        return o==null ? false : ((o instanceof IUT) && ((IUT)o).first()==this.first && ((IUT)o).rest().equals(this.rest));
    }

    public String toString() {
        return "(" + this.first + ")-" + this.rest;
    }
}
