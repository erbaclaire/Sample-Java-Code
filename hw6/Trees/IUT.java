public interface IUT {

    public boolean isEmpty();

    public int first();
    public IUT rest();

    public Integer maxItem();
    public Integer minItem();

    public boolean contains(int n);
    public int count(int n);

    public int length();

    public boolean isAsc(); // is strictly ascending
    public boolean isMonoIncr(); // "monotonically increasing", i.e. is never decreasing
    public boolean isDesc(); // is strictly descending
    public boolean isMonoDecr(); // monotonically decreasing
    public boolean isMonotonic(); // monotonic in either direction

    public IUT square();
    public IUT cube();
    public IUT add(int n);

    public IUT keepAbove(int threshold);
    public IUT rejectAbove(int threshold);

    public IUT putlast(int n);
    public IUT append(IUT that);
    public IUT reverse();

    // public boolean equals(Object o)
    // public String toString
}
