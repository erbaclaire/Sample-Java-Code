import java.util.Scanner;

public class LinReg {

    public static void main(String[] args) {

	Obs[] points = new Obs[1000000];
	Scanner scn = new Scanner(System.in);
	int count=0;
	while (scn.hasNext()) {
	    try {
		String line = scn.nextLine();
		String[] sp = line.split(",");
		if (sp.length==2) {
		    if (count<points.length) {
			points[count] = new ObsObj(Double.parseDouble(sp[0]),Double.parseDouble(sp[1]));
			count++;
		    }
		    else {
			throw new IllegalArgumentException("Too many points for Obs array.");
		    }
		}
		else {
		    throw new IllegalArgumentException("Length not 2.");
		}
	    }
	    catch (Exception e) {
		System.out.println("This is not a valid input. Continue.");
	    }	
	}
	System.out.println("nObs is: " + count);
	Obs[] pointsNotNull = new Obs[count];
	for (int i=0;i<pointsNotNull.length;i++)
	    pointsNotNull[i] = points[i];
	Dataset data = new DatasetObj(pointsNotNull);
	if (data.numObs()>1) {
	    System.out.println("Best fit line: " + data.bestFit());
	    System.out.println("Mean distance between best fit line and observations: " + data.meanDistance(data.bestFit()));
	    System.out.println("Rsqaured: " + data.rsq());
	}
	else {
	    throw new IllegalArgumentException("Can not calculate with less than two data points.");
	}

    }

}
  
