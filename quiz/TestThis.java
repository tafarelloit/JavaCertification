package quiz;

public class TestThis {
    static String type = "this";

    public static void main(String[] args) {
        String s = (args.length>0)?"switch":"";
        String caseVal = (args.length>1)?args[1]:"";

        if (s=="") {
            String type;
            switch (caseVal) {
                case "this":
                    type="that";
                default:
                    type="somethingelse";
            }
        }

        System.out.println("This is "+type);
    }
}
