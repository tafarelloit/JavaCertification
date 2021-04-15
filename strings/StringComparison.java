package strings;

public class StringComparison {
    public static void main(String[] args) {
        String nullString = null;
        String stringHello1 = "Hello";
        String stringhEllo = "hEllo";
        String stringHello2 = new String(new char[]{'H', 'e', 'l', 'l', 'o'});

        //operand
        // compare input 1 == input 2
        //System.out.println(stringHello2==stringHello1);
        //TestEqualsOperand(stringHello2, stringHello1);

        //Method equals
        //System.out.println(stringHello2.equals(stringHello1));
        //TestEqualsMethod(stringHello2, stringHello1);

        //Method equalsIgnoreCase
        //System.out.println(stringHello2.equalsIgnoreCase(stringhEllo));
        //TestEqualsIgnoreCaseMethod(stringHello2, stringhEllo);


        //Method contentEquals
        //TestContentEqualsMethod(stringHello2, stringhEllo);  //Hello.contentEquals(hEllo) = false
        //TestContentEqualsMethod(stringHello2, stringHello1); //Hello.contentEquals(Hello) = true
        //TestContentEqualsMethod(stringHello2, nullString);   //Error Occurred with Hello.equals(null) : java.lang.NullPointerException

        //Method compareTo
        //TestCompareToMethod(stringHello2, stringhEllo);  //Hello.compareTo(hEllo) = -32
        //TestCompareToMethod(stringHello2, stringHello1); //Hello.compareTo(Hello) = 0
        //TestCompareToMethod(stringHello2, nullString);   //Error Occurred with Hello.equals(null) : java.lang.NullPointerException

        //Method compareTo
        TestCompareToIgnoreCaseMethod(stringHello2, stringhEllo);  //Hello.compareToIgnoreCase(Hello) = 0
        TestCompareToIgnoreCaseMethod(stringHello2, stringHello1); //Hello.compareToIgnoreCase(Hello) = 0
        TestCompareToIgnoreCaseMethod(stringHello2, nullString);  //Error Occurred with Hello.equals(null) : java.lang.NullPointerException
    }

    //  == operand
    // returns true when both objects refer to the same object, not the same value
    public static void TestEqualsOperand(String firstString, Object secondObject) {
        System.out.println(String.format("(%s == %s) = " +
                (firstString == secondObject), firstString, secondObject));

    }

    //  public boolean equals(Object anObject)
    //  returns true if references are the same,
    //  OR if parameter type is String AND the value is the same
    public static void TestEqualsMethod(String firstString, Object secondObject) {
        try {
            System.out.println(String.format("%s.equals(%s) = " +
                    (firstString.equals(secondObject)), firstString, secondObject));
        } catch (Exception e) {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondObject, e.getClass().getName()));

        }
    }

    //  public boolean equalsIgnoreCase(Object anObject)
    //  returns true if two Strings have same value ignoring case
    public static void TestEqualsIgnoreCaseMethod(String firstString, String secondObject) {
        try {
            System.out.println(String.format("%s.equalsIgnoreCase(%s) = " +
                    (firstString.equalsIgnoreCase(secondObject)), firstString, secondObject));
        } catch (Exception e) {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondObject, e.getClass().getName()));

        }
    }

    //  public boolean contentEquals(CharSequence cs)
    //  returns true if values in String and the second passed parameter are the same.
    public static void TestContentEqualsMethod(String firstString, CharSequence secondSequence) {
        try {
            System.out.println(String.format("%s.contentEquals(%s) = " +
                    (firstString.contentEquals(secondSequence)), firstString, secondSequence));
        } catch (Exception e) {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondSequence, e.getClass().getName()));

        }
    }

    //  public int compareTo(String anotherString)
    //  Compares the value of Strings lexicographically
    public static void TestCompareToMethod(String firstString, String secondString) {
        try {
            System.out.println(String.format("%s.compareTo(%s) = " +
                    (firstString.compareTo(secondString)), firstString, secondString));
        } catch (Exception e) {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondString, e.getClass().getName()));

        }
    }

    // public int compareToIgnoreCase(String str)
    //  Compares the value of Strings lexicographically ignoring case
    public static void TestCompareToIgnoreCaseMethod(String firstString, String secondString) {
        try {
            System.out.println(String.format("%s.compareToIgnoreCase(%s) = " +
                    (firstString.compareToIgnoreCase(secondString)), firstString, secondString));
        } catch (Exception e) {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondString, e.getClass().getName()));

        }
    }

}
