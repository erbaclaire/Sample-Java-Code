//Homework 1
//Name: Claire Erba
//Date: 6/26/2018
//Cites: 1. MPCS Summer 2018 Lecture Notes.
//       2. "Quickly square a double," StackOverflow, available at https://stackoverflow.com/questions/25205750/quickly-square-a-double, accessed June 26,2018.
//       3. Homework help via Piazza Q & A.

public class DPointObject implements DPointInterface {

    //instance variables
    private double x;
    private double y;

    //constructor
    public DPointObject(double x, double y) {
	this.x = x;
	this.y = y;
    }

    //methods
    public double getX() {
	return this.x;
    }
    
    public double getY() {
	return this.y;
    }
    
    public boolean inQuadrantI() {
	return (this.x>0) && (this.y>0);
    }

    public boolean inQuadrantII() {
	return (this.x<0) && (this.y>0);
    }

    public boolean inQuadrantIII() {
	return (this.x<0) && (this.y<0);
    }

    public boolean inQuadrantIV() {
	return (this.x>0) && (this.y<0);
    }

    public double distance (DPointInterface that) {
	double xDiffSquared = Math.pow(this.x - that.getX(), 2);
	double yDiffSquared = Math.pow(this.y - that.getY(), 2);
	double d = Math.sqrt(xDiffSquared + yDiffSquared);
	return d;
    }

    public boolean above(DPointInterface that) {
	return this.y > that.getY();
    }

    public boolean below(DPointInterface that) {
	return this.y < that.getY();
    }

    public boolean closerToOrigin(DPointInterface that) {
	double thisXDiffSquared = Math.pow(this.x - 0, 2);
	double thisYDiffSquared = Math.pow(this.y - 0, 2);
	double thisDistanceOrigin = Math.sqrt(thisXDiffSquared + thisYDiffSquared);

	double thatXDiffSquared = Math.pow(that.getX() - 0, 2);
	double thatYDiffSquared = Math.pow(that.getY() - 0, 2);
	double thatDistanceOrigin = Math.sqrt(thatXDiffSquared + thatYDiffSquared);

	return thisDistanceOrigin < thatDistanceOrigin;
    }
    
    public DPointInterface midpoint(DPointInterface that) {
	double mx = (this.x + that.getX())/2;
	double my = (this.y + that.getY())/2;
	DPointInterface m = new DPointObject(mx, my);
	return m;
    }

    //tests output - ignore
    /*
    public static void main (String[] args) {
	DPointObject a = new DPointObject(0, 0.001);
	System.out.println(a.getX());
	System.out.println(a.getY());
	System.out.println(a.inQuadrantI());
	System.out.println(a.inQuadrantII());
	System.out.println(a.inQuadrantIII());
	System.out.println(a.inQuadrantIV());
	System.out.println(a.distance(new DPointObject(0, 0.2222)));
	System.out.println(a.above(new DPointObject(0, 0.2222)));
	System.out.println(a.below(new DPointObject(0, 0.2222)));
	System.out.println(a.closerToOrigin(new DPointObject(0, 0.2222)));
	System.out.println(a.midpoint(new DPointObject(0, 0.2222)));
    }
    */
}
