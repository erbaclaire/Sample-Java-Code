//Homework 3
//Name: Claire Erba
//Date: 7/6/2018
//Cites: 1. MPCS Summer 2018 Lecture Notes.
//       2. Classmate collaboration with Eshwan Ramuda and Simeon Marking.
//       3. Homework help via Piazza Q & A.
//Notes: Observe maxX() as an example. If the dataset is empty, I return null immeditaley and then
//       I exit the method immediately. If it is not empty, I do normal logic without an else statement
//       because if it wasn't a non-empty dataset it would have already exited the method (just

public class DatasetObj implements Dataset {

    private Obs[] obs;

    //constructor
    public DatasetObj(Obs[] obs) {
        if (obs==null) {
            throw new IllegalArgumentException ("Obs array is null");
        }
        for (int i=0;i<obs.length;i++){
            if (obs[i]==null){
                throw new IllegalArgumentException ("obs is null");
            }
        }
        this.obs = obs;
    }

    //methods
    public int numObs() {
        return this.obs.length;
    }

    public boolean isEmpty() {
        return (this.obs.length==0);
    }

    public Double maxX() {
        if (this.isEmpty()==true) {
            return null;
        }
        Double xMax = new Double(this.obs[0].getX());
        for (int i=1;i<this.numObs();i++) {
            if (this.obs[i].getX()>xMax) {
                xMax = this.obs[i].getX();
            }
        }
        return xMax;
    }

    public Double maxY() {
        if (this.isEmpty()==true) {
            return null;
        }
        Double yMax = new Double(this.obs[0].getY());
        for (int i=1;i<this.numObs();i++) {
            if (this.obs[i].getY()>yMax) {
                yMax = this.obs[i].getY();
            }
        }
        return yMax;
    }

    //note: in the case of a tie, it returns the tied value in the least array position.
    public Obs leftmost() {
        if (this.isEmpty()==true) {
            return null;
        }
        Obs leftX = new ObsObj(this.obs[0].getX(),this.obs[0].getY());
        for (int i=1;i<this.numObs();i++) {
            if (this.obs[i].getX()<leftX.getX()) {
                leftX = this.obs[i];
            }
        }
        return leftX;
    }
    
    //note: in the case of a tie, it returns the tied value in the least array position.
    public Obs rightmost() {
        if (this.isEmpty()==true) {
            return null;
        }
        Obs rightX = new ObsObj(this.obs[0].getX(),this.obs[0].getY());
        for (int i=1;i<this.numObs();i++) {
            if (this.obs[i].getX()>rightX.getX()) {
                rightX = this.obs[i];
            }
        }
        return rightX;
    }
    
    public Double xSpan() {
        if (this.isEmpty()==true) {
            return null;
        }
        return new Double(this.rightmost().getX()-this.leftmost().getX());
    }
    
    public Double ySpan() {
        if (this.isEmpty()==true) {
            return null;
        }
        Double spanY = new Double(this.maxY()-this.obs[0].getY());
        for (int i=1;i<this.numObs();i++) {
            if (this.maxY()-this.obs[i].getY()>spanY) {
                spanY = this.maxY()-this.obs[i].getY();
            }
        }
        return spanY;
    }

    //note: assuming empty set has a sumX of 0 instead of throwing an exception.
    public double sumX() {
        double xSum = 0;
        for (int i=0;i<this.numObs();i++) {
            xSum += this.obs[i].getX();
        }
        return xSum;
    }

    //note: assuming empty set has a sumY of 0 instead of throwing an exception.
    public double sumY() {
        double ySum = 0;
        for (int i=0;i<this.numObs();i++) {
            ySum += this.obs[i].getY();
        }
        return ySum;
    }

    public Double meanX() {
        if (this.isEmpty()==true) {
            return null;
        }
        return new Double(this.sumX()/this.numObs());
    }

    public Double meanY() {
        if (this.isEmpty()==true) {
            return null;
        }
        return new Double(this.sumY()/this.numObs());
    }

    public Obs centroid() {
        if (this.isEmpty()==true) {
            return null;
        }
        return new ObsObj(this.meanX(), this.meanY());
    }

    public double[] xs() {
        double[] xsList = new double[this.numObs()];
        for (int i=0;i<this.numObs();i++) {
            xsList[i] = this.obs[i].getX();
        }
        return xsList;
    }

