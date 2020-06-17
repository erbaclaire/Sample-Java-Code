public class ObsObj implements Obs {
    private double x;
    private double y;
    public ObsObj(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static Obs ORIGIN = new ObsObj(0,0);
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public boolean same(Obs that) {
        return this.x==that.getX() && this.y==that.getY();
    }
    public double dist(Obs that) {
        double dx = that.getX() - this.x;
        double dy = that.getY() - this.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
