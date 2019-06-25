/* CSCI S-71, Agile Software Course, HW1
 * Karen Dolan, June 25, 2019
 *
 * Intellij IDEA used to create this Hello World command line app.
 * The Hello World takes one command line argument (a name)
 * and outputs the text, "Hello, your-name!". For example:
 *
 *       $ java HelloWorld Richard
 *        Hello, Richard!
 *      $
 */

package edu.harvard.summer.hw1;

public class HelloWorld {

    public static void main(String[] args) {
        // Require only one input argument
        if (args.length != 1) {
            System.out.println("Usage: HelloWorld takes at least one command line argument (your name). Example: java HellowWorld Richard");
        } else {
            System.out.println(String.format("Hello, %s!", args[0]));
        }
    }
}
