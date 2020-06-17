public interface DPoint {
    public double getX();
    public double getY();
    public boolean inQuadrantI();
    public boolean inQuadrantII();
    public boolean inQuadrantIII();
    public boolean inQuadrantIV();
    public double distance(DPoint that);
    public boolean above(DPoint that);
    public boolean below(DPoint that);
    public boolean closerToOrigin(DPoint that);
    public DPoint midpoint(DPoint that);
    public String toString();
}
