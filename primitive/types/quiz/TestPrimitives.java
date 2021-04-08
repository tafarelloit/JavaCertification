package primitive.types.quiz;

public class TestPrimitives {
    static int i;

    public static void main(String[] args) {
        int i,j=0,k=10;
        i = TestPrimitives.i+k;
        System.out.println("i="+i+" j="+j+" k="+k);
        k = i+++k;
        System.out.println("i="+i+" j="+j+" k="+k);
        TestPrimitives.i = j+i;
        System.out.println("i="+i+" j="+j+" k="+k);
    }

}
