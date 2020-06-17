public interface RGB {
    public int getR();
    public int getG();
    public int getB();
    public double luminance(); // see below
    public RGB gray(); // see below
    public boolean brighter(RGB that); // return true if this is brighter than that, by luminance
    public RGB mix(RGB that); // compute the "middle color" between the two
    public boolean equals(Object o);
    public String toString();
}
