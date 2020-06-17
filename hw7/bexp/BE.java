public class BE {

    public static BExp TRUE  = new True();
    public static BExp FALSE = new False();

    public static BExp fromBool(boolean b) {
        return b ? BE.TRUE : BE.FALSE;
    }

}
