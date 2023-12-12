public class UnaryOperatorMore {
    public static void main(String[] args) {
        // unary Minus
        int a = 1, b = -a;

        // Note that the value of actual operand a does not change
        System.out.println("a = " + a + "; b = " + b);
        a = -1;
        b = -a;
        System.out.println("a = " + a + "; b = " + b);

        //  Unary Plus
        a = 1;
        b = +a;  // Not to mistaken for b+=a;
        System.out.println("a = " + a + "; b = " + b);
        a = -1;
        b = +a;
        System.out.println("a = " + a + "; b = " + b);


        // Bitwise Complement Operator  ~a
        // when value is x then ~x = (-x)-1;
        int bin1 = 0b10000000_00000001_10000000_00000000;
        int bin2 = ~bin1;

        System.out.println("bin1 = " + bin1 +
                " (" + Integer.toBinaryString(bin1) + "), " +
                "bin2 = " + bin2 +
                " (" + Integer.toBinaryString(bin2) + ")");


        // Logical Complement Operator  !a
        boolean myBoolean = false;
        boolean newBoolean = !myBoolean;
        System.out.println("myBoolean = " + myBoolean +
                ", the opposite is = " + newBoolean);





//        short a1 = 10;
//        int b1 = 100000000;
//        a1 += b1;

//        short a1 = 10;
//        long b1 = 20L;
//        int result = a1 + b1;
//
//        short xxx =1;
//        short yyy =1;
//
//        short ax= xxx/yyy;
//
//        System.out.println(a1);
    }
}