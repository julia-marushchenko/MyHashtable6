/**
 *  Java program to create Hash table instance and manage it.
 */

package com.mycollections;

import java.util.Hashtable;

/**
 *  Main method.
 */
public class Main {

    // Main class.
    public static void main(String[] args) {

        // Create.
        Hashtable myTable = new Hashtable<>();

        // Add.
        myTable.put(1, 2_000_000_000);
        myTable.put("String", 30_000_000);
        myTable.put(2.7, 30_000_000L);
        myTable.put(127,"Pool");

        // Print.
        System.out.println(myTable); // Output: {String=30000000, 127=Pool, 2.7=30000000, 1=2000000000}

        // Remove.
        myTable.remove(2.7);

        // Print.
        System.out.println(myTable);

        // RemoveAll.
        myTable.clear(); // Output: {String=30000000, 127=Pool, 1=2000000000}

    }
}