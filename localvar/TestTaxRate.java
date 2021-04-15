package localvar;

public class TestTaxRate {
    static float tax_rate =0.06F;
    public static void main(String[] args) {
        var result = 0;
        var tax_rate = 0.05;
        var price = 100;
        var adjusted_tax = price * tax_rate;
        //This calculation doesn't work becase a overflow the capacity
        //double to int
        //result = price + adjusted_tax;
        System.out.println("Adjusted price = "+result);
    }
}
