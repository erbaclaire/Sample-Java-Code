public interface StudentSystem {
    // the interface doesn't mandate this, but use a hash table in your implementation
    public boolean hasStudent(int ID);

    public void addRecord(int ID, StudentRecord sr);
    // for addRecord, raise an exception if the ID is already present in the system

    public StudentRecord lookup(int ID);

    public Integer IDByName(String lname, String fname);

}
