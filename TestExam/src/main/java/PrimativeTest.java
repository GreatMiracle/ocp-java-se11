public class PrimativeTest {
//    public static void main(String[] args) {
//        char c = 'Z';
//        long l = 100_00l;
//        int i = 9_2;
//        float f = 2.02f;
//        double d = 10_0.35d;
//        l = c + i;
//        f = c * l * i * f;
//        f = l + i + c;
//        i = (int) d;
//        f = (long) d;
//    }

//    public static void main(String[] args) {
//        char c1 = 'a'; //ASCII code of 'a' is 97
//        int i1 = c1; //Line n1
//        int x = 5____0;
//
//        int y = ____50;
//
//        int z = 50____;
//
//        float f = 123.76_86f;
//
//        double d = 1_2_3_4;
//        System.out.println(i1); //Line n2
//    }

//    public static void main(String[] args) {
////        byte b1 = 10; //Line n1
////        int i1 = b1; //Line n2
////        byte b2 = i1; //Line n3
////        System.out.println(b1 + i1 + b2);
////        final int i3= 10;
//        int i3= 10;
//        short s3 = i3;
//        System.out.println(s3);
//    }

//    public static void main(String[] args) {
////        boolean b1 = 0;
////        boolean b2 = 1;
////        System.out.println(b1 + b2);
//
//        Boolean b1 = Boolean.valueOf("tRuE");
//        Boolean b2 = Boolean.valueOf("fAlSe");
//        Boolean b3 = Boolean.valueOf("f");
//        Boolean b4 = null;
//        System.out.println(b1 + ":" + b2 + ":" + b3 + ":" + b4);
//    }


//    private static void add(double d1, double d2) {
//        System.out.println("double version: " + (d1 + d2));
//    }
//
//    private static void add(Double d1, Double d2) {
//        System.out.println("Double version: " + (d1 + d2));
//    }
//
//
//    public static void main(String[] args) {
//        add(10.0, null);
//    }


//    public static void main(String[] args) {
//        m(1);
//    }
//
//    private static void m(Object obj) {
//        System.out.println("Object version");
//    }
//
//    private static void m(Number obj) {
//        System.out.println("Number version");
//    }
//
//    private static void m(Double obj) {
//        System.out.println("Double version");
//    }


//    public static void main(String[] args) {
//        extractInt(2.7);
//        extractInt(2);
//    }
//
//    private static void extractInt(Double obj) {
//        System.out.println(obj.intValue());
//    }

//    public static void main(String[] args) {
////        System.out.println( 53 / 2.0 );
////        System.out.println( 53 % 2.0 );
//
//        System.out.println("1" + "2" + "3" == "1" + "2" + "3");
//        System.out.println("123" == "123");
//        System.out.println("Equals??? " + (10 != 5);
//
//
//
//    }


    public static void main(String [] args) {
//        byte var = 127;
//        System.out.println( var = (byte) (var - 1));
//
//        System.out.println(null+null);
//
//        String str = null + new PrimativeTest();


        String text = "RISE ";
        text = text + (text = "ABOVE ");
        System.out.println(text);
    }
}