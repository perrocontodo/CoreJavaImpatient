/* 3. Can you ever have a mutator method return something other than void? Can you ever have an accessor method return
 * void? Give examples when possible.
 */

package corejavaimpatient;

import java.util.Random;

class MutatorAccessorReturnVoid {

    void printMessage() {
        System.out.println("Exercise 3, example 2: accessor method that prints this message, while returning void");
    }

    Integer returnRandomNumber() {
        Random r = new Random();
        return r.nextInt();
    }
}
