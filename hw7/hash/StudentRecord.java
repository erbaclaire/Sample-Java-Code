public class StudentRecord {

    private String LName;
    private String FName;
    private String DOB;
    private String Major;
    private int GraduationYear;

    //constructor assume names, DOBs, majors, graduation years are all valid except for null - even if they look strange
    public StudentRecord(String LName, String FName, String DOB, String Major, int GraduationYear) {
        if (LName==null || FName==null || DOB==null || Major==null)
            throw new IllegalArgumentException("one or many input is null");
        this.LName=LName;
        this.FName=FName;
        this.DOB=DOB;
        this.Major=Major;
        this.GraduationYear=GraduationYear;
    }

    public String getLName() {
        return this.LName;
    }

    public String getFName() {
        return this.FName;
    }

    public String getDOB() {
        return this.DOB;
    }

    public String getMajor() {
        return this.Major;
    }

    public int getGraduationYear() {
        return this.GraduationYear;
    }

    public boolean equals(Object o) {
        if (o==null | !(o instanceof StudentRecord))
            return false;
        StudentRecord that = (StudentRecord)o;
        return this.LName.equals(that.getLName()) && this.FName.equals(that.getFName()) && this.DOB.equals(that.getDOB()) && this.Major.equals(that.getMajor()) && this.GraduationYear==that.getGraduationYear();
    }

    public String toString() {
        return this.LName + "," + this.FName + " --- DOB: " + this.DOB + ", Major: " + this.Major + ", Expected/Actual Graduation Year: " + this.GraduationYear;
    }
            
}
