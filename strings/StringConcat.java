package strings;

public class StringConcat {
    public static void main(String[] args) {
        String helloString = "hello";
        String worldString = "world";

        // firstString will be “hello world”, concats 3 literals..
        String firstString = helloString + " " + worldString;
        System.out.println("firstString = " + firstString);

        Object nullObject = null;
        // secondString will be “null hello"
        String secondString = nullObject + " " + helloString;
        System.out.println("secondString = " + secondString);

        int i = 10;
        // thirdString will be “10 hello"
        String thirdString = i + " " + helloString;
        System.out.println("thirdString = " + thirdString);

        int j = 10;
        String resultString = i + j + " = " + i + j;
        System.out.println("resultString is: " + resultString);

        OurSimpleClass ourSimpleClass = new OurSimpleClass();
        String fourthString = helloString + " " + ourSimpleClass;

        System.out.println("fourthString : "+fourthString);

        Object ourObject = new OurSimpleClass();
        String fifthString = helloString + " " + ourObject;

        System.out.println("fifthString : "+fifthString);

        String resultStringCorrectedForIntegerMath = i + j + " = " + (i + j);
        String resultStringCorrectedForStringConcat = "" + i + j + " = " + i + j;
        System.out.println("resultStringCorrectedForIntegerMath is: " +
                resultStringCorrectedForIntegerMath);
        System.out.println("resultStringCorrectedForStringConcat is: " +
                resultStringCorrectedForStringConcat);

    }
}

class OurSimpleClass {
    public String toString() {
        return "Our Simple Class";
    }
}