    public double[] ys() {
        double[] ysList = new double[this.numObs()];
        for (int i=0;i<this.numObs();i++) {
            ysList[i] = this.obs[i].getY();
        }
        return ysList;
    }

    public Dataset adjustUpwards(double dy) {
        Obs[] yAdjUp = new Obs[this.numObs()];
        if (this.isEmpty()==false) {
            for (int i=0;i<this.numObs();i++) {
                yAdjUp[i] = new ObsObj(this.obs[i].getX(), this.obs[i].getY()+dy);
            }
        }
        return new DatasetObj(yAdjUp);
    }

    //note: assumes empty dataset never contains an Obs.
    public boolean contains(Obs d) {
        boolean same = false;
        for (int i=0;i<this.numObs();i++) {
            if (this.obs[i].same(d)==true) {
                same = true;
            }
        }
        return same;
    }

    public Double meanDistance(Obs d) {
        if (this.isEmpty()==true) {
            return null;
        }
        Double distSum = new Double(0);
        for (int i=0;i<this.obs.length;i++) {
            distSum += this.obs[i].dist(d);
        }
        return distSum/this.numObs();
    }

    //note: assumes crossing X axis must go from strictly negative y-value to strictly positive y-value.
    public boolean crossesXAxis() {
        if (this.isEmpty()==true) {
            return false;
        }
        return (this.maxY()>0 && this.maxY()-this.ySpan()<0);
    }
    
    //note: assumes crossing Y axis must go from strictly negative x-value to strictly positive x-value.
    public boolean crossesYAxis() {
        if (this.isEmpty()==true) {
            return false;
        }
        return (this.maxX()>0 && this.maxX()-this.xSpan()<0);
    }

    //note: assumes empty dataset is always a subset.
    //note: assumes an array is a subset of itself (i.e not examining proper subsets here).
    //note: applies interpretation that a subset is "set1 is a subset of set2 if every item in set1 is present is set2.
    //      for instance [(1,2),(1,2),(3,4)] is a subset of [(1,2),(3,4)].
    public boolean subset(Dataset that){
        boolean sub = true;
        for (int i=0;i<this.numObs();i++) {
            if (that.contains(this.obs[i])==false) {
                sub = false;
            }
        }
        return sub;
    }

    //note: assumes empty dataset is never a superset except of itself -- since empty dataset is always a subset
    //      datasetEmpty is a subset of itself and therefor a supersept of itself too.
    //note: assumes an array is a superset of itself (i.e not examining proper supersets here).
    //note: assumes every non-empty dataset is a superset of the emprty dataset.
    public boolean superset(Dataset that) {
        return that.subset(this);
    }
    
    public String toString() {
        String datapoints = "[";
        if (this.isEmpty()==false) {
            datapoints += this.obs[0];
            for (int i=1;i<this.numObs();i++) {
                datapoints += "," + this.obs[i];
            }
        }
        return datapoints + "]";
    }

    public Line bestFit() {
        if (this.isEmpty()==true) return null;
        if (this.numObs()==1) return null; 
        double xySum=0;
        double xSum=0;
        double ySum=0;
        double xSquaredSum=0;
        for(int i=0;i<this.numObs();i++) {
            xySum += this.obs[i].getX()*this.obs[i].getY();
            xSum += this.obs[i].getX();
            ySum += this.obs[i].getY();
            xSquaredSum += this.obs[i].getX()*this.obs[i].getX();
        }
        if ((this.numObs()*xSquaredSum)-(xSum*xSum)==0) throw new IllegalArgumentException("vertical line or same points");
        Line bfLine = new NVLineObj(((this.numObs()*xySum)-(xSum*ySum))/((this.numObs()*xSquaredSum)-(xSum*xSum)),
                                    ((ySum*xSquaredSum)-(xSum*xySum))/((this.numObs()*xSquaredSum)-(xSum*xSum)));
        return bfLine;
    }

    public Double meanDistance(Line n) {
        if (this.isEmpty()==true) return null;
        Double distance = new Double(0);
        for(int i=0;i<this.numObs();i++) {
            distance += Math.abs(n.getB()+(n.getM()*this.obs[i].getX())-this.obs[i].getY())/Math.sqrt(1+(n.getM()*n.getM()));
        }
        return distance/this.numObs();
    }
}
                    
        
