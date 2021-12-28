package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// throw keyword to throw an exception:
        try
        {
            System.out.print("A");
            throw 99;
        }
        catch (int ex)
        {
            System.out.print("B");
        }
/*
    JavaHungry.java:7: error: incompatible types: int cannot be converted to Throwable
            throw 99;
            ^
    JavaHungry.java:9: error: unexpected type
        catch (int ex)
               ^
    required: class
    found:    int
    2 errors are there:
 */

    }
}
