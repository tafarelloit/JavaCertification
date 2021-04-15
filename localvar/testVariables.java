package localvar;

import java.util.ArrayList;
import java.util.Arrays;

public class testVariables {
    public static void main(String[] args) {
        var a = Integer.parseInt("10");
        var b = new int[1];
        b[0]=10;

        var c = 10;

        //It is allowed because c already exist
        var d = c = 10;

        // Not Allowed because g doesn't exist
        // java: cannot find symbol
        //var e = g = 10;

        //Not allowed
        //java: cannot infer type for local variable f
        //var f = null;

        //Not Allowed
        //java: cannot infer type for local variable g
        //var g = {"a","b"};

        var h = new ArrayList<Integer>();
        h.add(10);

        System.out.println(a);
        System.out.println(b[0]);
        System.out.println(c);
        System.out.println(d);
        System.out.println(h.get(0));

        // Yes, you can name your LVTI variable "var"
        var var = new ArrayList<String>(Arrays.asList("one", "two", "three"));

        var(var);
    }

    // You cannot have a method parameter of type var, but you can have
    // a method named "var" and a method parameter named "var"
    public static void var(ArrayList<String> var) {

        // How confusing can we make it?
        // Use LVTI to set local variable to our method parameter named var
        var x = var;

        // More so...
        for (var y : x) {
            System.out.println("var y =" + y);
        }
    }

}
