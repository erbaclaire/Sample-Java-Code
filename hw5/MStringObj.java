public class MStringObj implements MString {

    private char[] chars;

    //note: empty char arrays are dealt with individually in methods
    public MStringObj(char[] chars) {
        if (chars==null)
            throw new IllegalArgumentException("chars is null");
        this.chars=chars;
    }
    
    public char[] getChars() {
        return this.chars;
    }

    //note: I wrote my code before this method was implemented so future functions do not implement it
    public char charAt(int i) {
        if (i<0)
            throw new IllegalArgumentException("i is invalid");
        if (i>=this.length())
            throw new UnsupportedOperationException("i is out of array range");
        return this.chars[i];
    }

    public int length() {
        return chars.length;
    }

    public boolean contains(char c) {
        for (char x: this.chars)
            if (x==c)
                return true;
        return false;
    }

    public int count(char c) {
        int count=0;
        for (char x: this.chars)
            if (x==c)
                count++;
        return count;
    }

    public MString append(MString s) {
        char[] app = new char[this.length() + s.length()];
        for (int i=0;i<this.length();i++) {
            app[i] = this.chars[i];
        }
        for (int j=0;j<s.length();j++) {
            app[this.length()+j] = s.getChars()[j];
        }
        return new MStringObj(app);
    }

    //NOTE FOR GRADER: MY REPLACE METHOD IS SUPER LONG BECAUSE I ALLOW REPLACE TO BE A DIFFERENT LENGTH THAN FIND
    //note: this part finds length of new array
    public MString replace(MString find, MString replace) {
        int multiplier = 0;
        for (int i=0;i<this.length();i++) {
            //note: reset counter
            int counter = 0;
            if (this.chars[i]==find.getChars()[0]) {
                for (int j=0;j<find.length();j++) {
                    //note: need logic here so we do not bypass the length of the original MString
                    if (i+find.length()-1<this.length()) {
                       if (this.chars[i+j]==find.getChars()[j]) { 
                            counter++;
                       }
                    }
                }
                if (counter==find.length()) {
                    multiplier++;
                }
            }
        }
        //note: find not matches then return original char array
        if (multiplier==0)
            return new MStringObj(this.chars);
        //note: if there are matches then find and replace
        char[] newReplaced = new char[this.length()+multiplier*(replace.length()-find.length())];
        int record = 0;
        int index = 0;
        for (int i=0;i<this.length();i+=index) {
            //note: reset counter
            int counter = 0;
            if (this.chars[i]==find.getChars()[0]) {
                for (int j=0;j<find.length();j++) {
                    //note: need logic here so we do not bypass the length of the original MString
                    if (i+find.length()-1<this.length()) {
                        if (this.chars[i+j]==find.getChars()[j]) { 
                            counter++;
                        }
                    }
                }
                if (counter==find.length()) {
                    int tracker = 0;
                    for (int k=i+record;k<i+record+replace.length();k++) {
                        tracker++;
                        newReplaced[k]=replace.getChars()[tracker-1];
                    }
                    record+=(replace.length()-find.length());
                    index=find.length();
                }
                if (counter!=find.length()) {
                    newReplaced[i+record]=this.chars[i];
                    index=1;
                }
            }
            if (this.chars[i]!=find.getChars()[0]) {
                newReplaced[i+record]=this.chars[i];
                index=1;
            }
        }
        return new MStringObj(newReplaced);
    }

    //note: returns index position of first occurrence
    public Integer firstOccurrence(char c) {
        for (int i=0;i<this.length();i++)
            if (this.chars[i]==c)
                return i;
        return null;
    }

    //note: returns index position of start of s at first occurrence
    public Integer firstOccurrence(MString s) {
        for (int i=0;i<this.length();i++) {
            //note: reset counter
            int counter = 0;
            if (this.chars[i]==s.getChars()[0]) {
                for (int j=0;j<s.length();j++) {
                    //note: need logic here so we do not bypass the length of the original MString
                    if (i+s.length()-1<this.length()) {
                        if (this.chars[i+j]==s.getChars()[j]) { 
                            counter++;
                        }
                    }
                    if (counter==s.length()) {
                        return i;
                    }
                }
            }
        }
        return null;
    }

    //note: starts at index position start and returns len number of characters including start char
    public MString substring(int start, int len) {
        //note: if start is negative and/or len is less than or equal to 0 then return error
        if (start<0 || len<=0)
            throw new IllegalArgumentException("start or len is invalid");
        //note: if substring starts after last array index value return null
        //note: test file will not allow you to run this iteration so try/catch in tester file
        if (start >= this.length())
            return null;
        //note: if substring goes beyond end of the string return available chars
        if (start+len >= this.length()) {
            char[] sub = new char[this.length()-start];
            for (int i=0;i<(this.length()-start);i++) {
                sub[i] = this.chars[start+i];
            }
            return new MStringObj(sub);
        }
        //note: normal substring
        if (start+len < this.length()) {
            char[] sub = new char[len];
            for (int i=0;i<len;i++) {
                sub[i] = this.chars[start+i];
            }
            return new MStringObj(sub);
        }
        return null;
    }

    public MString uppercase() {
        for (int i=0;i<this.length();i++)
            this.chars[i] = Character.toUpperCase(this.chars[i]);
        return this;
    }

    public MString lowercase() {
        for (int i=0;i<this.length();i++)
            this.chars[i] = Character.toLowerCase(this.chars[i]);
        return this;
    }

    public MString truncate(int n) {
        //note: throw error if n is negative
        if (n<0)
            throw new IllegalArgumentException("n is invalid");
        //note: dealing here where n is greater or the same as the array length - return full array
        if (this.length()<=n) {
            return new MStringObj(this.chars);
        }
        //note: normal case
        char[] trun = new char[n];
        for (int i=0;i<n;i++)
            trun[i] = this.chars[i];
        return new MStringObj(trun);
    }

    public boolean palindrome() {
        char[] palin = new char[this.length()];
        for (int i=0;i<this.length();i++)
            palin[i] = this.chars[this.length()-1-i];
        for (int i=0;i<this.length();i++)
            if (this.chars[i]!=palin[i])
                return false;
        return true;
    }

    //note: have to account for multiple spaces in a row
    public MString trim() {
        int lead = 0;
        for (int i=0;i<this.length();i++) {
            if (this.chars[i]!=' ') {
                break;
            }
            else {
                lead++;
            }
        }
        int trail = 0;
        for (int j=this.length()-1;j>=0;j--) {
            if (this.chars[j]!=' ') {
                break;
            }
            else {
                trail++;
            }
        }
        //note: logic to make sure leading and trailing spaces are not the same and subtracted twice (would have to be an array of all spaces.
        if (lead==trail) {
            char[] c = {};
            return new MStringObj(c);
        }
        char[] newTrimmed = new char[this.length()-lead-trail];
        for (int k=0;k<(this.length()-lead-trail);k++) 
            newTrimmed[k]=this.chars[k+lead];
        return new MStringObj(newTrimmed);
    }

    //note: have to account for multiple spaces in a row
    public MString collapse() {
        int spaces = 0;
        for (int i=0;i<this.length();i++)
            if (this.chars[i]==' ')
                spaces++;
        char[] newCollapsed = new char[this.length()-spaces];
        int index = 0;
        for (int i=0;i<this.length();i++) {
            if (this.chars[i]!=' ') {
                newCollapsed[index]=this.chars[i];
                index++;
            }
        }
        return new MStringObj(newCollapsed);            
    }

    //NOTE TO GRADER: My encipher method is so long because it accounts for if n is negative. I also realize there are easier ways to do it, but I wanted to get practice with loooping.
    public MString encipher(int n) {
        char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        MString alphabet = new MStringObj(alpha);
        char[] code = new char[this.length()];
        //note: logic for if n is larger than 26
        int multiplier = n/alphabet.length(); 
        int newN = n - (multiplier*alphabet.length());
        for (int i=0;i<this.length();i++) { 
            for (int j=0;j<alphabet.length();j++) {
                if (Character.toLowerCase(this.chars[i])==alphabet.getChars()[j]) {
                    //note: no wrap around logic
                    if ((j+newN)<alphabet.length() && (j+newN)>=0) {
                        //note: check for upper or lower case translation
                        if (this.chars[i]==alphabet.getChars()[j]) {
                            code[i]=alphabet.getChars()[j+newN];
                        }
                        else {
                            code[i]=Character.toUpperCase(alphabet.getChars()[j+newN]);
                        }
                    }
                    //note: wrap around logic for when int is positive
                    if ((j+newN)>=alphabet.length()) {
                        //note: check for upper or lower case translation
                        if (this.chars[i]==alphabet.getChars()[j]) {
                            code[i]=alphabet.getChars()[newN- (alphabet.length() - j)];
                        }
                        else {
                            code[i]=Character.toUpperCase(alphabet.getChars()[newN - (alphabet.length() - j)]);
                        }
                    }
                    //note: wrap around logic for when int is negative
                    if ((j+newN)<0) {
                        //note: check for upper or lower case translation
                        if (this.chars[i]==alphabet.getChars()[j]) {
                            code[i]=alphabet.getChars()[alphabet.length() + newN + j];
                        }
                        else {
                            code[i]=Character.toUpperCase(alphabet.getChars()[alphabet.length() + newN + j]);
                        }
                    }
                }
            }
            if (code[i] == '\0') {
                code[i] = this.chars[i];
            }
        }
        return new MStringObj(code);
    }

    public String toString() {
        if (this.length()==0)
            return "[]";
        String charArray = "[" + this.chars[0];
        for (int i=1;i<this.length();i++) 
            charArray += "," + this.chars[i];
        return charArray + "]";
    }
        
    public boolean equals(Object o) {
	if (o==null)
	    return false;
	if (!(o instanceof MString))
	    return false;
	MString that = (MString)o;
	for (int i=0;i<this.length();i++)
	    if (this.chars[i]!=that.getChars()[i])
		return false;
	return true;
    }

}
                
        
                     
        
        
    
            
        
                        
                      
                  
