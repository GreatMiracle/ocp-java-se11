package org.pkg.entity;

import org.pkg.appglobals.ApplicationConstants;
import org.pkg.util.Countable;

public class BaseEntity implements Countable {

    // Constructor calls the countMe method
    public BaseEntity() {
        countMe();
    }

    // main method creates several objects then prints out how many
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            BaseEntity b1 = new BaseEntity();
        }
        System.out.println(ApplicationConstants.APP_NAME + " created " +
                ApplicationConstants.getCounter() + " objects ");
    }

    // countMe implements Countable.countMe method
    public void countMe() {
        ApplicationConstants.addCounter();
    }
}