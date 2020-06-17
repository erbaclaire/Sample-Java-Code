public class Empty implements IBT {

    public boolean isEmpty() {
        return true;
    }

    public int getRoot() {
        throw new UnsupportedOperationException("no root");
    }
    
    public IBT getLSub() {
        throw new UnsupportedOperationException("no LSub");
    }
        
    public IBT getRSub() {
        throw new UnsupportedOperationException("no RSub");
    }

    public Integer maxItem() {
        return null;
    }
    
    public Integer minItem() {
        return null;
    }

    public boolean contains(int n) {
        return false;
    }
    
    public int count(int n) {
        return 0;
    }

    public int size() {
        return 0;
    }

    public int sum() {
        return 0;
    }

    //A. Shaw says product should be 1 in this case
    public int product() {
        return 1;
    }

    public Integer leftmost() {
        return null;
    }
    
    public Integer rightmost() {
        return null;
    }

    public boolean isMinHeap() {
        return true;
    }
    
    public boolean isBST() {
        return true;
    }

    public IBT square() {
        return this;
    }
    
    public IBT cube() {
        return this;
    }
    
    public IBT add(int n) {
        return this;
    }

    public boolean allGT(int n) {
        return true;
    }

    public IUT unroll() {
        return new Nil();
    }

    public boolean equals(Object o) {
        if (o==null || !(o instanceof IBT))
            return false;
	IBT that = (IBT)o;
        return that.isEmpty();
    }
    
    public String toString() {
        return "empty";
    }

}
