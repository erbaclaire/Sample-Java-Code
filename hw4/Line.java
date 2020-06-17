public interface Line {
    public double  getM();
    public double  getB();
    public boolean isHorizontal();
    public boolean isVertical();
    public DPoint  atX(double x);
    public DPoint  yIntercept();
    public DPoint  xIntercept();
    public DPoint  intersection(Line that); // return null if no intersection; raise exception if lines are identical
    public DPoint  intersection(LineSeg seg); // return null if no intersection; raise exception if lines are identical
    public boolean isParallel(Line that);
    public boolean equals(Object o);
}
