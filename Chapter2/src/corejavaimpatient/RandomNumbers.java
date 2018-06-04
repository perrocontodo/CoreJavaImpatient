/* 10. In the RandomNumbers class, provide two static methods randomElement that get a random element from an array or
array list of integers. (Return zero if the array or array list is empty.) Why couldn’t you make these methods into
instance methods of int[] or ArrayList<Integer>? */


package corejavaimpatient;

import java.util.ArrayList;
import java.util.Random;

class RandomNumbers {
    private static final Random generator = new Random();

    static Integer randomElement(Integer[] array) {
        if (array.length == 0)
            return 0;
        else
            return array[generator.nextInt(10)];
    }

    static Integer randomElement(ArrayList<Integer> array) {
        if (array.isEmpty())
            return 0;
        else
            return array.get(generator.nextInt(10));
    }
}
