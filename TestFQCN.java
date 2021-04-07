import garden.vegetable.*;
import nursery.vegetable.*;
public class TestFQCN {
    public static void main(String[] args) {
        String s = "This is a TestFQN";
        System.out.println(s);

        //This will call the fully qualified class name from the package
        garden.vegetable.VineVegetable.main(args);

        //This will call the local class
        VineVegetable.main(args);
    }
}

class VineVegetable {
    public static void main(String[] args) {
        System.out.println("I am a vegetable from local, running by "+ garden.vegetable.VineVegetable.class.hashCode());
    }
}