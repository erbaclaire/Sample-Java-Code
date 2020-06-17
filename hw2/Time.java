public interface Time {
    public int getHour();   // between 0 and 23
    public int getMinute(); // between 0 and 59
    public int getSecond(); // between 0 and 59
    public boolean same(Time that);
    public boolean before(Time that);
    public boolean after(Time that);
    public int secondsSinceMidnight();
    public String toString(); // like "9:04:23" or "13:00:01"
    public String ampmString();     // like "9:04:23am" or "1:00:01pm"
}
