package primitive.types;

public class Examples2 {
    // static variables are initialized for all primitive data types
    static byte staticByte;
    static char staticChar;
    static short staticShort;
    static int staticInt;
    static long staticLong;
    static float staticFloat;
    static double staticDouble;
    static boolean staticBoolean;

    public static void main(String[] args) {

        System.out.println("Static variables are initialized method");

        // Add the following statements which access and tries to print the uninitialized local variables
        System.out.println("----------  Are Local Variables set to default values?? --------------");
        System.out.println("staticByte = " + staticByte);
        System.out.println("staticChar = " + staticChar);
        System.out.println("staticShort = " + staticShort);
        System.out.println("staticInt = " + staticInt);
        System.out.println("staticLong = " + staticLong);
        System.out.println("staticFloat = " + staticFloat);
        System.out.println("staticDouble = " + staticDouble);
        System.out.println("staticBoolean = " + staticBoolean);



        byte mainByte;
        char mainChar;
        short mainShort;
        int mainInt;
        long mainLong;
        float mainFloat;
        double mainDouble;
        boolean mainBoolean;

        System.out.println("Local variables in a main method");

        //  Initialize our variables
        mainByte = 0;
        mainChar = 'a';
        mainShort = 1;
        mainInt = 2;
        mainLong = 3L;
        mainFloat = 1.0f;
        mainDouble = 2.0d;
        mainBoolean = false;

        // Add the following statements which access and tries to print the uninitialized local variables
        System.out.println("----------  Are Local Variables set to default values?? --------------");
        System.out.println("mainByte = " + mainByte);
        System.out.println("mainChar = " + mainChar);
        System.out.println("mainShort = " + mainShort);
        System.out.println("mainInt = " + mainInt);
        System.out.println("mainLong = " + mainLong);
        System.out.println("mainFloat = " + mainFloat);
        System.out.println("mainDouble = " + mainDouble);
        System.out.println("mainBoolean = " + mainBoolean);


    }

}
