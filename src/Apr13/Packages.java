package Apr13;

import Apr13.A.A;

public class Packages{
    public static void main(String[] args) {
        // Packages
        // 1. Built-in - java, lang, util, io, etc
        // java & lang are imported by default
        // 2. User defined

        // command to compile - javac -d directory filename.java
        // run - java packageName.fileName
        System.out.println("Jay Shree Ram!");

        A.greet();

        // ASSIGNMENT - Create a package 'circle' that has a class 'Circle'
        // The class Circle has a radius as an attribute and methods to calcualte area and other geometric features of circle
        // Use pacakge 'circle' in some other package/class that contain main() method, and check all the methods of Circle class
        // stuff to do without telling
        // constructor is must
        // radius should be positive
    }
}