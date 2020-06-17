public interface IBT {

    public boolean isEmpty();

    public int getRoot();
    public IBT getLSub();
    public IBT getRSub();

    public Integer maxItem();
    public Integer minItem();

    public boolean contains(int n);
    public int count(int n);

    public int size();
    public int sum();
    public int product();

    public Integer leftmost();
    public Integer rightmost();

    public boolean isMinHeap();
    public boolean isBST();

    public IBT square();
    public IBT cube();
    public IBT add(int n);

    public boolean allGT(int n);

    public IUT unroll();

    // public boolean equals(Object o)
    // public String toString()
}
