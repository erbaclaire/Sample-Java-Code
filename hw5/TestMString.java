public class TestMString {

    public static void main(String args[]) {
	
	try {
	    char[] c0 = null;
	}
	catch (Exception e) {
	    System.out.println("this entry is not valid");
	}
	char[] c1 = {'t','a','c','o','c','a','t'};
	MString s1 = new MStringObj(c1);

	char[] c2 = {' ','i','s',' ','c','o','o','l'};
	MString s2 = new MStringObj(c2);

	char[] c3 = {'a','c','o'};
	MString s3 = new MStringObj(c3);

	char[] c4 = {'o','m',' '};
	MString s4 = new MStringObj(c4);

	char[] c5 = {' ',' ',' ',' '};
	MString s5 = new MStringObj(c5);

	char[] c6 = {'a','s','u','n','s','u','n','f','+',' ','s','g','s','u','n','t','3','$','s','u','n','s','u',};
	MString s6 = new MStringObj(c6);

	char[] c7 = {'s','u','n'};
	MString s7 = new MStringObj(c7);

	char[] c8 = {'b','e','d'};
	MString s8 = new MStringObj(c8);

	char[] c9 = {' ',' ',' ','s','o',' ','m','a','n','y',' ',' ',' ','s','p','a','c','e','s',' ',' '};
	MString s9 = new MStringObj(c9);

	char[] c10 = {};
	MString s10 = new MStringObj(c10);

	char[] c11 = {'S','u','n'};
	MString s11 = new MStringObj(c11);

	char[] c12 = {' ','U','6',' ','k','P','Z'};
	MString s12 = new MStringObj(c12);

	char[] c13 = {'%','7'};
	MString s13 = new MStringObj(c13);

	char[] c14 = {'%','7','P','o','9'};
	MString s14 = new MStringObj(c14);

	char[] c15 = {'o','c','a','t'};
	MString s15 = new MStringObj(c15);

	char[] c16 = {'o','c','a','t','9'};
	MString s16 = new MStringObj(c16);

	char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	MString sAlpha = new MStringObj(alpha);
	
	//tests
	System.out.println("s1: " + s1.getChars());
	System.out.println("s1: " + s1.charAt(4));
	try {
	    System.out.println("s1: " + s1.charAt(7));
	}
	catch (UnsupportedOperationException e) {
	    System.out.println("s1: i is out of array range");
	}
	System.out.println("s1 length: " + s1.length());
	System.out.println("s10 length: " + s10.length());
	System.out.println("s1 contains: " + s1.contains('q'));
	System.out.println("s8 contains: " + s8.contains('d'));
	System.out.println("s10 contains: " + s10.contains('&'));
	System.out.println("s1 count: " + s1.count('a'));
	System.out.println("s10 count: " + s10.count('9'));
	System.out.println("s1 append: " + s1.append(s2));
	System.out.println("s6 append: " + s6.append(s7));
	System.out.println("s10 append: " + s10.append(s6));
	System.out.println("s1 replace: " + s1.replace(s3,s4));
	System.out.println("s1 replace: " + s1.replace(s15,s11));
	System.out.println("s1 replace: " + s1.replace(s16,s5));
	System.out.println("s6 replace: " + s6.replace(s7,s8));
	System.out.println("s6 replace: " + s6.replace(s7,s2));
	System.out.println("s6 replace: " + s6.replace(s7,s13));
	System.out.println("s6 replace: " + s6.replace(s7,s10));
	System.out.println("s6 replace: " + s6.replace(s11,s8));
	System.out.println("s6 replace: " + s6.replace(s7,s14));
	System.out.println("s10 replace: " + s10.replace(s7,s2));
	System.out.println("s1 first: " + s1.firstOccurrence('o'));
	System.out.println("s1 first: " + s1.firstOccurrence('a'));
	System.out.println("s10 first: " + s10.firstOccurrence('R'));
	System.out.println("s1 first: " + s1.firstOccurrence(s3));
	System.out.println("s1 first: " + s1.firstOccurrence(s4));
	System.out.println("s10 first: " + s10.firstOccurrence(s8));
	System.out.println("s1 substring: " + s1.substring(4,2));
	System.out.println("s6 substring: " + s6.substring(2,4));
	try {
	    System.out.println("s7 substring: " + s7.substring(4,1));
	}
	catch (Exception e) {
	    System.out.println("start is out of bounds");
	}
	System.out.println("s7 substring: " + s7.substring(1,12));
	try {
	    System.out.println("s10 substring: " + s10.substring(0,6));
	}
	catch (Exception e) {
	    System.out.println("empty char array");
	}
	System.out.println("s1 upper: " + s1.uppercase());
	System.out.println("s6 upper: " + s6.uppercase());
	System.out.println("s10 upper: " + s10.uppercase());
	System.out.println("s1 lowercase: " + s1.lowercase());
	System.out.println("s10 lowercase: " + s10.lowercase());
	System.out.println("s1 truncate: " + s1.truncate(2));
	System.out.println("s4 truncate: " + s4.truncate(3));
	System.out.println("s2 truncate: " + s2.truncate(3));
	System.out.println("s13 truncate: " + s2.truncate(0));
	System.out.println("s10 truncate: " + s10.truncate(4));
	System.out.println("s1 palindrome: " + s1.palindrome());
	System.out.println("s2 palindrome: " + s2.palindrome());
	System.out.println("s10 palindrome: " + s10.palindrome());
	System.out.println("s5 trim: " + s5.trim());
	System.out.println("s9 trim: " + s9.trim());
	System.out.println("s10 trim: " + s10.trim());
	System.out.println("s1 collapse: " + s1.collapse());
	System.out.println("s2 collapse: " + s2.collapse());
	System.out.println("s5 collapse: " + s5.collapse());
	System.out.println("s9 collapse: " + s9.collapse());
	System.out.println("s10 collapse: " + s10.collapse());
	System.out.println("s1 encipher: " + s1.encipher(7));
	System.out.println("s1 encipher: " + s1.encipher(-21));
	System.out.println("s1 encipher: " + s1.encipher(76));
	System.out.println("s1 encipher: " + s1.encipher(26));
	System.out.println("s10 encipher: " + s10.encipher(-4));
	System.out.println("s12 encipher: " + s12.encipher(4));
	System.out.println("s12 encipher: " + s12.encipher(0));
	System.out.println("s12 encipher: " + s12.encipher(-59));
	System.out.println("s12 encipher: " + s12.encipher(-208));
	System.out.println("sAlpha encipher: " + sAlpha.encipher(8));
	System.out.println("sAlpha encipher: " + sAlpha.encipher(93));
	System.out.println("sAlpha encipher: " + sAlpha.encipher(0));
	System.out.println("sAlpha encipher: " + sAlpha.encipher(-8));
	System.out.println("sAlpha encipher: " + sAlpha.encipher(-59));
	System.out.println("sAlpha encipher: " + sAlpha.encipher(-208));
	System.out.println("s1 equals: " + s1.equals(7));
	System.out.println("s1 equals: " + s1.equals(s1));
	System.out.println("s1 equals: " + s1.equals(s16));
    }
}
