public class TestVertical {

    public static void main(String[] args) {
 
        Line v1 = new Vertical(5.897);
        Line v2 = new Vertical(-4.55);
        Line l1 = new NVLineObj(1.5,-7.55);
        Line l2 = new NVLineObj(new DPointObj(9,8.11), new DPointObj(-3.66,8.11));
        Line l3 = new NVLineObj(new DPointObj(9,8.11), new DPointObj(-3.66,5.678));
        LineSeg ls1 = new LineSegObj(new DPointObj(-5.22,9.8), new DPointObj(0,16));
        LineSeg ls2 = new LineSegObj(new DPointObj(2,8), new DPointObj(8,16));
        LineSeg ls3 = new LineSegObj(new DPointObj(5.667,-9.88), new DPointObj(100,-9.88));
        

        //tests
        try {
            System.out.println("v1 slope: " + v1.getM());
        }
        catch (UnsupportedOperationException e) {
            System.out.println("v1 slope: no slope");
        }

        try {
            System.out.println("v1 y-intercept: " + v1.getB());
        }
        catch (UnsupportedOperationException e) {
            System.out.println("v1 y-intercept: no y-intercept");
        }

        System.out.println("v1 horizontal?: " + v1.isHorizontal());
        System.out.println("v1 vertical?: " + v1.isVertical());

        try {
            System.out.println("v1 value at x: " + v1.atX(5.897));
        }
        catch (IllegalArgumentException e) {
            System.out.println("v1 value at x: no one y-value at x");
        }
        System.out.println("v1 value at x: " + v1.atX(6.5));
        
        try {
            System.out.println("v1 y-intercept: " + v1.yIntercept());
        }
        catch (IllegalArgumentException e) {
            System.out.println("v1 slope: no y-intercept");
        }

        System.out.println("v1 x-intercept: " + v1.xIntercept());

        System.out.println("v1 intersects line at: " + v1.intersection(l1));
        System.out.println("v1 intersects line at: " + v1.intersection(l2));
        System.out.println("v1 intersects line at: " + v1.intersection(l3));
        try {
            System.out.println("v1 intersects line at: " + v1.intersection(v1));
        }
        catch (IllegalArgumentException e) {
            System.out.println("same vertical line");
        }
        System.out.println("v1 intersects line at: " + v1.intersection(v2));
        
        System.out.println("v1 intersects line seg at: " + v1.intersection(ls1));
        System.out.println("v1 intersects line seg at: " + v1.intersection(ls2));
        System.out.println("v1 intersects line seg at: " + v1.intersection(ls3));

        System.out.println("v1 parallel to line?: " + v1.isParallel(l1));
        System.out.println("v1 parallel to line?: " + v1.isParallel(l2));
        System.out.println("v1 parallel to line?: " + v1.isParallel(v1));
        System.out.println("v1 parallel to line?: " + v1.isParallel(v2));
	
        System.out.println("v1 equals?: " + v1.equals(new Vertical(5.897)));
	System.out.println("v1 equals?: " + v1.equals(v1));
	System.out.println("v1 equals?: " + v1.equals(v2));
        System.out.println("v1 equals?: " + v1.equals(l1));
        System.out.println("v1 equals?: " + v1.equals(l2));
        System.out.println("v1 equals?: " + v1.equals(ls1));
        System.out.println("v1 equals?: " + v1.equals(ls2));
        System.out.println("v1 equals?: " + v1.equals(new DPointObj(5,6)));
      
    }

}
            
