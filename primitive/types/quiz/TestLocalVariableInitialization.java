package primitive.types.quiz;

public class TestLocalVariableInitialization {
    public static void main(String[] args) {

        boolean input1 = true, input2 = false;  // Line 1
        System.out.println("1) input1 :" +input1+
                " input2 :" +input2 );

        boolean result1 = input1 = !input1; // Line 2

        System.out.println("2) input1 :" +input1+
                " input2 :" +input2 +
                " result1 :" +result1
        );

        boolean result2 = input2 = input1;  // Line 3

        System.out.println("3) input1 :" +input1+
                " input2 :" +input2 +
                " result1 :" +result1 +
                " result2 :" +  result2 );

        boolean result3 = input1 == (result1=!input2);  // Line 4
        System.out.println("4) input1 :" +input1+
                " input2 :" +input2 +
                " result1 :" +result1 +
                " result2 :" +  result2 +
                " result3 :" +  result3);
    }
}
