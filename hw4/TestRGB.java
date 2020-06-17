public class TestRGB {

    public static void main(String[] args) {

        //test validation
        /*
        RGB rgb0 = new RGBObj(250,4000,55);
        RGB rgb00 = new RGBObj(250,3,-90);
        */

        //regular test
        RGB rgb1 = new RGBObj(255,44,73);
        System.out.println("R is: " + rgb1.getR());
        System.out.println("G is: " + rgb1.getG());
        System.out.println("B is: " + rgb1.getB());
        System.out.println("luminance is: " + rgb1.luminance());
        System.out.println("gray is: " + rgb1.gray());
        System.out.println("brighter than?: " + rgb1.brighter(new RGBObj(80,90,100)));
        //System.out.println("brighter than?: " + rgb1.brighter(new RGBObj(80,455,100)));
        System.out.println("mixed it is: " + rgb1.mix(new RGBObj(80,90,100)));
        System.out.println("equals?: " + rgb1.equals(new DPointObj(1,2)));
        System.out.println("equals?: " + rgb1.equals(null));
        System.out.println("equals?: " + rgb1.equals(new RGBObj(255,44,73)));
        System.out.println("equals?: " + rgb1.equals(new RGBObj(255,40,73)));
        System.out.println("RGB: " + rgb1.toString());

        //test with all 255 for gray
        RGB rgb2 = new RGBObj(255,255,255);
        System.out.println("gray is: " + rgb2.gray());
                           
    }
}
        
