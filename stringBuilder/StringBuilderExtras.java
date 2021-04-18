package stringBuilder;

import java.nio.charset.StandardCharsets;

public class StringBuilderExtras {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("  ABC              ");
        System.out.println("*"+builder+"*");

        builder.trimToSize();
        System.out.println("*"+builder+"*");

        builder.replace(0, builder.length(), builder.toString().strip());
        System.out.println("*"+builder+"*");

        builder.append(" just a test , we need more text, avcdefghjiklmnpqrthsdsd sdsd s ds");
        char[] myCharacterArray1 = new char[10];
        char[] myCharacterArray2 = new char[10];

        builder.toString().getChars(20,27, myCharacterArray1, 0);
        builder.getChars(20,27,myCharacterArray2, 0);
        System.out.println("*"+builder+"*");
        System.out.println(java.util.Arrays.toString(myCharacterArray1));
        System.out.println(java.util.Arrays.toString(myCharacterArray2));





    }
}
