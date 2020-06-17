public class Node implements IBT {

    private int root;
    private IBT lsub;
    private IBT rsub;

    public Node(int root, IBT lsub, IBT rsub) {
        if (lsub==null | rsub==null)
            throw new IllegalArgumentException("lsub or rsub is null");
        this.root=root;
        this.lsub=lsub;
        this.rsub=rsub;
    }

    public Node(int root) {
        this.root=root;
        this.lsub = new Empty();
        this.rsub = new Empty();
    }
    
    public boolean isEmpty() {
        return false;
    }

    public int getRoot() {
        return this.root;
    }
    
    public IBT getLSub() {
        return this.lsub;
    }
        
    public IBT getRSub() {
        return this.rsub;
    }

    public Integer maxItem() {
        if (this.rsub.isEmpty() && this.lsub.isEmpty())
            return this.root;
        if (this.lsub.isEmpty() && !this.rsub.isEmpty())
            return (this.rsub.maxItem()>this.root) ? this.rsub.maxItem() : this.root;
        if (this.rsub.isEmpty() && !this.lsub.isEmpty())
            return (this.lsub.maxItem()>this.root) ? this.lsub.maxItem() : this.root;
        if (this.root>this.lsub.maxItem() && this.root>this.rsub.maxItem()) 
            return this.root;
        return (this.lsub.maxItem()>this.rsub.maxItem()) ? this.lsub.maxItem() : this.rsub.maxItem();
    }
    
    public Integer minItem() {
        if (this.rsub.isEmpty() && this.lsub.isEmpty())
            return this.root;
        if (this.lsub.isEmpty() && !this.rsub.isEmpty())
            return (this.rsub.minItem()<this.root) ? this.rsub.minItem() : this.root;
        if (this.rsub.isEmpty() && !this.lsub.isEmpty())
            return (this.lsub.minItem()<this.root) ? this.lsub.minItem() : this.root;
        if (this.root<this.lsub.minItem() && this.root<this.rsub.minItem()) 
            return this.root;
        return (this.lsub.minItem()<this.rsub.minItem()) ? this.lsub.minItem() : this.rsub.minItem();       
    }

    public boolean contains(int n) {
        return (this.root==n || this.lsub.contains(n) || this.rsub.contains(n));
    }
    
    public int count(int n) {
        return this.root==n ? 1 + this.lsub.count(n) + this.rsub.count(n) : this.lsub.count(n) + this.rsub.count(n);
    }

    public int size() {
        return 1 + this.lsub.size() + this.rsub.size();
    }

    public int sum() {
        return this.root + this.lsub.sum() + this.rsub.sum();
    }
    
    public int product() {
        return this.root * this.lsub.product() * this.rsub.product();
    }

    public Integer leftmost() {
        return this.lsub.isEmpty() ? this.root : this.lsub.leftmost();
    }
    
    public Integer rightmost() {
        return this.rsub.isEmpty() ? this.root : this.rsub.rightmost();
    }

    public boolean isMinHeap() {
        if (this.lsub.isEmpty() && this.rsub.isEmpty())
            return true;
        if (this.lsub.isEmpty() && !this.rsub.isEmpty())
            return (this.rsub.isMinHeap() && this.root<this.rsub.getRoot());
        if (this.rsub.isEmpty() && !this.lsub.isEmpty())
            return (this.lsub.isMinHeap() && this.root<this.lsub.getRoot());
        return (this.lsub.isMinHeap() && this.rsub.isMinHeap() && this.root<this.lsub.getRoot() && this.root<this.rsub.getRoot());
    }
    
    public boolean isBST() {
        if (this.lsub.isEmpty() && this.rsub.isEmpty())
            return true;
        if (this.lsub.isEmpty() && !this.rsub.isEmpty())
            return (this.rsub.isBST() && this.root<this.rsub.getRoot());
        if (this.rsub.isEmpty() && !this.lsub.isEmpty())
            return (this.lsub.isBST() && this.root>this.lsub.getRoot());
        return (this.lsub.isBST() && this.rsub.isBST() && this.root>this.lsub.getRoot() && this.root<this.rsub.getRoot());
    }

    public IBT square() {
        return new Node(this.root*this.root,this.lsub.square(),this.rsub.square());
    }
    
    public IBT cube() {
        return new Node(this.root*this.root*this.root,this.lsub.cube(),this.rsub.cube());
    }
    
    public IBT add(int n) {
        return new Node(this.root+n,this.lsub.add(n),this.rsub.add(n));
    }

    public boolean allGT(int n) {
	return (this.root>n && this.lsub.allGT(n) && this.rsub.allGT(n));
    }

    public IUT unroll() {
        if (this.lsub.isEmpty() && this.rsub.isEmpty())
            return new Cons(this.root);
        if (this.lsub.isEmpty() && !this.rsub.isEmpty())
            return new Cons(this.root, this.rsub.unroll());
        if (this.rsub.isEmpty() && !this.lsub.isEmpty())
            return new Cons(this.root, this.lsub.unroll());
        IUT left = new Cons(this.root, this.lsub.unroll());
        IUT right = new Cons(this.rsub.unroll().first(), this.rsub.unroll().rest());
        return left.append(right);
    }

    public boolean equals(Object o) {
        if (o==null || !(o instanceof IBT))
            return false;
	IBT that = (IBT)o;
        return (that.getRoot()==this.root && that.getLSub().equals(this.lsub) && that.getRSub().equals(this.rsub));
    }
    
    public String toString() {
        return this.root + "(L)" + this.lsub.toString() + "(R)" + this.rsub.toString() ;
    }

}
