public class TestBExp {

    public static void main(String[] args) {

        BExp t = new True();
        BExp f = new False();
        BExp n = new Not(new False());
        BExp a = new And(new True(), new False());
        BExp o = new Or(new True(), new False());

        System.out.println("****START TRUE TEST****");
        System.out.println(t);
        System.out.println("t true const?: " + t.isTrueConst());
        System.out.println("t false const?: " + t.isFalseConst());
        //System.out.println("t e1: " + t.getE1());
        //System.out.println("t e2: " + t.getE2());
        System.out.println("t size: " + t.size());
        System.out.println("t height: " + t.height());
        System.out.println("t n ops: " + t.numOperators());
        System.out.println("t n consts: " + t.numConstants());
        System.out.println("t python output: " + t.python());
        System.out.println("t evaluate: " + t.eval());
        System.out.println("t same result: " + t.sameResult(new And(BE.TRUE,BE.TRUE)));
        System.out.println("t same result: " + t.sameResult(new True()));
        System.out.println("t same result: " + t.sameResult(new Not(BE.TRUE)));
        System.out.println("t equals true const: " + t.equals(new True()));
        System.out.println("t equals new or statement: " + t.equals(new Or(BE.FALSE,BE.FALSE)));

        System.out.println("****START FALSE TEST****");
        System.out.println(f);
        System.out.println("f true const?: " + f.isTrueConst());
        System.out.println("f false const?: " + f.isFalseConst());
        //System.out.println("f e1: " + f.getE1());
        //System.out.println("f e2: " + f.getE2());
        System.out.println("f size: " + f.size());
        System.out.println("f height: " + f.height());
        System.out.println("f n ops: " + f.numOperators());
        System.out.println("f n consts: " + f.numConstants());
        System.out.println("f python output: " + f.python());
        System.out.println("f evaluate: " + f.eval());
        System.out.println("f same result: " + f.sameResult(new Or(BE.TRUE,BE.TRUE)));
        System.out.println("f same result: " + f.sameResult(new And(BE.FALSE,BE.TRUE)));
        System.out.println("f equals true const: " + f.equals(new True()));
        System.out.println("t equals false const: " + f.equals(new False()));

        System.out.println("****START NOT TEST****");
        System.out.println(n);
        System.out.println("n true const?: " + n.isTrueConst());
        System.out.println("n false const?: " + n.isFalseConst());
        System.out.println("n e1: " + n.getE1());
        //System.out.println("n e2: " + n.getE2());
        System.out.println("n size: " + n.size());
        System.out.println("n height: " + n.height());
        System.out.println("n n ops: " + n.numOperators());
        System.out.println("n n consts: " + n.numConstants());
        System.out.println("n python output: " + n.python());
        System.out.println("n evaluate: " + n.eval());
        System.out.println("n same result: " + n.sameResult(new Or(BE.TRUE,BE.TRUE)));
        System.out.println("n equals true const: " + n.equals(new True()));

        System.out.println("****START AND TEST****");
        System.out.println(a);
        System.out.println("a true const?: " + a.isTrueConst());
        System.out.println("a false const?: " + a.isFalseConst());
        System.out.println("a e1: " + a.getE1());
        System.out.println("a e2: " + a.getE2());
        System.out.println("a size: " + a.size());
        System.out.println("a height: " + a.height());
        System.out.println("a n ops: " + a.numOperators());
        System.out.println("a n consts: " + a.numConstants());
        System.out.println("a python output: " + a.python());
        System.out.println("a evaluate: " + a.eval());
        System.out.println("a same result: " + a.sameResult(new Or(BE.TRUE,BE.TRUE)));
        System.out.println("a equals itself: " + a.equals(a));
        System.out.println("a equals a reversed: " + a.equals(new And(BE.FALSE,BE.TRUE)));

        System.out.println("****START OR TEST****");
        System.out.println(o);
        System.out.println("o true const?: " + o.isTrueConst());
        System.out.println("o false const?: " + o.isFalseConst());
        System.out.println("o e1: " + o.getE1());
        System.out.println("o e2: " + o.getE2());
        System.out.println("o size: " + o.size());
        System.out.println("o height: " + o.height());
        System.out.println("o n ops: " + o.numOperators());
        System.out.println("o n consts: " + o.numConstants());
        System.out.println("o python output: " + o.python());
        System.out.println("o evaluate: " + o.eval());
        System.out.println("o same result: " + o.sameResult(new Or(BE.TRUE,BE.TRUE)));
        System.out.println("o equals a: " + o.equals(a));
        System.out.println("o equals o reversed: " + o.equals(new Or(BE.FALSE,BE.TRUE)));
        
        BExp test1 = new And(
                             new Or(
                                    new And(BE.TRUE,BE.FALSE),
                                    new Or(BE.TRUE,BE.TRUE)),
                             new Not(
                                     new And(BE.FALSE, BE.FALSE)));

        BExp test1reversed = new And(
                                     new Not(
                                             new And(BE.FALSE, BE.FALSE)),
                                     new Or(
                                            new And(BE.TRUE,BE.FALSE),
                                            new Or(BE.TRUE,BE.TRUE)));

        BExp test2 = new Not(
                             new And(
                                     new Or(
                                            new Not(BE.TRUE),BE.TRUE),
                                     BE.TRUE));

        BExp test3 = new Not(
                             new And(
                                     new Or(
                                            new Not(BE.TRUE),BE.TRUE),
                                     BE.FALSE));

        System.out.println("****START TEST1****");
        System.out.println(test1);
        System.out.println("test1 true const?: " + test1.isTrueConst());
        System.out.println("test1 false const?: " + test1.isFalseConst());
        System.out.println("test1 e1: " + test1.getE1());
        System.out.println("test1 e2: " + test1.getE2());
        System.out.println("test1 size: " + test1.size());
        System.out.println("test1 height: " + test1.height());
        System.out.println("test1 n ops: " + test1.numOperators());
        System.out.println("test1 n consts: " + test1.numConstants());
        System.out.println("test1 python output: " + test1.python());
        System.out.println("test1 evaluate: " + test1.eval());
        System.out.println("test1 same result as test2: " + test1.sameResult(test2));
        System.out.println("test1 same result as test3: " + test1.sameResult(test3));
        System.out.println("test1 equals test1?: " + test1.equals(test1));
        System.out.println("test1 equals test2?: " + test1.equals(test2));
        System.out.println("test1 equals test1 reversed: " + test1.equals(test1reversed));

        System.out.println("****START TEST2****");
        System.out.println(test2);
        System.out.println("test2 true const?: " + test2.isTrueConst());
        System.out.println("test2 false const?: " + test2.isFalseConst());
        System.out.println("test2 e1: " + test2.getE1());
        //System.out.println("test2 e2: " + test2.getE2());
        System.out.println("test2 size: " + test2.size());
        System.out.println("test2 height: " + test2.height());
        System.out.println("test2 n ops: " + test2.numOperators());
        System.out.println("test2 n consts: " + test2.numConstants());
        System.out.println("test2 python output: " + test2.python());
        System.out.println("test2 evaluate: " + test2.eval());
        System.out.println("test2 same result as o: " + test2.sameResult(o));
        System.out.println("test2 same result as a: " + test2.sameResult(a));
        

    }

}
        
