package corejavaimpatient;

import org.omg.CORBA.IntHolder;

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
                    exercise5();
                    break;
                case 6:
                    exercise6();
                    break;
                case 7:
                    exercise7();
                    break;
                case 8:
                    exercise8();
                    break;
                case 9:
                    exercise9();
                    break;
                case 10:
                    exercise10();
                    break;
                case 11:
                    exercise11();
                    break;
                case 12:
                    exercise12();
                    break;
                case 13:
                    exercise13();
                    break;
                case 14:
                    exercise14();
                    break;
                case 15:
                    exercise15();
                    break;
                case 16:
                    exercise16();
                    break;
                case 17:
                    exercise17();
                    break;
                default:
                    printUsage();
                    break;

            }
        }
    }

    private static void exercise2() {
    }

    private static void exercise3() {
    }

    private static void exercise4() {
    }

    private static void exercise5() {
    }

    private static void exercise6() {
    }

    private static void exercise7() {
    }

    private static void exercise8() {
    }

    private static void exercise9() {
    }

    private static void exercise10() {
    }

    private static void exercise11() {
    }

    private static void exercise12() {
    }

    private static void exercise13() {
    }

    private static void exercise14() {
    }

    private static void exercise15() {
    }

    private static void exercise16() {
    }

    private static void exercise17() {
    }

    private static void printUsage() {
        System.out.println("Exercise should be a number between 1 and 17");
        System.exit(-1);
    }
}

