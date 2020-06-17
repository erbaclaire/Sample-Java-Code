public interface Interval {
    public double getLeft();
    public double getRight();
    public double width();
    public boolean includes(double x);
    public boolean wider(Interval that);
    public boolean contains(Interval that);
    public String toString();
}
