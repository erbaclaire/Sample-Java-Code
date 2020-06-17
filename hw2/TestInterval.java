public class TestInterval {
    
    public static void main(String[] args) {

	//test validation
	/*
	Interval i1 = new OpenInterval(16, -15);
	*/
	
	Interval i2 = new OpenInterval(-9.8888733, 14.35);
	Interval i3 = new ClosedInterval(-8.888373, -0.00001);	

	//test get methods
	System.out.println(i2.getLeft());
	System.out.println(i2.getRight());
	System.out.println(i3.getLeft());
	System.out.println(i3.getRight());

	//test width
	System.out.println(i2.width());
	System.out.println(i3.width());

	//test includes
	System.out.println(i2.includes(-9));
	System.out.println(i2.includes(14.35));
	System.out.println(i3.includes(6));
	System.out.println(i3.includes(-0.00001));

	//test wider and contains for open interval
	System.out.println(i2.wider(new OpenInterval(-9.8888733,14.34)));
	System.out.println(i2.contains(new OpenInterval(-9,100.03)));
	System.out.println(i2.contains(new OpenInterval(-9.8888733,14.35)));
	System.out.println(i2.contains(new ClosedInterval(-9.8888733,14.35)));
	System.out.println(i2.contains(new ClosedInterval(-9,14.35)));
	System.out.println(i2.contains(new ClosedInterval(-9,5)));

	//test wider and contains for closed interval
	System.out.println(i3.wider(new ClosedInterval(2.555,1000)));
	System.out.println(i3.wider(new OpenInterval(-8.888373, -0.00001)));
	System.out.println(i3.contains(new ClosedInterval(-10,2.334)));
	System.out.println(i3.contains(new OpenInterval(-8.888373,-0.00001)));
	System.out.println(i3.contains(new OpenInterval(-9,-0.000001)));
	System.out.println(i3.contains(new ClosedInterval(-8.888373,-0.00001)));
	
	//test string
	System.out.println(i2.toString());
	System.out.println(i3.toString());

	
    }

}
