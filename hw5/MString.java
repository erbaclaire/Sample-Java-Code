public interface MString {
    public char[] getChars();
    public char charAt(int i);
    public int length();
    public boolean contains(char c);
    public int count(char c);
    public MString append(MString s);
    public MString replace(MString find, MString replace);
    public Integer firstOccurrence(char c);
    public Integer firstOccurrence(MString s);
    public MString substring(int start, int len);
    public MString uppercase();
    public MString lowercase();
    public MString truncate(int n); // truncate to max length n
    public boolean palindrome();
    public MString trim(); // remove space from either end
    public MString collapse(); // remove all spaces
    public MString encipher(int n); // operate on letters only, and wrap around
}
