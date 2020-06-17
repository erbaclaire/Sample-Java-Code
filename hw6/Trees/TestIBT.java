
public class TestIBT {

    public static void main(String[] args) {

        //test tree with only node
        IBT test0 = new Node(19);
        System.out.println("test 0 root: " + test0.getRoot());
        System.out.println("test 0 lsub: " + test0.getLSub());
        System.out.println("test 0 rsub: " + test0.getRSub());
        System.out.println("test 0 max: " + test0.maxItem());
        System.out.println("test 0 min: " + test0.minItem());
        System.out.println("test 0 contains 15: " + test0.contains(15));
        System.out.println("test 0 contains -105: " + test0.contains(-105));
        System.out.println("test 0 count 3: " + test0.count(3));
        System.out.println("test 0 size: " + test0.size());
        System.out.println("test 0 sum: " + test0.sum());
        System.out.println("test 0 product: " + test0.product());
        System.out.println("test 0 leftmost: " + test0.leftmost());
        System.out.println("test 0 rightmost: " + test0.rightmost());
        System.out.println("test 0 isMinHeap?: " + test0.isMinHeap());
        System.out.println("test 0 is BST?: " + test0.isBST());
        System.out.println("test 0 square: " + test0.square());
        System.out.println("test 0 cube: " + test0.cube());
        System.out.println("test 0 add 66: " + test0.add(66));
        System.out.println("test 0 unroll: " + test0.unroll());
        System.out.println("test 0 gt -100: " + test0.allGT(-100));
        System.out.println("test 0 equals?: " + test0.equals(test0));
	System.out.println("test 0 equals?: " + test0.equals(new Node(19, new Empty(), new Empty())));

        //test simple trees for MinHeap and BST
        IBT test00 = new Node(19,new Node(8),new Node(25));
        System.out.println("test 00 isMinHeap?: " + test00.isMinHeap());
        System.out.println("test 00 is BST?: " + test00.isBST());
        System.out.println("test 00 unroll: " + test00.unroll());

        IBT test000 = new Node(19,new Node(67),new Node(25));
        System.out.println("test 000 isMinHeap?: " + test000.isMinHeap());
        System.out.println("test 000 is BST?: " + test000.isBST());
        System.out.println("test 000 unroll: " + test000.unroll());

        //test empty
        IBT test0000 = new Empty();
        //System.out.println("test 000 root: " + test000.getRoot());
        //System.out.println("test 000 lsub: " + test000.getLSub());
        //System.out.println("test 000 rsub: " + test000.getRSub());
        System.out.println("test 0000 max: " + test0000.maxItem());
        System.out.println("test 0000 min: " + test0000.minItem());
        System.out.println("test 0000 contains 15: " + test0000.contains(15));
        System.out.println("test 0000 contains -105: " + test0000.contains(-105));
        System.out.println("test 0000 count 3: " + test0000.count(3));
        System.out.println("test 0000 size: " + test0000.size());
        System.out.println("test 0000 sum: " + test0000.sum());
        System.out.println("test 0000 product: " + test0000.product());
        System.out.println("test 0000 leftmost: " + test0000.leftmost());
        System.out.println("test 0000 rightmost: " + test0000.rightmost());
        System.out.println("test 0000 isMinHeap?: " + test0000.isMinHeap());
        System.out.println("test 0000 is BST?: " + test0000.isBST());
        System.out.println("test 0000 square: " + test0000.square());
        System.out.println("test 0000 cube: " + test0000.cube());
        System.out.println("test 0000 add 66: " + test0000.add(66));
        System.out.println("test 0000 unroll: " + test0000.unroll());
        System.out.println("test 0000 gt -100: " + test0000.allGT(-100));
        System.out.println("test 0000 equals?: " + test0000.equals(test0));
        
        //test more complicated - should be neither MinHeap nor BST
        IBT test1 = new Node(-5,
                             new Node(15,
                                      new Node(-7),
                                      new Node(3)),
                             new Node(-4,
                                      new Node(2,
                                               new Node(1),
                                               new Node(32)),
                                      new Node(3)));
        System.out.println("test 1 root: " + test1.getRoot());
        System.out.println("test 1 lsub: " + test1.getLSub());
        System.out.println("test 1 rsub: " + test1.getRSub());
        System.out.println("test 1 max: " + test1.maxItem());
        System.out.println("test 1 min: " + test1.minItem());
        System.out.println("test 1 contains 15: " + test1.contains(15));
        System.out.println("test 1 contains -105: " + test1.contains(-105));
        System.out.println("test 1 count 3: " + test1.count(3));
        System.out.println("test 1 size: " + test1.size());
        System.out.println("test 1 sum: " + test1.sum());
        System.out.println("test 1 product: " + test1.product());
        System.out.println("test 1 leftmost: " + test1.leftmost());
        System.out.println("test 1 rightmost: " + test1.rightmost());
        System.out.println("test 1 isMinHeap?: " + test1.isMinHeap());
        System.out.println("test 1 is BST?: " + test1.isBST());
        System.out.println("test 1 square: " + test1.square());
        System.out.println("test 1 cube: " + test1.cube());
        System.out.println("test 1 add -9: " + test1.add(-9));
        System.out.println("test 1 gt -100: " + test1.allGT(-100));
        System.out.println("test 1 unroll: " + test1.unroll());
        System.out.println("test 1 equals?: " + test1.equals(test1));
        System.out.println("test 1 equals?: " + test1.equals(test0));

        //test more complicated - should be MinHeap but not BST
        IBT test2 = new Node(-5,
                             new Node(15,
                                      new Node(16),
                                      new Node(17)),
                             new Node(-4,
                                      new Node(2,
                                               new Node(7),
                                               new Node(32)),
                                      new Node(1,
                                               new Node(2),
                                               new Empty())));
        System.out.println("test 2 root: " + test2.getRoot());
        System.out.println("test 2 lsub: " + test2.getLSub());
        System.out.println("test 2 rsub: " + test2.getRSub());
        System.out.println("test 2 max: " + test2.maxItem());
        System.out.println("test 2 min: " + test2.minItem());
        System.out.println("test 2 contains 15: " + test2.contains(15));
        System.out.println("test 2 contains 2: " + test2.contains(2));
        System.out.println("test 2 count 2: " + test2.count(2));
        System.out.println("test 2 size: " + test2.size());
        System.out.println("test 2 sum: " + test2.sum());
        System.out.println("test 2 product: " + test2.product());
        System.out.println("test 2 leftmost: " + test2.leftmost());
        System.out.println("test 2 rightmost: " + test2.rightmost());
        System.out.println("test 2 isMinHeap?: " + test2.isMinHeap());
        System.out.println("test 2 is BST?: " + test2.isBST());
        System.out.println("test 2 square: " + test2.square());
        System.out.println("test 2 cube: " + test2.cube());
        System.out.println("test 2 add -9: " + test2.add(-9));
        System.out.println("test 2 gt 15: " + test2.allGT(15));
        System.out.println("test 2 unroll: " + test2.unroll());
        System.out.println("test 2 equals?: " + test2.equals(test1));
        System.out.println("test 2 equals?: " + test2.equals(test0));

        //test more complicated - should be BST but not MinHeap
        IBT test3 = new Node(6,
                             new Node(4,
                                      new Node(-2,
                                               new Empty(),
                                               new Node(0)),
                                      new Node(8)),
                             new Node(7,
                                      new Node(0),
                                      new Node(9)));
        System.out.println("test 3 root: " + test3.getRoot());
        System.out.println("test 3 lsub: " + test3.getLSub());
        System.out.println("test 3 rsub: " + test3.getRSub());
        System.out.println("test 3 max: " + test3.maxItem());
        System.out.println("test 3 min: " + test3.minItem());
        System.out.println("test 3 contains 8: " + test3.contains(8));
        System.out.println("test 3 contains 4: " + test3.contains(4));
        System.out.println("test 3 count 0: " + test3.count(0));
        System.out.println("test 3 size: " + test3.size());
        System.out.println("test 3 sum: " + test3.sum());
        System.out.println("test 3 product: " + test3.product());
        System.out.println("test 3 leftmost: " + test3.leftmost());
        System.out.println("test 3 rightmost: " + test3.rightmost());
        System.out.println("test 3 isMinHeap?: " + test3.isMinHeap());
        System.out.println("test 3 is BST?: " + test3.isBST());
        System.out.println("test 3 square: " + test3.square());
        System.out.println("test 3 cube: " + test3.cube());
        System.out.println("test 3 add 4: " + test3.add(4));
        System.out.println("test 3 gt 0: " + test3.allGT(0));
        System.out.println("test 3 unroll: " + test3.unroll());
        System.out.println("test 3 equals?: " + test3.equals(test1));
        System.out.println("test 3 equals?: " + test3.equals(test3));

        //test super complicated
        IBT test4 = new Node(5,
                             new Empty(),
                             new Node(6,
                                      new Node(3,
                                               new Node(2,
                                                        new Node(-5),
                                                        new Empty()),
                                               new Node(8)),
                                      new Node(-4,
                                               new Node(7,
                                                        new Empty(),
                                                        new Node(37)),
                                               new Node(6))));
        System.out.println("test 4 root: " + test4.getRoot());
        System.out.println("test 4 lsub: " + test4.getLSub());
        System.out.println("test 4 rsub: " + test4.getRSub());
        System.out.println("test 4 max: " + test4.maxItem());
        System.out.println("test 4 min: " + test4.minItem());
        System.out.println("test 4 contains 8: " + test4.contains(8));
        System.out.println("test 4 contains 4: " + test4.contains(4));
        System.out.println("test 4 count 0: " + test4.count(0));
        System.out.println("test 4 size: " + test4.size());
        System.out.println("test 4 sum: " + test4.sum());
        System.out.println("test 4 product: " + test4.product());
        System.out.println("test 4 leftmost: " + test4.leftmost());
        System.out.println("test 4 rightmost: " + test4.rightmost());
        System.out.println("test 4 isMinHeap?: " + test4.isMinHeap());
        System.out.println("test 4 is BST?: " + test4.isBST());
        System.out.println("test 4 square: " + test4.square());
        System.out.println("test 4 cube: " + test4.cube());
        System.out.println("test 4 add 4: " + test4.add(4));
        System.out.println("test 4 gt 0: " + test4.allGT(0));
        System.out.println("test 4 unroll: " + test4.unroll());
        System.out.println("test 4 equals?: " + test4.equals(test1));
        System.out.println("test 4 equals?: " + test4.equals(test3));

        //test again
        IBT test5 = new Node(5,
                             new Empty(),
                             new Node(6,
                                      new Empty(),                                    
                                      new Node(7,
                                               new Empty(),
                                               new Node(10))));
        System.out.println("test 5 root: " + test5.getRoot());
        System.out.println("test 5 lsub: " + test5.getLSub());
        System.out.println("test 5 rsub: " + test5.getRSub());
        System.out.println("test 5 max: " + test5.maxItem());
        System.out.println("test 5 min: " + test5.minItem());
        System.out.println("test 5 contains 8: " + test5.contains(8));
        System.out.println("test 5 contains 10: " + test5.contains(10));
        System.out.println("test 5 size: " + test5.size());
        System.out.println("test 5 sum: " + test5.sum());
        System.out.println("test 5 product: " + test5.product());
        System.out.println("test 5 leftmost: " + test5.leftmost());
        System.out.println("test 5 rightmost: " + test5.rightmost());
        System.out.println("test 5 isMinHeap?: " + test5.isMinHeap());
        System.out.println("test 5 is BST?: " + test5.isBST());
        System.out.println("test 5 square: " + test5.square());
        System.out.println("test 5 cube: " + test5.cube());
        System.out.println("test 5 add 4: " + test5.add(4));
        System.out.println("test 5 gt 0: " + test5.allGT(0));
        System.out.println("test 5 unroll: " + test5.unroll());
    }

}
