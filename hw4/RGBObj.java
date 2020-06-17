public class RGBObj implements RGB {

    private int r;
    private int g;
    private int b;

    public RGBObj(int r, int g, int b) {
        if (r<0 || r>255) throw new IllegalArgumentException(r + " is out of range");
        if (g<0 || g>255) throw new IllegalArgumentException(g + " is out of range");
        if (b<0 || b>255) throw new IllegalArgumentException(b + " is out of range");
        this.r=r;
        this.g=g;
        this.b=b;
    }

    public int getR() {
        return this.r;
    }

    public int getG() {
        return this.g;
    }

    public int getB() {
        return this.b;
    }

    public double luminance() {
        return 0.299*this.r + 0.587*this.g + 0.114*this.b;
    }

    public RGB gray() {
        int lum = (int)this.luminance();
        RGB gr = new RGBObj(lum,lum,lum);
        return gr;
    }

    public boolean brighter(RGB that) {
        return this.luminance() > that.luminance();
    }

    //note: we want mid to be a color, as well, so need to be int.
    public RGB mix(RGB that) {
        RGB mid = new RGBObj((this.r+that.getR())/2,(this.g+that.getG())/2,(this.b+that.getB())/2);
        return mid;
    }

    public boolean equals(Object o) {
        if (o==null) return false;
        if (!(o instanceof RGB)) return false;
        RGB that = (RGB)o;
        //note that since r, g, and b are of primative type int, you use "==" instead of "equals"
        return this.r==that.getR() && this.g==that.getG() && this.b==that.getB();
    }

    public String toString() {
        return "(" + this.r + "," + this.g + "," + this.b + ")";
    }
    
}
                                                           
                                                           
