//Homework 2
//Name: Claire Erba
//Date: 6/28/2018
//Cites: 1. MPCS 50101 Summer 2018 Lecture Notes.
//       2. Homework help via Piazza Q & A.
//       These notes and cites encompass work done on Time.java, TestTime.java, Interval.java, OpenInterval.java, ClosedInterval.java, Rational.java, RationalObj.java, and TestRational.java, as well.

public class TimeObj implements Time {

    //instance variables
    private int h;
    private int m;
    private int s;

    //constructor
    public TimeObj(int h, int m, int s) {

	//validation
	if (h<0 || h>23) {
	    throw new IllegalArgumentException ("h wrong");
	}
	if (m<0 || m>59) {
	    throw new IllegalArgumentException ("m wrong");
	}
	if (s<0 || s>59) {
	     throw new IllegalArgumentException ("s wrong");
	}

	this.h = h;
	this.m = m;
	this.s = s;
    }

    //methods
    public int getHour() {
	return this.h;
    }

    public int getMinute() {
	return this.m;
    }

    public int getSecond() {
	return this.s;
    }

    public boolean same(Time that) {
	return (this.h == that.getHour())
	    && (this.m == that.getMinute())
	    && (this.s == that.getSecond());
    }

    public boolean before(Time that) {
	return (this.h < that.getHour())
	    || (this.h == that.getHour() && this.m < that.getMinute())
	    || (this.h == that.getHour() && this.m == that.getMinute() && this.s < that.getSecond());
    }
    
    public boolean after(Time that) {
	return (this.h > that.getHour())
	    || (this.h == that.getHour() && this.m > that.getMinute())
	    || (this.h == that.getHour() && this.m == that.getMinute() && this.s > that.getSecond());
    }

    public int secondsSinceMidnight() {
	return this.h*60*60 + this.m*60 + this.s;
    }

    public String toString() {
	if (this.m<10 && this.s>=10) {
	    return this.h + ":0" + this.m + ":" + this.s;
	}
	if (this.s<10 && this.m>=10) {
	    return this.h + ":" + this.m + ":0" + this.s;
	}
	if (this.m<10 && this.s<10) {
	    return this.h + ":0" + this.m + ":0" + this.s;
	}
	else {
	    return this.h + ":" + this.m + ":" + this.s;
	}
    }

    public String ampmString() {
	if (this.h>12) {
	   if (this.m<10 && this.s>=10) {
	       return (this.h-12) + ":0" + this.m + ":" + this.s + "pm";
	   }
	   if (this.s<10 && this.m>=10) {
	       return (this.h-12) + ":" + this.m + ":0" + this.s + "pm";
	   }
	   if (this.m<10 && this.s<10) {
	       return (this.h-12) + ":0" + this.m + ":0" + this.s + "pm";
	   }
	   else {
	       return (this.h-12) + ":" + this.m + ":" + this.s + "pm";
	   }
	}
	if (this.h==12) {
	    return this.toString() + "pm";
	}
	else {
	    return this.toString() + "am";
	}	 
    }

}
