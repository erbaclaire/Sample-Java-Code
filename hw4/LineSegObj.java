public class LineSegObj implements LineSeg {

    private DPoint a;
    private DPoint b;

    public LineSegObj(DPoint a, DPoint b) {
        if (a==null) throw new IllegalArgumentException("a is null");
        if (b==null) throw new IllegalArgumentException("b is null");
        //note: A.Shaw says its okay to have this logic. This make intersection with a line segment easier in the NVLineObj class.
        if (a.getX()==b.getX() && a.getY()==b.getY()) throw new IllegalArgumentException("a is the same as b");
        if (a.getX()==b.getX()) throw new IllegalArgumentException("line segment is vertical");
        this.a=a;
        this.b=b;
    }

    public double slope() {
        if (this.b.getX()>this.a.getX()) return (this.b.getY()-this.a.getY())/(this.b.getX()-this.a.getX());
        return (this.a.getY()-this.b.getY())/(this.a.getX()-this.b.getX());
    }

    public DPoint startPoint() {
        if (this.b.getX()>this.a.getX()) return this.a;
        return this.b;
    }

    public DPoint endPoint() {
        if (this.b.getX()>this.a.getX()) return this.b;
        else return this.a;
    }           
}
