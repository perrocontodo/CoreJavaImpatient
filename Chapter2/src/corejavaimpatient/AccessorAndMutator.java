/* 2. Consider the nextInt method of the Scanner class. Is it an accessor or mutator? Why?
 * What about the nextInt method of the Random class?
 */

package corejavaimpatient;

import java.util.Random;
import java.util.Scanner;

public class AccessorAndMutator {

    public static void printMessage() {
        System.out.println("Exercise 2 - Answer:\nI believe the nextInt method of the Scanner class to be a mutator. The definition\n" +
                "of mutator is a method that \"changes the object on which it was invoked\". The nextInt method changes\n" +
                "the object of type Scanner because it internally moves to the next token when the method is called.\n" +
                "To try this I created an Scanner object and step through it with the debugger. There's an instance\n" +
                "variable in the object called \"position\" that changes when the method is called.\n\n" +
                "In the case of the nextInt method of the Random class, I believe this is an accessor (a method that\n" +
                "leaves the object unchanged). Looking at the code, the method called calculates a random int and returns\n" +
                "it, but no state is changed in the object. While going through the code I noticed the instance variable seed,\n" +
                "that changes with every call to nextInt, but it doesn't seem a part of the method.\n\n");

        System.out.println("Insert integer characters. Ctrl-D to stop.");
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            System.out.printf("%d ", in.nextInt());
        }
        System.out.println();

        System.out.println("Printing 5 random numbers.");
        Random r = new Random();
        for (int i=0; i<5; i++) {
            System.out.printf("%d ",r.nextInt());
        }
    }
}
