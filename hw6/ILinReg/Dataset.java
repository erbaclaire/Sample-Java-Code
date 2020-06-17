public interface Dataset {
    public int numObs();
    public boolean isEmpty();
    public Double maxX();
    public Double maxY();
    public Obs leftmost();
    public Obs rightmost();
    public Double xSpan();
    public Double ySpan();
    public double sumX();
    public double sumY();
    public Double meanX();
    public Double meanY();
    public Obs centroid();
    public double[] xs();
    public double[] ys();
    public Dataset adjustUpwards(double dy);
    public boolean contains(Obs d);
    public Double meanDistance(Obs d);
    public boolean crossesXAxis();
    public boolean crossesYAxis();
    public boolean subset(Dataset that);
    public boolean superset(Dataset that);
    public String toString();
    public Line bestFit();
    public Double meanDistance(Line n);
    public Double rsq();
}
