package section110;
// A single-static-import declaration for static variable
import static java.lang.Math.PI;
// A single-static-import declaration for static method
import static java.lang.Math.sqrt;

public class TestImportStatic2 {
    public static void main(String[] args) {
        int radius = 2;
        double circumference = 2 * PI * radius;
        System.out.println("circumference ="+circumference);

        double sqrt81 = sqrt(81);
        System.out.println("sqrt81 = "+sqrt81);
    }
}
