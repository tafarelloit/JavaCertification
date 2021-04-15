package strings;

public class Recap {
    public static void main(String[] args) {
        EqualLiteralReferences();
        StringConstructors();
        StringConstructorsInterned();


        //  "Hello" exists on the string pool, s1 gets a reference to it
        String s1 = "Hello";


        /*
        The following code does not change the value of "Hello" on the
        string pool, it creates a new string with value of "Hello World" and
         passes the reference to this new string to s1;

        "Hello World" not added to the string pool unless intern() called
        */
        s1 = s1 + " World";

        System.out.println(s1);

        // Let's reset s1 and show another example using String's concat
        // method which we'll discuss later
        s1 = "Hello";

        String s2 = " World";
        String s3 = s1.concat(s2);

        //Notice that Assign the concatenation to another variable it will work, String are immutable
        System.out.println(s3);

        //String are immutable, concatenation will not work
        System.out.println(s1);


    }

    public static void EqualLiteralReferences() {
        // String literals automatically interned so all "hello" literals
        // point to same reference in memory, in the string pool
        String s1 = "hello";

        String s2 = "hello";
        System.out.println("s1 and s2 are string literals " +
                "assigned to String variables: (s1 == s2) = " +
                ((s1 == s2) ? "true" : "false"));

        System.err.println(s2);
        System.out.println(s2.hashCode());
        System.out.println(s1.hashCode());

    }

    public static void StringConstructors() {
        String s1 = new String("hello");
        String s2 = new String("hello");

        // Now evaluates to false, strings do not point to same reference,
        // and are not stored in the string pool
        System.out.println("s1 and s2 are constructed String objects " +
                "assigned to String variables: (s1 == s2) = " +
                ((s1 == s2) ? "true" : "false"));
        System.err.println(s2);
        System.out.println(s2.hashCode());
        System.out.println(s1.hashCode());
    }

    public static void StringConstructorsInterned() {
        //**** Add intern() method:  intern checks the string pool
        // and returns the string pool reference to s1.
        String s1 = new String("hello").intern();

        //**** Add intern() method: s2 also gets the string pool
        // reference for "hello"
        String s2 = new String("hello").intern();

        // Now evaluates to true
        System.out.println("s1 and s2 are interned String objects " +
                "assigned to String variables: (s1 == s2) = " +
                ((s1 == s2) ? "true" : "false"));

        System.err.println(s2);
        System.out.println(s2.hashCode());
        System.out.println(s1.hashCode());
    }
}
