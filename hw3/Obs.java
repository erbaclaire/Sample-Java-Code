public interface Obs {
    public double getX();
    public double getY();
    public boolean same(Obs that);
    public double dist(Obs that);
    public String toString();
}
