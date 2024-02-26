package TheLocaleClass;

public class Number {
//    Number number;
//    java.lang.Number numberj;
//
//    Number(java.lang.Number number) {
//        this.numberj = number;
//        System.out.println("Constructor for java.lang.number");
//    }
//
//    Number(Number number) {
//        this.number = number;
//        System.out.println("Constructor for a.Number");
//    }




    public static void main(String[] args) {
        String a = "***********";
//
//        Number n = new Number(10);
//        Number n2 = new Number(n);

        System.out.println(phoneFormat(a));



    }
    public static String phoneFormat(String number1) {
        String regEx = "(\\d{3})(\\d{3,4})(\\d{4})";
        return number1.replaceAll(regEx, "$1-$2-$3");
    }
}
