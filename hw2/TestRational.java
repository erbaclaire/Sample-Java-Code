public class TestRational {

    public static void main(String[] args) {

	Rational r1 = new RationalObj(-135,-40);
	Rational r2 = new RationalObj(5,-65);
	Rational r3 = new RationalObj(100,50);
	Rational r4 = new RationalObj(0,-45);
	/*Rational r5 = new RationalObj(0,0);*/ //will crash here because can't divide by 0.

	//test r1
	System.out.println("Start r1");
	System.out.println(r1.getNum());
	System.out.println(r1.getDenom());
	System.out.println(r1.numApprox());
	System.out.println(r1.recip());
	System.out.println(r1.negate());
	System.out.println(r1.plus(new RationalObj(50,5)));
	System.out.println(r1.minus(new RationalObj(1,10)));
	System.out.println(r1.times(new RationalObj(32,6)));
	System.out.println(r1.dividedBy(new RationalObj(5,6)));
	System.out.println(r1.max(new RationalObj(33,66)));
	System.out.println(r1.min(new RationalObj(33,66)));
	System.out.println(r1.same(new RationalObj(54,16)));
	System.out.println(r1.lessThan(new RationalObj(77,88)));
	System.out.println(r1.greaterThan(new RationalObj(100,20)));
	System.out.println(r1.isWhole());
	System.out.println(r1.toString());

	//test r2
	System.out.println("Start r2");
	System.out.println(r2.getNum());
	System.out.println(r2.getDenom());
	System.out.println(r2.numApprox());
	System.out.println(r2.recip());
	System.out.println(r2.negate());
	System.out.println(r2.plus(new RationalObj(-50,5)));
	System.out.println(r2.minus(new RationalObj(-1,10)));
	System.out.println(r2.times(new RationalObj(-32,6)));
	System.out.println(r2.dividedBy(new RationalObj(-5,6)));
	System.out.println(r2.max(new RationalObj(-33,66)));
	System.out.println(r2.min(new RationalObj(-33,66)));
	System.out.println(r2.same(new RationalObj(-54,16)));
	System.out.println(r2.lessThan(new RationalObj(-77,88)));
	System.out.println(r2.greaterThan(new RationalObj(-100,20)));
	System.out.println(r2.isWhole());
	System.out.println(r2.toString());

	//test r3
	System.out.println("Start r3");
	System.out.println(r3.getNum());
	System.out.println(r3.getDenom());
	System.out.println(r3.numApprox());
	System.out.println(r3.recip());
	System.out.println(r3.negate());
	System.out.println(r3.plus(new RationalObj(50,-5)));
	System.out.println(r3.minus(new RationalObj(1,-10)));
	System.out.println(r3.times(new RationalObj(32,-6)));
	/*System.out.println(r3.dividedBy(new RationalObj(0,-6)));*/ //will crash here because can't divide by 0.
	System.out.println(r3.max(new RationalObj(33,-66)));
	System.out.println(r3.min(new RationalObj(1,-13)));
	System.out.println(r3.same(new RationalObj(54,-16)));
	System.out.println(r3.lessThan(new RationalObj(77,-88)));
	System.out.println(r3.greaterThan(new RationalObj(100,-20)));
	System.out.println(r3.isWhole());
	System.out.println(r3.toString());

	//test r4
	System.out.println("Start r4");
	System.out.println(r4.getNum());
	System.out.println(r4.getDenom());
	System.out.println(r4.numApprox());
	/*System.out.println(r4.recip());*/ //will crash here because can't divide by 0.
	System.out.println(r4.negate());
	System.out.println(r4.plus(new RationalObj(-50,-5)));
	System.out.println(r4.minus(new RationalObj(-1,-10)));
	System.out.println(r4.times(new RationalObj(-32,-6)));
	System.out.println(r4.dividedBy(new RationalObj(-5,-6)));
	System.out.println(r4.max(new RationalObj(-33,-66)));
	System.out.println(r4.min(new RationalObj(-33,-66)));
	System.out.println(r4.same(new RationalObj(-54,-16)));
	System.out.println(r4.lessThan(new RationalObj(-77,-88)));
	System.out.println(r4.greaterThan(new RationalObj(-100,-20)));
	System.out.println(r4.isWhole());
	System.out.println(r4.toString());					      

    }

}
	
