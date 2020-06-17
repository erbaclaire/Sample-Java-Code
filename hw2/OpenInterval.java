public class OpenInterval implements Interval {

    //instance variables
    private double a;
    private double b;

    //constructor
    public OpenInterval(double a, double b) {

	//validation
	if (a>b) {
	    throw new IllegalArgumentException ("left bound exceeds right bound");
	}

	this.a = a;
	this.b = b;

    }

    //methods
    public double getLeft() {
	return this.a;
    }

    public double getRight() {
	return this.b;
    }

    public double width() {
	return this.b-this.a;
    }

    public boolean includes(double x) {
	return (this.a < x) && (this.b > x);
    }

    public boolean wider(Interval that) {
	return this.width() > that.width();
    }

    public boolean contains(Interval that) {
	//note: when comparing an open and closed interval, and the bounds are equal, the open interval will not contain the closed interval.
	//Test if "that" is closed interval. If it is, it needs to be strictly inside the open interval
	if (that.includes(that.getLeft()) && that.includes(that.getRight())) {
	    return (this.includes(that.getLeft()) && this.includes(that.getRight())); 
	}
	else {
	    return (this.a <= that.getLeft()) && (this.b >= that.getRight()); //note: assuming that an open interval contains itself.
	}
    }
    
    public String toString() {
	return "(" + this.a + "," + this.b + ")";
    }

}
