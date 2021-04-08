package primitive.types;

public class UnsignedExample {
    public static void main(String[] args) {

        System.out.println("An int has a range of MIN_VALUE " + Integer.MIN_VALUE + " to MAX_VALUE " +
                Integer.MAX_VALUE);

        // we are going to purposely overflow our variable in testInt.
        // Our value is Integer.MAX_VALUE+3;
        int testInt = (int) (Integer.MAX_VALUE + 3);  // integer overflows by 3
        System.out.println("\nCasting to an int (int) (Integer.MAX_VALUE + 3), value  = " + testInt+", which overflows");

        // Let's set the value to a long, which will represent our number
        // without overflowing
        long l = (long) Integer.MAX_VALUE + 3;
        System.out.println("\nWhat we expected (long) Integer.MAX_VALUE + 3 to equal " +
                " by widening to long = " + l);

        // As of Java 8, you can evaluate the number as an unsigned int...
        String sInt = Integer.toUnsignedString(testInt);
        System.out.println("\nInteger.toUnsignedString value = " + sInt);

        // We can also take the same number, wrapped in a String,
        // and pass it to the Integer.parseUnsignedInt value
        System.out.println("Integer.MAX_VALUE + 3 will overflow the capacity of int");
        int vInt = Integer.parseUnsignedInt(new String("" +
                ((long) (Integer.MAX_VALUE) + 3)));
        System.out.println("\nInteger.parseUnsignedInt value = " + vInt); // -1

    }
}
