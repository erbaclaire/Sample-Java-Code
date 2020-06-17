public class RationalObj implements Rational {

    //instance variables
    private int n;
    private int d;

    //private method
    private int gcd(int a, int b) {
	if (b == 0) {
	    return a;
	}
	else {
	    return gcd(b,a%b);
	}
    }
    
    //constructor
    public RationalObj(int n, int d) {

	//validation
	if (d == 0) {
	    throw new IllegalArgumentException ("divides by 0");
	}
	else {
	    
	    //standardize 0 to be 0/1.
	    if (n == 0) {
		d = 1;
	    }
	    
	    //reduce
	    int g = gcd(n,d);
	    n = n/g;
	    d = d/g;
	    
	    //standardize positive and negatives
	    //note: this can be done in one line but just separating here to make clear.
	    if (n < 0 && d < 0) {
		n = -n;
		d = -d;
	    }
	    if (n > 0 && d < 0) {
		n = -n;
		d = -d;
	    }
	}

	this.n = n;
	this.d = d;
    }

    //methods
    //note: putting values in a new RationalObj(int n, int d) will automatically canonicalize the representation as defined in the constructor.
    public int getNum() {
	return this.n;
    }

    public int getDenom() {
	return this.d;
    }

    public double numApprox() {
	return (double) this.n/(double) this.d; //note: do not need the ("double") for this.d.
    }

    public Rational recip() {
	Rational reciprocal = new RationalObj(this.d, this.n);
	return reciprocal;
    }

    public Rational negate() {
	Rational neg = new RationalObj(-this.n, this.d);
	return neg;
    }

    public Rational plus(Rational that) {
	int numAdd = (this.n*that.getDenom()) + (that.getNum()*this.d);
	int denAdd = this.d*that.getDenom();
	Rational add = new RationalObj(numAdd, denAdd);
	return add;
    }

    public Rational minus(Rational that) {
	int numSub = (this.n*that.getDenom()) - (that.getNum()*this.d);
	int denSub = this.d*that.getDenom();
	Rational sub = new RationalObj(numSub, denSub);
	return sub;
    }

    public Rational times(Rational that) {
	int numMult = this.n*that.getNum();
	int denMult = this.d*that.getDenom();
	Rational mult = new RationalObj(numMult, denMult);
	return mult;
    }

    public Rational dividedBy(Rational that) {
	int numDiv = this.n*that.getDenom();
	int denDiv = this.d*that.getNum();
	Rational div = new RationalObj(numDiv, denDiv);
	return div;
    }

    public Rational max(Rational that) {
	int thisNum = this.n*that.getDenom();
	int thatNum = that.getNum()*this.d;
	if (thisNum > thatNum) {
	    return this;
	}
	if (thisNum < thatNum) {
	    return that;
	}
	else {
	    return that; //that is, if the two are equal return "that"; returning "this" would be fine, as well, since they are the same if they are equal.
	}
    }

    public Rational min(Rational that) {
	int thisNum = this.n*that.getDenom();
	int thatNum = that.getNum()*this.d;
	if (thisNum > thatNum) {
	    return that;
	}
	if (thisNum < thatNum) {
	    return this;
	}
	else { 
	    return that; //that is, if the two are equal return "that"; returning "this" would be fine, as well, since they are the same if they are equal.
	}
    }

    //note: "this" and "that" are already reduced to lowest form, so can compare num and den immediately.
    public boolean same(Rational that) {
	return (this.n == that.getNum() && this.d == that.getDenom());
    }

    public boolean lessThan(Rational that) {
	int thisNum = this.n*that.getDenom();
	int thatNum = that.getNum()*this.d;
	return thisNum < thatNum;
    }

    public boolean greaterThan(Rational that) {
	int thisNum = this.n*that.getDenom();
	int thatNum = that.getNum()*this.d;
	return thisNum > thatNum;
    }

    //note: since "this" is reduced to its lowest form, if it is a whole number the den will be 1.
    public boolean isWhole() {
	return (this.d == 1);
    }
    
    public String toString() {
	return this.n + "/" + this.d;
    }

}

    
	    
