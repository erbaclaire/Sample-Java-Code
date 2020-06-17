public class NVLineObj implements Line {

    private double m;
    private double b;

    public NVLineObj(double m, double b) {
        this.m=m;
        this.b=b;
    }
                                         
    public NVLineObj(DPoint pointA, DPoint pointB) {
        if (pointA==null) throw new IllegalArgumentException("pointA is null");
        if (pointB==null) throw new IllegalArgumentException("pointB is null");
        if (pointA.getX()==pointB.getX() && pointA.getY()==pointB.getY()) throw new IllegalArgumentException("pointA is same as pointB");
        if (pointA.getX()==pointB.getX()) throw new IllegalArgumentException("vertical line");
        //note: find slope between points and y-intercept associated with points
        if (pointB.getX() > pointA.getX()) {
            m = (pointB.getY()-pointA.getY())/(pointB.getX()-pointA.getX());
        }
        else {
            m = (pointA.getY()-pointB.getY())/(pointA.getX()-pointB.getX());
        }
        //note: because of inexactness of doubles we will try to avoid some of the bugs we may get with inexactness by always
        //      calculating b with the leftmost point
        if (pointB.getX() > pointA.getX()) {
            b = pointA.getY()-(m*pointA.getX());
        }
        else {
            b = pointB.getY()-(m*pointB.getX());
        }
        
        this.m=m;
        this.b=b;
    }
    
    public double getM() {
        return this.m;
    }
    
    public double getB() {
        return this.b;
    }

    public boolean isHorizontal() {
        return this.getM()==0;
    }

    //note: will always be false because of constructors
    public boolean isVertical() {
        return false;
    }

    public DPoint atX(double x) {
        DPoint value = new DPointObj(x, (this.m*x)+this.b);
        return value;
    }

    public DPoint yIntercept() {
        DPoint interceptY = new DPointObj(0,this.b);
        return interceptY;
    }

    public DPoint xIntercept() {
        if (this.isHorizontal()==true) return null;
        DPoint interceptX = new DPointObj((0-this.b)/this.m,0);
        return interceptX;
    }

    //note: inexactness of calculated doubles like m and b may produce bugs
    public DPoint intersection(Line that) {
        if (this.m==that.getM() && this.b==that.getB()) throw new IllegalArgumentException("same line");
        if (this.m==that.getM()) return null;
        double x=(that.getB()-this.b)/(this.m-that.getM());
        DPoint inter = new DPointObj(x,(this.m*x)+this.b);
        return inter;
    }

    //note: inexactness of calculated doubles like m and b may produce bugs
    public DPoint intersection(LineSeg seg) {
        if (this.m==seg.slope() && this.b==seg.startPoint().getY()-(seg.slope()*seg.startPoint().getX())) throw new IllegalArgumentException("same line");
        if (this.m==seg.slope()) return null;
        Line lSeg = new NVLineObj(seg.slope(),seg.startPoint().getY()-(seg.slope()*seg.startPoint().getX()));
        if (this.intersection(lSeg).getX()<seg.startPoint().getX() || this.intersection(lSeg).getX()>seg.endPoint().getX()) return null;
        return this.intersection(lSeg);
    }
        
    //note: a line is not a parallel to itself
    //note: inexactness of calculated doubles like m and b may produce bugs
    public boolean isParallel(Line that) {
        if (this.m==that.getM() && this.b==that.getB()) return false;
        return (this.m==that.getM());
    }

    //note: inexactness of calculated doubles like m and b may produce bugs
    public boolean equals(Object o) {
        if (o==null) return false;
        if (!(o instanceof Line)) return false;
        Line that = (Line)o;
        return (this.m==that.getM() && this.b==that.getB());
    }

}

    
                                  
        

    

    
        
