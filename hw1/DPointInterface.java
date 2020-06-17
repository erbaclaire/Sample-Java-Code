public interface DPointInterface {
    public double getX();
    public double getY();
    public boolean inQuadrantI();
    public boolean inQuadrantII();
    public boolean inQuadrantIII();
    public boolean inQuadrantIV();
    public double distance(DPointInterface that);
    public boolean above(DPointInterface that);
    public boolean below(DPointInterface that);
    public boolean closerToOrigin(DPointInterface that);
    public DPointInterface midpoint(DPointInterface that);
}
