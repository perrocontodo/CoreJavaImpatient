/* 4. Why can’t you implement a Java method that swaps the contents of two int variables?
 * Instead, write a method that swaps the contents of two IntHolder objects.
 * (Look up this rather obscure class in the API documentation.)
 * Can you swap the contents of two Integer objects?
 */

package corejavaimpatient;

import org.omg.CORBA.IntHolder;

class SwappingVariables {

    static void swapTwoInts(int int1, int int2) {
        System.out.println("Swapping 2 ints:");
        System.out.printf("Originally int1 equals %d, and int2 equals %d.\n", int1, int2);
        int temp = int1;
        int1 = int2;
        int2 = temp;
        System.out.printf("After swapping int1 equals %d, and int2 equals %d (inside the method).\n", int1, int2);

    }

    static void swapTwoIntHolders(IntHolder intHolder1, IntHolder intHolder2) {
        System.out.println("Swapping 2 IntHolders:");
        System.out.printf("Originally intHolder1 equals %d, and intHolder2 equals %d.\n",
                intHolder1.value, intHolder2.value);
        IntHolder temp = new IntHolder(intHolder1.value);
        intHolder1.value = intHolder2.value;
        intHolder2.value = temp.value;
        System.out.printf("After swapping intHolder1 equals %d, and intHolder2 equals %d (inside the method).\n",
                intHolder1.value, intHolder2.value);
    }

    static void swapTwoIntegers(Integer integer1, Integer integer2) {
        System.out.println("Swapping 2 Integers:");
        System.out.printf("Originally integer1 equals %d, and integer1 equals %d.\n",
                integer1, integer2);
        Integer temp = integer1;
        integer1 = integer2;
        integer2 = temp;
        System.out.printf("After swapping integer1 equals %d, and integer2 equals %d (inside the method).\n",
                integer1, integer2);
        System.out.println("I'm not 100%, but I think this can't be done because the Integer class wraps an int value");
    }
}
