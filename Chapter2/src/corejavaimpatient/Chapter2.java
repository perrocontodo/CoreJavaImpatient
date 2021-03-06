package corejavaimpatient;

import org.omg.CORBA.IntHolder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Chapter2 {

    public static void main(String[] args) {

        System.out.print("Exercise number? ");
        Scanner in = new Scanner(System.in);
        int exercise = 0;
        try {
            exercise = in.nextInt();
        } catch (InputMismatchException e) {
            printUsage();
        }

        if (exercise < 1 || exercise > 17) {
            printUsage();
        } else {
            switch (exercise) {
                case 1:
                    System.out.print("Type month and year, for example \"3 2018\": ");
                    Scanner arguments = new Scanner(System.in);
                    Cal.printCalendar(arguments.nextLine().split(" "));
                    break;
                case 2:
                    AccessorAndMutator.printMessage();
                    break;
                case 3:
                    MutatorAccessorReturnVoid mutatorAccessorReturnVoid = new MutatorAccessorReturnVoid();
                    Integer integer = mutatorAccessorReturnVoid.returnRandomNumber();
                    System.out.printf("Exercise 3, example 1: mutator that sets an instance variable to a random number" +
                            " and returns it: %d\n", integer);
                    mutatorAccessorReturnVoid.printMessage();
                    System.out.println("If we keep the original meanings from the book (mutator: method that changes the " +
                            "object on which it was invoked.\nAccessor: if it leaves the object unchanged) then these " +
                            "methods follow the definitions, although they are not very practical.");
                    break;
                case 4:
                    int int1 = 1;
                    int int2 = 5;
                    SwappingVariables.swapTwoInts(int1, int2);
                    System.out.printf("And after coming back from the method int1 equals %d, and int2 equals %d. So, no change.\n",
                            int1, int2);
                    System.out.println("The reason being that in Java parameters are passed as values. The parameters are copied\n" +
                            "to the parameter variables, where the change happens. After the method is ended, the parameter\n" +
                            "variables go out of scope.\n");

                    IntHolder intHolder1 = new IntHolder(10);
                    IntHolder intHolder2 = new IntHolder(50);
                    SwappingVariables.swapTwoIntHolders(intHolder1, intHolder2);
                    System.out.printf("And after coming back from the method intHolder1 equals %d, and intHolder2 equals %d.\n\n",
                            intHolder1.value, intHolder2.value);

                    Integer integer1 = 100;
                    Integer integer2 = 500;
                    SwappingVariables.swapTwoIntegers(integer1, integer2);
                    System.out.printf("And after coming back from the method integer1 equals %d, and integer2 equals %d.\n",
                            integer1, integer2);

                    break;
                case 5:
                    Point p = new Point(3, 4).translate(1, 3).scale(0.5);
                    System.out.printf("Point coordinates after transformation: (%.1f, %.1f)\n", p.getX(), p.getY());
                    Point p2 = new Point(8, 39).translate(3, -1).scale(2.5);
                    System.out.printf("Point coordinates after transformation: (%.1f, %.1f)\n", p2.getX(), p2.getY());
                    break;
                case 6:
                    PointMutator pm = new PointMutator(3, 4);
                    pm.translate(1, 3);
                    pm.scale(0.5);
                    System.out.printf("Point coordinates after transformation: (%.1f, %.1f)\n", pm.getX(), pm.getY());
                    PointMutator pm2 = new PointMutator(8, 39);
                    pm2.translate(3, -1);
                    pm2.scale(2.5);
                    System.out.printf("Point coordinates after transformation: (%.1f, %.1f)\n", pm2.getX(), pm2.getY());
                    break;
                case 7:
                    System.out.println("See javadoc documentation in source code");
                    break;
                case 8:
                    System.out.println("Intellij offers submenus to create classes, constructors, getters and setters. \n" +
                            "Easily accessible context menu with Alt+Insert");
                    break;
                case 9:
                    Car car = new Car(15);
                    car.Drive(500);
                    car.AddGas(10);
                    car.GetStats();
                    System.out.println("I think the best way to implement a class like this is with a mutable class." +
                            "In this case, there will not be multiple processing in this class. Besides, a car can only" +
                            "be driven once, right?");
                    break;
                case 10:
                    Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                    System.out.printf("Random number from list: %d\n", RandomNumbers.randomElement(array));
                    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
                    System.out.printf("Random number from ArrayList: %d\n", RandomNumbers.randomElement(arrayList));
                    Integer[] emptyArray = {};
                    System.out.printf("Random number from emptyArray: %d\n", RandomNumbers.randomElement(emptyArray));
                    ArrayList<Integer> emptyArrayList = new ArrayList<>();
                    System.out.printf("Random number from emptyArrayList: %d\n", RandomNumbers.randomElement(emptyArrayList));
                    System.out.println("We can't have it an instance method of int[] because primitive types are not classes in Java\n" +
                            "(and int[] is a primitive type). In the case of ArrayList, this is a class in the standard library that\n" +
                            "we can't modify.");
                    break;
                case 11:
                    System.out.println("Nothing here yet ...");
                    break;
                case 12:
                    System.out.println("Nothing here yet ...");
                    break;
                case 13:
                    System.out.println("Nothing here yet ...");
                    break;
                case 14:
                    System.out.println("Nothing here yet ...");
                    break;
                case 15:
                    System.out.println("Nothing here yet ...");
                    break;
                case 16:
                    System.out.println("Nothing here yet ...");
                    break;
                case 17:
                    System.out.println("Nothing here yet ...");
                    break;
                default:
                    printUsage();
                    break;

            }
        }
    }

    private static void printUsage() {
        System.out.println("Exercise should be a number between 1 and 17");
        System.exit(-1);
    }
}

