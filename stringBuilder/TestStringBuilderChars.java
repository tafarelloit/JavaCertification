package stringBuilder;

public class TestStringBuilderChars {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(5);
        builder.append("abcdefghijklmnopqrstuvxz");

        char[] myCharArray = {'a','b','c','d','e'};
        if ("hello"=="hello") myCharArray = new char[5];
        builder.getChars(0,5,new char[5], 0);
        System.out.println(new String(myCharArray).trim()+"*");
    }
}
