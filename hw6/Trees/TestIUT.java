public class TestIUT {

    public static void main(String[] args) {

        IUT test0 = new Cons(6);
        System.out.println("test 0 first: " + test0.first());
        System.out.println("test 0 rest: " + test0.rest());
        System.out.println("test 0 max item: " + test0.maxItem());
        System.out.println("test 0 min item: " + test0.minItem());
        System.out.println("test 0 contains -5: " + test0.contains(-5));
        System.out.println("test 0 contains -2: " + test0.contains(-2));
        System.out.println("test 0 count 8: " + test0.count(8));
        System.out.println("test 0 length: " + test0.length());
        System.out.println("test 0 s. ascending?: " + test0.isAsc());
        System.out.println("test 0 mono. increasing?: " + test0.isMonoIncr());
        System.out.println("test 0 s. descending?: " + test0.isDesc());
        System.out.println("test 0 mono. decreasing?: " + test0.isMonoDecr());
        System.out.println("test 0 mono.?: " + test0.isMonotonic());
        System.out.println("test 0 squared: " + test0.square());
        System.out.println("test 0 cubed: " + test0.cube());
        System.out.println("test 0 add -6: " + test0.add(-6));
        System.out.println("test 0 keep above 7: " + test0.keepAbove(7));
        System.out.println("test 0 reject above 3: " + test0.rejectAbove(3));
        System.out.println("test 0 put -5 last: " + test0.putlast(-5));
        System.out.println("test 0 put append: " + test0.append(test0));
        System.out.println("test 0 reversed: " + test0.reverse());
        System.out.println("test 0 equals: " + test0.equals(test0));
	System.out.println("test 0 equals: " + test0.equals(new Cons(6)));

        IUT test00 = new Cons(-2,
                              new Cons(-3));
        System.out.println("test 00 first: " + test00.first());
        System.out.println("test 00 rest: " + test00.rest());
        System.out.println("test 00 max item: " + test00.maxItem());
        System.out.println("test 00 min item: " + test00.minItem());
        System.out.println("test 00 contains -5: " + test00.contains(-5));
        System.out.println("test 00 contains -2: " + test00.contains(-2));
        System.out.println("test 00 count 8: " + test00.count(8));
        System.out.println("test 00 length: " + test00.length());
        System.out.println("test 00 s. ascending?: " + test00.isAsc());
        System.out.println("test 00 mono. increasing?: " + test00.isMonoIncr());
        System.out.println("test 00 s. descending?: " + test00.isDesc());
        System.out.println("test 00 mono. decreasing?: " + test00.isMonoDecr());
        System.out.println("test 00 mono.?: " + test00.isMonotonic());
        System.out.println("test 00 squared: " + test00.square());
        System.out.println("test 00 cubed: " + test00.cube());
        System.out.println("test 00 add -6: " + test00.add(-6));
        System.out.println("test 00 keep above 7: " + test00.keepAbove(7));
        System.out.println("test 00 reject above 3: " + test00.rejectAbove(3));
        System.out.println("test 00 put -5 last: " + test00.putlast(-5));
        System.out.println("test 00 put append: " + test00.append(test0));
        System.out.println("test 00 reversed: " + test00.reverse());
        System.out.println("test 00 equals: " + test00.equals(test00));

        IUT test000 = new Nil();
        //System.out.println("test 000 first: " + test000.first());
        //System.out.println("test 000 rest: " + test000.rest());
        System.out.println("test 000 max item: " + test000.maxItem());
        System.out.println("test 000 min item: " + test000.minItem());
        System.out.println("test 000 contains -5: " + test000.contains(-5));
        System.out.println("test 000 contains -2: " + test000.contains(-2));
        System.out.println("test 000 count 8: " + test000.count(8));
        System.out.println("test 000 length: " + test000.length());
        System.out.println("test 000 s. ascending?: " + test000.isAsc());
        System.out.println("test 000 mono. increasing?: " + test000.isMonoIncr());
        System.out.println("test 000 s. descending?: " + test000.isDesc());
        System.out.println("test 000 mono. decreasing?: " + test000.isMonoDecr());
        System.out.println("test 000 mono.?: " + test000.isMonotonic());
        System.out.println("test 000 squared: " + test000.square());
        System.out.println("test 000 cubed: " + test000.cube());
        System.out.println("test 000 add -6: " + test000.add(-6));
        System.out.println("test 000 keep above 7: " + test000.keepAbove(7));
        System.out.println("test 000 reject above 3: " + test000.rejectAbove(3));
        System.out.println("test 000 put -5 last: " + test000.putlast(-5));
        System.out.println("test 000 put append: " + test000.append(test0));
	System.out.println("test 000 put append: " + test000.append(null));
        System.out.println("test 000 reversed: " + test000.reverse());
        //System.out.println("test 000 equals: " + test000.equals(test00));
        
        IUT test1 = new Cons(-2,
                             new Cons(4,
                                      new Cons(8,
                                               new Cons(-9,
                                                        new Cons(17,
                                                                 new Cons(7,
                                                                          new Cons(-10,
                                                                                   new Cons(88,
                                                                                            new Cons(34,
                                                                                                     new Cons(-5,
                                                                                                              new Cons(-9,
                                                                                                                       new Cons(-12))))))))))));
        System.out.println("test 1 first: " + test1.first());
        System.out.println("test 1 rest: " + test1.rest());
        System.out.println("test 1 max item: " + test1.maxItem());
        System.out.println("test 1 min item: " + test1.minItem());
        System.out.println("test 1 contains -5: " + test1.contains(-5));
        System.out.println("test 1 contains -2: " + test1.contains(-2));
        System.out.println("test 1 count 8: " + test1.count(8));
        System.out.println("test 1 length: " + test1.length());
        System.out.println("test 1 s. ascending?: " + test1.isAsc());
        System.out.println("test 1 mono. increasing?: " + test1.isMonoIncr());
        System.out.println("test 1 s. descending?: " + test1.isDesc());
        System.out.println("test 1 mono. decreasing?: " + test1.isMonoDecr());
        System.out.println("test 1 mono.?: " + test1.isMonotonic());
        System.out.println("test 1 squared: " + test1.square());
        System.out.println("test 1 cubed: " + test1.cube());
        System.out.println("test 1 add -6: " + test1.add(-6));
        System.out.println("test 1 keep above 7: " + test1.keepAbove(7));
        System.out.println("test 1 reject above 3: " + test1.rejectAbove(3));
        System.out.println("test 1 put -5 last: " + test1.putlast(-5));
        System.out.println("test 1 put append: " + test1.append(test1));
        System.out.println("test 1 put append: " + test1.append(new Nil()));
        System.out.println("test 1 reversed: " + test1.reverse());
        System.out.println("test 1 equals: " + test1.equals(test1));

        //more tests
        IUT test2 = new Cons(-2,
                             new Cons(-2,
                                      new Cons(0,
                                               new Cons(4,
                                                        new Cons(4)))));
        System.out.println("test 2 s. ascending?: " + test2.isAsc());
        System.out.println("test 2 mono. increasing?: " + test2.isMonoIncr());
        System.out.println("test 2 s. descending?: " + test2.isDesc());
        System.out.println("test 2 mono. decreasing?: " + test2.isMonoDecr());
        System.out.println("test 2 mono.?: " + test2.isMonotonic());
        System.out.println("test 2 keep above -2: " + test2.keepAbove(-2));
        System.out.println("test 2 reject above -2: " + test2.rejectAbove(-2));
        System.out.println("test 2 append: " + test2.append(test1));
        System.out.println("test 2 reversed: " + test2.reverse());
        
        IUT test3 = new Cons(-2,
                             new Cons(-1,
                                      new Cons(0,
                                               new Cons(4,
                                                        new Cons(9)))));
        System.out.println("test 3 s. ascending?: " + test3.isAsc());
        System.out.println("test 3 mono. increasing?: " + test3.isMonoIncr());
        System.out.println("test 3 s. descending?: " + test3.isDesc());
        System.out.println("test 3 mono. decreasing?: " + test3.isMonoDecr());
        System.out.println("test 3 mono.?: " + test3.isMonotonic());
        System.out.println("test 3 keep above 9: " + test3.keepAbove(9));
        System.out.println("test 3 reject above 3: " + test3.rejectAbove(3));
        System.out.println("test 3 reversed: " + test3.reverse());
        
        IUT test4 = new Cons(9,
                             new Cons(9,
                                      new Cons(9,
                                               new Cons(4,
                                                        new Cons(3)))));
        System.out.println("test 4 s. ascending?: " + test4.isAsc());
        System.out.println("test 4 mono. increasing?: " + test4.isMonoIncr());
        System.out.println("test 4 s. descending?: " + test4.isDesc());
        System.out.println("test 4 mono. decreasing?: " + test4.isMonoDecr());
        System.out.println("test 4 mono.?: " + test4.isMonotonic());
        System.out.println("test 4 keep above -1: " + test4.keepAbove(-1));
        System.out.println("test 4 reject above 3: " + test4.rejectAbove(3));
        System.out.println("test 4 reversed: " + test4.reverse());

        IUT test5 = new Cons(9,
                             new Cons(8,
                                      new Cons(7,
                                               new Cons(6,
                                                        new Cons(-3)))));
        System.out.println("test 5 s. ascending?: " + test5.isAsc());
        System.out.println("test 5 mono. increasing?: " + test5.isMonoIncr());
        System.out.println("test 5 s. descending?: " + test5.isDesc());
        System.out.println("test 5 mono. decreasing?: " + test5.isMonoDecr());
        System.out.println("test 5 mono.?: " + test5.isMonotonic());
        System.out.println("test 5 keep above 9: " + test5.keepAbove(9));
        System.out.println("test 5 reject above 3: " + test5.rejectAbove(3));
        System.out.println("test 5 reversed: " + test5.reverse());      
        
    }

}
