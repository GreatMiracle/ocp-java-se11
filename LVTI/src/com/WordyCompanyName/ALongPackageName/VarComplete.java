package com.WordyCompanyName.ALongPackageName;

import java.util.ArrayList;
import java.util.Arrays;

public class VarComplete {
//    public static void main(String[] args) {
////
////        // Yes, you can name your LVTI variable "var"
////        var var = new ArrayList<String>(Arrays.asList("one", "two", "three"));
////
////        // And yes, you can name your method var...
////        var(var);
////
////    }
////
////    // You cannot have a method parameter of type var, but you can have
////    // a method named "var" and a method parameter named "var"
////    public static void var(ArrayList<String> var) {
////
////        // How confusing can we make it?
////        // Use LVTI to set local variable to our method parameter named var
////        var x = var;
////
////        // More so...
////        for (var y : x) {
////            System.out.println("var y =" + y);
////        }
////    }
static float tax_rate =0.06F;
    public static void main(String[] args) {

        var result = 0;
        var tax_rate = 0.05;    // Line 1
        var price = 100;
        var adjusted_tax = price * tax_rate;  // Line 2
//        result = price + adjusted_tax;  // Line 3 ERR
        System.out.println("Adjusted price = " + result);
    }
}
