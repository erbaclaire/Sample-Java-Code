public class ClosedInterval implements Interval {

    //instance variables
    private double a;
    private double b;

    //constructor
    public ClosedInterval(double a, double b) {

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
	return (this.a <= x) && (this.b >= x);
    }

    public boolean wider(Interval that) {
	return this.width() > that.width();
    }

    public boolean contains(Interval that) {
	//note: a closed interval contains its open interval counterpart and itself, so no need for additional logic here.
	return (this.includes(that.getLeft()) && this.includes(that.getRight()));
    }

    public String toString() {
	return "[" + this.a + "," + this.b + "]";
    }

}
