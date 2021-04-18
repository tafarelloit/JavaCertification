package operadores;

public class TestOperator {
    public static void main(String[] args) {
        int a = 0;
        a = 1;
        System.out.println(a++);  //imprime 1
        System.out.println(a);  // imprime 2
        System.out.println(--a); //imprime 1
        System.out.println(a); //imprime 1

        a = 1;
        int b = -a;
        System.out.println(a);
        System.out.println(b);

        a = -1;
        b = +a;
        System.out.println(a);
        System.out.println(b);

        a = 1;
        if (a++ == 1) { //PErmite a entrada por a operação é pós fixada
            System.out.println("new "+a);
        }

        int bin1 = 0b00000000_00000000_00000000;
        int bin2 = ~bin1;

        System.out.println(bin1);
        System.out.println(Integer.toBinaryString(bin1));
        System.out.println(bin2);
        System.out.println(Integer.toBinaryString(bin2));

    }
}
