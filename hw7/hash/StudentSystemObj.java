public class StudentSystemObj implements StudentSystem {

    private HashTable<Integer,StudentRecord> table;

    public StudentSystemObj(int numBuckets) {
	if (numBuckets<1)
	    throw new IllegalArgumentException("must have at least 1 bucket");
	this.table = new HashTable<Integer,StudentRecord>(numBuckets);
    }

    public boolean hasStudent(int ID) {
	return this.table.includesKey(ID);
    }

    public void addRecord(int ID, StudentRecord sr) {
	if (this.hasStudent(ID))
	    throw new IllegalArgumentException("student id is already in the system");
	this.table.put(ID, sr);
    }

    public StudentRecord lookup(int ID) {
	return (StudentRecord)this.table.get(ID);
    }

    public Integer IDByName(String lname, String fname) {
	for (int i=0;i<this.table.values().size();i++)
	    if (lname.equals(((StudentRecord)this.table.values().get(i)).getLName()) && fname.equals(((StudentRecord)this.table.values().get(i)).getFName()))
		return (Integer)this.table.keys().get(i);
	return null;
    }

    public static void main(String[] args) {
	StudentSystem sys = new StudentSystemObj(5);
	sys.addRecord(1034567, new StudentRecord("Erba", "Claire", "9/29/1993", "Economics", 2015));
	sys.addRecord(1000000, new StudentRecord("Bloom", "Judy", "12/31/1957", "Religious Studies", 1976));
	sys.addRecord(1244567, new StudentRecord("Wilkowski", "Greg", "12/1/1985", "History", 2010));
	sys.addRecord(3456123, new StudentRecord("Erba", "Madeleine", "7/14/1991", "Biology", 2013));

	System.out.println("tb has student 3456123?: " + sys.hasStudent(3456123));
	System.out.println("tb has student 46?: " + sys.hasStudent(46));
	sys.addRecord(4659876,new StudentRecord("Erba", "Jake", "12/23/1995", "Chemistry", 2019));
	try {
	    sys.addRecord(3456123, new StudentRecord("McMan", "Dude", "4/24/1999", "", 2020));
	}
	catch (Exception e) {
	    System.out.println("student already is already used");
	}
	System.out.println("1244567: " + sys.lookup(1244567));
	System.out.println("354: " + sys.lookup(354));
	System.out.println("Bloom, Judy: " + sys.IDByName("Bloom", "Judy"));
	System.out.println("Winkle, Henry: " + sys.IDByName("Winkle", "Henry"));
    }

}
