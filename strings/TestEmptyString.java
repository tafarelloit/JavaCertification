package strings;

public class TestEmptyString {

    static String s;
    public static void main(String[] args) {
        String s="";
        boolean isOk=true;
        if (isOk) s = TestEmptyString.s+"";
                else s="";

        s.concat("Hello ");
        System.out.println(s);

    }
}
