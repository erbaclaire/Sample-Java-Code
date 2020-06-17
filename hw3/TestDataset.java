//note: Eshwan recommended this so I could see double[] output. 
import java.util.Arrays;

public class TestDataset {

    public static void main(String[] args) {

	//test validation
	/*
	Obs[] obs0 = new Obs[2];
	obs0[0]=new ObsObj(3.22,4.89);
	obs0[1]=null;
	Dataset datasetNull = new DatasetObj(obs0);
	

	Obs[] obs00;
	obs00=null;
	Dataset datasetNull2 = new DatasetObj(obs00);
	*/
	
	//create test arrays
	Obs[] obs1 = new Obs[5];
	obs1[0]=new ObsObj(3.22,4.89);
	obs1[1]=new ObsObj(-2.34,5.67);
	obs1[2]=new ObsObj(-9.8,-10.77);
	obs1[3]=new ObsObj(6.90,-10.77);
	obs1[4]=new ObsObj(6.90,-9.77);
	Dataset dataset = new DatasetObj(obs1);

	Obs[] obs2 = new Obs[0];
	Dataset datasetEmpty = new DatasetObj(obs2);

	Obs[] obs3 = new Obs[3];
	obs3[0]=new ObsObj(-2.34, 5.67);
	obs3[1]=new ObsObj(6.90,-10.77);
	obs3[2]=new ObsObj(-9.8,-10.77);
	Dataset datasetThat1 = new DatasetObj(obs3);
	
	Obs[] obs4 = new Obs[6];
	obs4[0]=new ObsObj(-2.34,5.67);
	obs4[1]=new ObsObj(6.9,-9.77);
	obs4[2]=new ObsObj(-9.8,-10.77);
	obs4[3]=new ObsObj(13.45,-5.6);
	obs4[4]=new ObsObj(3.22,4.89);
	obs4[5]=new ObsObj(6.90,-10.77);
	Dataset datasetThat2 = new DatasetObj(obs4);

	Obs[] obs5 = new Obs[6];
	obs5[0]=new ObsObj(6.89,2.46);
	obs5[1]=new ObsObj(-2.36,10.1010);
	obs5[2]=new ObsObj(-9.899,-10.77987);
	obs5[3]=new ObsObj(5.88,-11.77);
	obs5[4]=new ObsObj(5.90,-9.77);
	obs5[5]=new ObsObj(13.25,7.89);
	Dataset datasetThat3 = new DatasetObj(obs5);

	Obs[] obs6 = new Obs[5];
	obs6[0]=new ObsObj(6.9,-9.77);
	obs6[1]=new ObsObj(3.22,4.89);
	obs6[2]=new ObsObj(-2.34,5.67);
	obs6[3]=new ObsObj(6.90,-10.77);
	obs6[4]=new ObsObj(-9.8,-10.77);
	Dataset datasetThat4 = new DatasetObj(obs6);

	Obs[] obs7 = new Obs[1];
	obs7[0] = new ObsObj(13.25,7.89);
	Dataset datasetOneObs = new DatasetObj(obs7);
	
	//test regular dataset
	System.out.println("Start test: normal dataset");
	System.out.println("NumObs: " + dataset.numObs());
	System.out.println("isEmpty?: " + dataset.isEmpty());
	System.out.println("Max x value: " + dataset.maxX());
	System.out.println("May y value: " + dataset.maxY());
	System.out.println("Leftmost point: " + dataset.leftmost());	
	System.out.println("Rightmost point: " + dataset.rightmost());
	System.out.println("Span of x values: " + dataset.xSpan());
	System.out.println("Span of y value: " + dataset.ySpan());
	System.out.println("Sum of x values: " + dataset.sumX());
	System.out.println("Sum of y values: " + dataset.sumY());
	System.out.println("Mean of x values: " + dataset.meanX());
	System.out.println("Mean of y values: " + dataset.meanY());
	System.out.println("Centroid: " + dataset.centroid());
	System.out.println("X values: " + Arrays.toString(dataset.xs()));
	System.out.println("Y values: " + Arrays.toString(dataset.ys()));
	System.out.println("Points adjusted up: " + dataset.adjustUpwards(6.77));
	System.out.println("Contains?: " + dataset.contains(new ObsObj(6.9,-10.77)));
	System.out.println("Contains?: " + dataset.contains(new ObsObj(5.6,-2.77)));
	System.out.println("Mean distance: " + dataset.meanDistance(new ObsObj(1,3)));
	System.out.println("Crosses x axis?: " + dataset.crossesXAxis());
	System.out.println("Crosses y axis?: " + dataset.crossesYAxis());
	System.out.println("Is subset?: " + dataset.subset(datasetThat1));
	System.out.println("Is subset?: " + dataset.subset(datasetThat2));
	System.out.println("Is subset?: " + dataset.subset(datasetThat3));
	System.out.println("Is subset?: " + dataset.subset(datasetThat4));
	System.out.println("Is subset?: " + dataset.subset(datasetEmpty));
	System.out.println("Is superset?: " + dataset.superset(datasetThat1));
	System.out.println("Is superset?: " + dataset.superset(datasetThat2));
	System.out.println("Is superset?: " + dataset.superset(datasetThat3));
	System.out.println("Is superset?: " + dataset.superset(datasetThat4));
	System.out.println("Is superset?: " + dataset.superset(datasetEmpty));
	System.out.println("Dataset: " + dataset.toString());

	//test empty dataset
	System.out.println("Start test: empty dataset");
	System.out.println("NumObs: " + datasetEmpty.numObs());
	System.out.println("isEmpty?: " + datasetEmpty.isEmpty());
	System.out.println("Max x value: " + datasetEmpty.maxX());
	System.out.println("May y value: " + datasetEmpty.maxY());
	System.out.println("Leftmost point: " + datasetEmpty.leftmost());	
	System.out.println("Rightmost point: " + datasetEmpty.rightmost());
	System.out.println("Span of x values: " + datasetEmpty.xSpan());
	System.out.println("Span of y value: " + datasetEmpty.ySpan());
	System.out.println("Sum of x values: " + datasetEmpty.sumX());
	System.out.println("Sum of y values: " + datasetEmpty.sumY());
	System.out.println("Mean of x values: " + datasetEmpty.meanX());
	System.out.println("Mean of y values: " + datasetEmpty.meanY());
	System.out.println("Centroid: " + datasetEmpty.centroid());
	System.out.println("X values: " + Arrays.toString(datasetEmpty.xs()));
	System.out.println("Y values: " + Arrays.toString(datasetEmpty.ys()));
	System.out.println("Points adjusted up: " + datasetEmpty.adjustUpwards(6.77));
	System.out.println("Contains?: " + datasetEmpty.contains(new ObsObj(6.9,-10.77)));
	System.out.println("Contains?: " + datasetEmpty.contains(new ObsObj(5.6,-2.77)));
	System.out.println("Mean distance: " + datasetEmpty.meanDistance(new ObsObj(1,3)));
	System.out.println("Crosses x axis?: " + datasetEmpty.crossesXAxis());
	System.out.println("Crosses y axis?: " + datasetEmpty.crossesYAxis());
	System.out.println("Is subset?: " + datasetEmpty.subset(datasetThat1));
	System.out.println("Is subset?: " + datasetEmpty.subset(datasetThat2));
	System.out.println("Is subset?: " + datasetEmpty.subset(datasetThat3));
	System.out.println("Is subset?: " + datasetEmpty.subset(datasetThat4));
	System.out.println("Is subset?: " + datasetEmpty.subset(datasetEmpty));
	System.out.println("Is superset?: " + datasetEmpty.superset(datasetThat1));
	System.out.println("Is superset?: " + datasetEmpty.superset(datasetThat2));
	System.out.println("Is superset?: " + datasetEmpty.superset(datasetThat3));
	System.out.println("Is superset?: " + datasetEmpty.superset(datasetThat4));
	System.out.println("Is superset?: " + datasetEmpty.superset(datasetEmpty));
	System.out.println("Dataset: " + datasetEmpty.toString());

	//test dataset with 1 obs
	System.out.println("Start test: 1 obs dataset");
	System.out.println("NumObs: " + datasetOneObs.numObs());
	System.out.println("isEmpty?: " + datasetOneObs.isEmpty());
	System.out.println("Max x value: " + datasetOneObs.maxX());
	System.out.println("May y value: " + datasetOneObs.maxY());
	System.out.println("Leftmost point: " + datasetOneObs.leftmost());	
	System.out.println("Rightmost point: " + datasetOneObs.rightmost());
	System.out.println("Span of x values: " + datasetOneObs.xSpan());
	System.out.println("Span of y value: " + datasetOneObs.ySpan());
	System.out.println("Sum of x values: " + datasetOneObs.sumX());
	System.out.println("Sum of y values: " + datasetOneObs.sumY());
	System.out.println("Mean of x values: " + datasetOneObs.meanX());
	System.out.println("Mean of y values: " + datasetOneObs.meanY());
	System.out.println("Centroid: " + datasetOneObs.centroid());
	System.out.println("X values: " + Arrays.toString(datasetOneObs.xs()));
	System.out.println("Y values: " + Arrays.toString(datasetOneObs.ys()));
	System.out.println("Points adjusted up: " + datasetOneObs.adjustUpwards(6.77));
	System.out.println("Contains?: " + datasetOneObs.contains(new ObsObj(13.25,7.89)));
	System.out.println("Contains?: " + datasetOneObs.contains(new ObsObj(5.6,-2.77)));
	System.out.println("Mean distance: " + datasetOneObs.meanDistance(new ObsObj(1,3)));
	System.out.println("Crosses x axis?: " + datasetOneObs.crossesXAxis());
	System.out.println("Crosses y axis?: " + datasetOneObs.crossesYAxis());
	System.out.println("Is subset?: " + datasetOneObs.subset(datasetThat1));
	System.out.println("Is subset?: " + datasetOneObs.subset(datasetThat2));
	System.out.println("Is subset?: " + datasetOneObs.subset(datasetThat3));
	System.out.println("Is subset?: " + datasetOneObs.subset(datasetThat4));
	System.out.println("Is subset?: " + datasetOneObs.subset(datasetEmpty));
	System.out.println("Is superset?: " + datasetOneObs.superset(datasetThat1));
	System.out.println("Is superset?: " + datasetOneObs.superset(datasetThat2));
	System.out.println("Is superset?: " + datasetOneObs.superset(datasetThat3));
	System.out.println("Is superset?: " + datasetOneObs.superset(datasetThat4));
	System.out.println("Is superset?: " + datasetOneObs.superset(datasetEmpty));
	System.out.println("Dataset: " + datasetOneObs.toString());
	
    }

}
	
