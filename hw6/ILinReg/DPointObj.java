public class DPointObj implements DPoint {

    //instance variables
    private double x;
    private double y;

    //constructor
    public DPointObj(double x, double y) {
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

    public double distance (DPoint that) {
        return Math.sqrt(Math.pow(this.x-that.getX(),2) + Math.pow(this.y - that.getY(),2));
    }

    public boolean above(DPoint that) {
        return this.y > that.getY();
    }

    public boolean below(DPoint that) {
        return this.y < that.getY();
    }

    public boolean closerToOrigin(DPoint that) {
        DPoint origin = new DPointObj(0,0);
        return this.distance(origin) < that.distance(origin);
    }
    
    public DPoint midpoint(DPoint that) {
        double mx = (this.x + that.getX())/2;
        double my = (this.y + that.getY())/2;
        DPoint m = new DPointObj(mx, my);
        return m;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
    
}
