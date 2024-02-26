
package com.entity;

// Person 'Bean'
public class Person {
    // We declare some private attributes
    private String name;
    private StringBuilder address;
    private int age;
    private boolean running;

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        return;
    }

    // We have a constructor for easy creation of Person and
    // population of its attributes
    public Person(String name, StringBuilder address, int age) {
        this.name = name;
        this.address = new StringBuilder(address);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StringBuilder getAddress() {
        return address;
    }

    public void setAddress(StringBuilder address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Customize toString method
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", age=" + age +
                '}';
    }
}