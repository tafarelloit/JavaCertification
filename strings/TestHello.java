package strings;

public class TestHello {
    public static void main(String[] args) {
        String hello="hello";
        for (var arg: args) {
            System.out.println(arg);
            //StringBuilder sg = new StringBuilder(arg);
            String sb = new String(arg);
            System.out.println(arg.equals(sb)+" ");
            System.out.println((hello.equals(arg))+" ");
            //System.out.println((hello==arg));
            System.out.println((hello==arg.intern()));

        }
    }
}
