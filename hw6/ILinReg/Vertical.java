public class Vertical implements Line {

    private double x;

    public Vertical(double x) {
        if (Double.isNaN(x) || Double.isInfinite(x))
            throw new IllegalArgumentException("x is invalid");
        this.x=x;
    }

    public double getM() {
        throw new UnsupportedOperationException("no slope");
    }

    public double getB() {
        throw new UnsupportedOperationException("no y-intercept");
    }
        
    public boolean isHorizontal() {
        return false;
    }

    public boolean isVertical() {
        return true;
    }

    //note: if x is not vertical line then null, otherwise throw an exception
    public DPoint atX(double x) {
        if (this.x!=x)
            return null;
        throw new IllegalArgumentException("no one y value at x");
    }

    public DPoint yIntercept() {
        throw new IllegalArgumentException("no y-intercept");
    }

    public DPoint xIntercept() {
        return new DPointObj(this.x,0);
    }

    //note: if same line, throw an exception; if different line but vertical then null (like hw4)
    public DPoint intersection(Line that) {
        if (that.isVertical() && this.xIntercept().getX()==that.xIntercept().getX())
            throw new IllegalArgumentException("same line");
        if (that.isVertical())
            return null;
        return new DPointObj(this.x, that.getM()*this.x + that.getB());
    }

    //note: my line segs are exclusively non-vertical so no logic for if it is same line or parallel line
    public DPoint intersection(LineSeg seg) {
        if (this.x<seg.startPoint().getX() || this.x>seg.endPoint().getX())
            return null;
        return new DPointObj(this.x, seg.slope()*this.x + (seg.startPoint().getY()-(seg.slope()*seg.startPoint().getX())));
    }

    //note: if same line then it is technically not parallel
    public boolean isParallel(Line that) {
        if (that.isVertical() && this.xIntercept().getX()==that.xIntercept().getX())
            return false;
        if (that.isVertical())
            return true;
        return false;
    }

    public boolean equals(Object o) {
        return ((o instanceof Line) && ((Line)o).isVertical() && this.xIntercept().getX()==((Line)o).xIntercept().getX());
    }

}
                   
