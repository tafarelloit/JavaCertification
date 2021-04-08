package primitive.types;

public class Examples {
    public static void main(String[] args) {
        // Declaration of local variables, local to the main method
        //This is oermitted
        boolean myBoolean;
        byte myByte;
        char myFirstChar, mySecondChar;
        short myShort;
        long myLong;
        float myFloat;
        double myFirstDouble, mySecondDouble;


        // You can set all of the numeric primitive data variables to a literal number
        // from 0 to 127.
        System.out.println("Printing all primitives");
        byte b = 127;
        char c = 127;  //This should accept only letter like 'a'
        short s = 127;
        int i = 127;
        long l = 127;
        float f = 127;
        double d = 127;

        // boolean can only be set to true or false
        boolean isTrue = false;

        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("isTrue = " + isTrue);

        //printing long, float, double
        System.out.println("\nPrinting long, float, double");
        long l2 = 127l;
        long l3 = 127L;
        System.out.println("l2 = " + l2);
        System.out.println("l2 = " + l3);

        float f2 = 127f;
        float f3 = 127F;
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);

        double d2 = 127d;
        double d3 = 127D;
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        System.out.println("\nPrinting float, double");
        float f4 = 1.27e02f;
        double d4 = 1.27e02;
        System.out.println("f4 = " + f4);
        System.out.println("d4 = " + d4);

        System.out.println("\nPrinting byte, short, int");
        byte b4 = 0b1111111;   // binary 127 prefix 0b
        System.out.println("b4 = " + b4);

        short s4 = 0177;  // octal 127 - octal prefix 0 only
        System.out.println("s4 = " + s4);

        int i4 = 0x007F; // hexidecimal 127 - hex prefix 0x
        System.out.println("i4 = " + i4);

        System.out.println("\nPrinting byte, char, double");
        byte b5 = 'a'; //It will not print a letter but its octal representation
        char c5 = 'a';
        double d5 = 'b'; //It will not print a letter but its octal representation

        System.out.println("b5 = " + b5);
        System.out.println("c5 = " + c5);
        System.out.println("d5 = " + d5);

        System.out.println("\nUse underscore for readbility");
        byte b7 = 0b0000_0001;
        char c7 = 0x0_07F;
        short s7 = 011_11;
        int i7 = 1_000_000;
        long d7 = 1_000_000L;
        float f7 = 1_000.000_000f;
        double l7 = 1.000_0000e10;

        System.out.println("b7 = " + b7);
        System.out.println("c7 = " + c7);
        System.out.println("s7 = " + s7);
        System.out.println("i7 = " + i7);
        System.out.println("l7 = " + l7);
        System.out.println("f7 = " + f7);
        System.out.println("d7 = " + d7);

        System.out.println("\nInvalid use");
        System.out.println("byte b8 = 0b_00000001;") ; // Cannot have underscore directly after 0b
        System.out.println("char c8 = 0x_007F;");  // Cannot have underscore directly after 0x
        System.out.println("int i8 = 1000000_;") ; // Underscore cannot be at end of literal
        System.out.println("long d8 = 1000000_L;"); // Underscore cannot be prior to suffix  (L/l,F/f,D/d)
        System.out.println("float f8 = _1000.000000;"); // Underscore cannot be at start of literal
        System.out.println("double l8 = 1.0000000_e10;"); // Underscore cannot prefix exponential in literal

        System.out.println("byte b9 = null;");
        System.out.println("char c9 = null;");
        System.out.println("short s9 = null;");
        System.out.println("int i9 = null;");
        System.out.println("long l9 = null;");
        System.out.println("float f9 = null;");
        System.out.println("double d9 = null;");

        System.out.println("boolean aBoolean = 0;");
        System.out.println("boolean bBoolean = null;");

    }
}
