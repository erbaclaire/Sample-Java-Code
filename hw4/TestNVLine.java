public class TestNVLine {

    public static void main(String[] args) {

        //test validation
        /*
        Line l0 = new NVLineObj(null, new DPointObj(-6.7,10.3));
        Line l00 = new NVLineObj(new DPointObj(1.222,3.87), null);
        Line l000 = new NVLineObj(new DPointObj(-6,8.2), new DPointObj(-6,8.2));
        Line l0000 = new NVLineObj(new DPointObj(3,9.11), new DPointObj(3,7.989));
        */
        
        Line l1 = new NVLineObj(new DPointObj(1.222,3.87), new DPointObj(-6.7,10.3));
        Line l2 = new NVLineObj(new DPointObj(2,2), new DPointObj(3,3));
        Line l3 = new NVLineObj(new DPointObj(100,3), new DPointObj(400,3));
        Line l4 = new NVLineObj(-2,5.5);
        Line l5 = new NVLineObj(1,0);

        //test1
        System.out.println("start l1 test");
        System.out.println("slope: " + l1.getM());
        System.out.println("y-intercept: " + l1.getB());
        System.out.println("horizontal?: " + l1.isHorizontal());
        System.out.println("vertical?: " + l1.isVertical());
        System.out.println("atX: " + l1.atX(9));
        System.out.println("y-intercept: " + l1.yIntercept());
        System.out.println("x-intercept: " + l1.xIntercept());
        //System.out.println("intersection: " + l1.intersection(new NVLineObj(new DPointObj(-9.87,50.67), null)));
        System.out.println("intersection: " + l1.intersection(new NVLineObj(new DPointObj(7,9), new DPointObj(4,3))));
        System.out.println("intersection: " + l1.intersection(new NVLineObj(-6.7,42)));
        System.out.println("intersection: " + l1.intersection(new LineSegObj(new DPointObj(5,-9),new DPointObj(8,10))));
        //System.out.println("intersection: " + l1.intersection(new LineSegObj(new DPointObj(-6.7,10.3), new DPointObj(1.222,3.87))));
        System.out.println("parallel?: " + l1.isParallel(new NVLineObj(new DPointObj(-9.87,50.67), new DPointObj(18.99,10.2))));
        System.out.println("parallel?: " + l1.isParallel(new NVLineObj(-0.8116637212825044,2.76)));
        System.out.println("equals: " + l1.equals(l1));
        System.out.println("equals: " + l1.equals(new DPointObj(-6.7,10.3)));
        System.out.println("equals: " + l1.equals(l2));

        //test2
        System.out.println("start l2 test");
        System.out.println("slope: " + l2.getM());
        System.out.println("y-intercept: " + l2.getB());
        System.out.println("horizontal?: " + l2.isHorizontal());
        System.out.println("vertical?: " + l2.isVertical());
        System.out.println("atX: " + l2.atX(-44));
        System.out.println("y-intercept: " + l2.yIntercept());
        System.out.println("x-intercept: " + l2.xIntercept());
        //System.out.println("intersection: " + l2.intersection(new NVLineObj(new DPointObj(100,100), new DPointObj(4,4))));
        System.out.println("intersection: " + l2.intersection(new NVLineObj(new DPointObj(7,9), new DPointObj(4,3))));
        System.out.println("intersection: " + l2.intersection(new NVLineObj(1,2)));
        System.out.println("intersection: " + l2.intersection(new LineSegObj(new DPointObj(0,1),new DPointObj(0.5,1))));
        //System.out.println("intersection: " + l2.intersection(new LineSegObj(null,new DPointObj(0.5,1))));
        System.out.println("parallel?: " + l2.isParallel(new NVLineObj(new DPointObj(1,3), new DPointObj(0,2))));
        System.out.println("parallel?: " + l2.isParallel(new NVLineObj(1,7000)));
        System.out.println("equals: " + l2.equals(new NVLineObj(1,0)));

        //test3
        System.out.println("start l3 test");
        System.out.println("slope: " + l3.getM());
        System.out.println("y-intercept: " + l3.getB());
        System.out.println("horizontal?: " + l3.isHorizontal());
        System.out.println("vertical?: " + l3.isVertical());
        System.out.println("atX: " + l3.atX(-78.6));
        System.out.println("y-intercept: " + l3.yIntercept());
        System.out.println("x-intercept: " + l3.xIntercept());
        System.out.println("intersection: " + l3.intersection(new NVLineObj(new DPointObj(5,-6), new DPointObj(2,4))));
        System.out.println("intersection: " + l3.intersection(new NVLineObj(1,2)));
        System.out.println("intersection: " + l3.intersection(new LineSegObj(new DPointObj(0,1),new DPointObj(0.5,1))));
        System.out.println("parallel?: " + l3.isParallel(new NVLineObj(new DPointObj(7,-14), new DPointObj(-99,-14))));
        System.out.println("parallel?: " + l3.isParallel(new NVLineObj(-5,2)));
        
        //test4
        System.out.println("start l4 test");
        System.out.println("slope: " + l4.getM());
        System.out.println("y-intercept: " + l4.getB());
        System.out.println("horizontal?: " + l4.isHorizontal());
        System.out.println("vertical?: " + l4.isVertical());
        System.out.println("atX: " + l4.atX(9));
        System.out.println("y-intercept: " + l4.yIntercept());
        System.out.println("x-intercept: " + l4.xIntercept());
        //System.out.println("intersection: " + l4.intersection(new NVLineObj(new DPointObj(3.3,-1.1), new DPointObj(-80.34,166.18))));
        System.out.println("intersection: " + l4.intersection(new NVLineObj(new DPointObj(5,-6), new DPointObj(2,4))));
        System.out.println("intersection: " + l4.intersection(new NVLineObj(1,2)));
        System.out.println("intersection: " + l4.intersection(new LineSegObj(new DPointObj(2.25,1),new DPointObj(-99,1))));
        System.out.println("intersection: " + l4.intersection(new LineSegObj(new DPointObj(-65.5,1.2),new DPointObj(108.3,76.99))));
        //System.out.println("intersection: " + l4.intersection(new LineSegObj(new DPointObj(8.1,1),new DPointObj(8.1,7.6))));
	//System.out.println("intersection: " + l4.intersection(new LineSegObj(new DPointObj(8.1,1),new DPointObj(8.1,1))));
        System.out.println("intersection: " + l4.intersection(new LineSegObj(new DPointObj(8,6),new DPointObj(9,4))));
        //System.out.println("intersection: " + l4.intersection(new LineSegObj(new DPointObj(0,5.5),new DPointObj(-1,7.5))));
        System.out.println("parallel?: " + l4.isParallel(new NVLineObj(new DPointObj(0,-14), new DPointObj(-99,-14))));
        System.out.println("parallel?: " + l4.isParallel(new NVLineObj(-2,5.5)));
        System.out.println("parallel?: " + l4.isParallel(new NVLineObj(-2,97.888888)));
        
    }
}
                                
