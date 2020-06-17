public class TestTime {

    public static void main(String[] args) {

	//test validation
	/*
	Time t1 = new TimeObj(25,0,9);
	Time t2 = new TimeObj(12,67,9);
	Time t3 = new TimeObj(12,0,99);
	Time t4 = new TimeObj(26,78,99);
	*/

	//test get methods
	Time t5 = new TimeObj(15,22,33);
	System.out.println(t5.getHour());
	System.out.println(t5.getMinute());
	System.out.println(t5.getSecond());

	//test relative time
	System.out.println(t5.same(new TimeObj(15,22,33)));
	System.out.println(t5.same(new TimeObj(23,4,6)));
	
	System.out.println(t5.before(new TimeObj(16,49,35)));
	System.out.println(t5.before(new TimeObj(15,5,59)));
	System.out.println(t5.before(new TimeObj(15,22,35)));

	System.out.println(t5.after(new TimeObj(14,6,7)));
	System.out.println(t5.after(new TimeObj(15,22,33)));
	System.out.println(t5.after(new TimeObj(15,22,6)));

	//test seconds since midnight
	System.out.println(t5.secondsSinceMidnight());

	//test am  and hour 12 strings
	Time t6 = new TimeObj(0,0,0);
	System.out.println(t6.toString());
	System.out.println(t6.ampmString());

	Time t7 = new TimeObj(1,30,1);
	System.out.println(t7.toString());
	System.out.println(t7.ampmString());

	Time t8 = new TimeObj(12,8,30);
	System.out.println(t8.toString());
	System.out.println(t8.ampmString());

	Time t9 = new TimeObj(10,11,12);
	System.out.println(t9.toString());
	System.out.println(t9.ampmString());

	//test pm strings
	Time t10 = new TimeObj(14,1,1);
	System.out.println(t10.toString());
	System.out.println(t10.ampmString());

	Time t11 = new TimeObj(14,11,1);
	System.out.println(t11.toString());
	System.out.println(t11.ampmString());

	Time t12 = new TimeObj(16,9,30);
	System.out.println(t12.toString());
	System.out.println(t12.ampmString());

	Time t13 = new TimeObj(23,44,46);
	System.out.println(t13.toString());
	System.out.println(t13.ampmString());
	
    }
}
