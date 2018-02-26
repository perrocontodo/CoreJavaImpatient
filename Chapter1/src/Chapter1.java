import java.math.BigInteger;
import java.util.*;


public class Chapter1 {
    public static void main(String[] args) {
        System.out.print("Exercise number? ");
        Scanner in = new Scanner(System.in);
        int exercise = 0;
        try {
            exercise = in.nextInt();
        } catch (InputMismatchException e) {
            printUsage();
        }

        if (exercise < 1 || exercise > 16) {
            printUsage();
        } else {
            switch (exercise) {
                case 1:
                    exercise1();
                    break;
                case 2:
                    exercise2();
                    break;
                case 3:
                    exercise3();
                    break;
                case 4:
                    exercise4();
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
                default:
                    printUsage();
                    break;

            }
        }
    }

    /**
     * 1. Write a program that reads an integer and prints it in binary, octal, and hexadecimal.
     * Print the reciprocal as a hexadecimal floating-point number.
     */
    private static void exercise1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Type a number: ");
        Integer number = in.nextInt();
        System.out.printf("Number in binary: %s\n", Integer.toString(number, 2));
        System.out.printf("Number in octal: %s\n", Integer.toString(number, 8));
        System.out.printf("Number in hex: %s\n", Integer.toString(number, 16));
        Double reciprocal = 1.0 / number;
        System.out.printf("Reciprocal in hex: %s", Double.toHexString(reciprocal));
    }

    /**
     * 2. Write a program that reads an integer angle (which may be positive or negative) and
     * normalizes it to a value between 0 and 359 degrees. Try it first with the % operator,
     * then with floorMod.
     */
    private static void exercise2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Type a number: ");
        Integer degrees = in.nextInt();
        Integer normalizedDegrees = degrees % 360;
        if (normalizedDegrees < 0) normalizedDegrees += 360;
        System.out.printf("Normalized degrees: %s\n", Integer.toString(normalizedDegrees));
        Integer normalizedDegreesUsingFloorMod = Math.floorMod(degrees, 360);
        System.out.printf("Same thing but using floorMod: %s\n", Integer.toString(normalizedDegreesUsingFloorMod));

    }

    /**
     * 3. Using only the conditional operator, write a program that reads three integers and
     * prints the largest. Repeat with Math.max.
     */
    private static void exercise3() {
        Scanner in = new Scanner(System.in);
        System.out.print("Type a number: ");
        Integer numberOne = in.nextInt();
        System.out.print("and another: ");
        Integer numberTwo = in.nextInt();
        System.out.print("and another: ");
        Integer numberThree = in.nextInt();
        int maxNumber = numberOne > numberTwo ? numberOne > numberThree ? numberOne : numberTwo > numberThree ? numberTwo : numberThree : numberTwo > numberThree ? numberTwo : numberThree;
        System.out.printf("Max integer is: %s\n", maxNumber);
        System.out.printf("Same thing with Math.max: %s", Math.max(Math.max(numberOne, numberTwo), numberThree));
    }

    /**
     * 4. Write a program that prints the smallest and largest positive double value.
     * Hint: Look up Math.nextUp in the Java API.
     */
    private static void exercise4() {
        System.out.printf("Smallest double value: %s\n", Math.nextUp(0.0));
        System.out.printf("Largest double value: %s\n", Math.nextAfter(Double.POSITIVE_INFINITY, 1.0));
        System.out.printf("Double.MIN_VALUE: %s\n", Double.MIN_VALUE);
        System.out.printf("Double.MAX_VALUE: %s\n", Double.MAX_VALUE);
    }

    /**
     * 5. What happens when you cast a double to an int that is larger than the largest possible
     * int value? Try it out.
     */
    private static void exercise5() {
        double largeDouble = Double.MAX_VALUE;
        int canHoldDouble = (int) largeDouble;
        System.out.printf("Casted large double into int: %s", canHoldDouble);
        /* Answer: it takes the largest int */
    }

    /**
     * 6. Write a program that computes the factorial n! = 1 × 2 × . . . × n, using BigInteger.
     * Compute the factorial of 1000.
     */
    private static void exercise6() {
        Scanner in = new Scanner(System.in);
        System.out.print("Type a number: ");
        Integer originalNumber = in.nextInt();
        BigInteger number = BigInteger.valueOf(originalNumber);
        BigInteger result = BigInteger.valueOf(1);
        while (number.compareTo(BigInteger.ZERO) > 0) {
            result = result.multiply(number);
            number = number.subtract(BigInteger.ONE);
        }
        System.out.printf("Factorial of %s is %s", originalNumber, result);
        /* Factorial of 1000 is 4023872600770937735437024339230039857193748642107146325437999104299385123986290205920442
                                0848696940480047998861019719605863166687299480855890132382966994459099742450408707375991
                                8823627727188732519779505950995276120874975462497043601418278094646496291056393887437886
                                4873371191810458257836478499770124766328898359557354325131853239584630755574091142624174
                                7434934755342864657661166779739666882029120737914385371958824980812686783837455973174613
                                6085379534524221586593201928090878297308431392844403281231558611036976801357304216168747
                                6096758713483120254785893207671691324484262361314125087802080002616831510273418279777047
                                8463586817016436502415369139828126481021309276124489635992870511496497541990934222156683
                                2572080821333186116811553615836546984046708975602900950537616475847728421889679646244945
                                1607653534081989013854424879849599533191017233555566021394503997362807501378376153071277
                                6192684903435262520001588853514733161170210396817592151090778801939317811419454525722386
                                5541461062892187960223838971476088506276862967146674697562911234082439208160153780889893
                                9645182632436716167621791689097799119037540312746222899880051954444142820121873617459926
                                4295658174662830295557029902432415318161721046583203678690611726015878352075151628422554
                                0265170483304226143974286933061690897968482590125458327168226458066526769958652682272807
                                0757813918581788896522081643483448259932660433676601769996128318607883861502794659551311
                                5655203609398818061213855860030143569452722420634463179746059468257310379008402443243846
                                5657245014402821885252470935190620929023136493273497565513958720559654228749774011413346
                                9627154228458623773875382304838656889764619273838149001407673104466402598994902222217659
                                0433990188601856652648506179970235619389701786004081188972991831102117122984590164192106
                                8884387121855646124960798722908519296819372388642614839657382291123125024186649353143970
                                1374285319266498753372189406942814341185201580141233448280150513996942901534830776445690
                                9907315243327828826986460278986432113908350621709500259738986355427719674282224875758676
                                5752344220207573630569498825087968928162753848863396909959826280956121450994871701244516
                                4612603790293091208890869420285106401821543994571568059418727489980942547421735824010636
                                7740459574178516082923013535808184009699637252423056085590370062427124341690900415369010
                                5933983835777939410970027753472000000000000000000000000000000000000000000000000000000000
                                0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
                                0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
                                0000000000000000 */
    }

    /**
     * 7. Write a program that reads in two numbers between 0 and 65535, stores them in short
     * variables, and computes their unsigned sum, difference, product, quotient, and remainder,
     * without converting them to int.
     */
    private static void exercise7() {
        Scanner in = new Scanner(System.in);
        System.out.print("Type a number between 0 and 65535: ");
        int numberOne = in.nextInt();
        if (numberOne < 0 || numberOne > 65535) {
            System.out.println("Number has to be between 0 and 65535");
            System.exit(-1);
        }

        System.out.print("and another: ");
        int numberTwo = in.nextInt();
        if (numberTwo < 0 || numberTwo > 65535) {
            System.out.println("Number has to be between 0 and 65535");
            System.exit(-1);
        }
        short shortOne = (short) (numberOne - 32767);
        short shortTwo = (short) (numberTwo - 32767);
        System.out.printf("Sum: %s\n", (shortOne + 32767) + (shortTwo + 32767));
        System.out.printf("Difference: %s\n", shortOne - shortTwo);
        System.out.printf("Product: %s\n", (shortOne + 32767) * (shortTwo + 32767));
        System.out.printf("Quotient: %s\n", (shortOne + 32767) / (shortTwo + 32767));
        System.out.printf("Remainder: %s\n", (shortOne + 32767) % (shortTwo + 32767));
    }

    /**
     * 8. Write a program that reads a string and prints all of its nonempty substrings.
     */
    private static void exercise8() {
        Scanner in = new Scanner(System.in);
        System.out.print("Type a string: ");
        String string = in.nextLine();
        for (int i = 1; i <= string.length(); i++) {
            int j = 0;
            while (j + i <= string.length()) {
                System.out.println(string.substring(j, j + i));
                j++;
            }
        }
    }

    /**
     * 9. Section 1.5.3, “String Comparison,” on p. 21 has an example of two strings s and t
     * so that s.equals(t) but s != t. Come up with a different example that doesn't use substring).
     */
    private static void exercise9() {
        String str1 = "my string";
        String str2 = "string";
        String str3 = "my " + str2;
        if (str1.equals(str3))
            System.out.println("equals OK");
        if (str1 == str3)
            System.out.println("== OK");
    }

    /**
     * 10. Write a program that produces a random string of letters and digits by generating a
     * random long value and printing it in base 36.
     */
    private static void exercise10() {
        Random generator = new Random();
        System.out.printf("Random string: %s", Long.toString(generator.nextLong(), 36));
    }

    /**
     * 11. Write a program that reads a line of text and prints all characters that are not ASCII,
     * together with their Unicode values.
     * Try it with this string: ɸʶͶΘы
     */
    private static void exercise11() {
        Scanner in = new Scanner(System.in);
        System.out.print("Type a string: ");
        String string = in.nextLine();
        for (char ch : string.toCharArray()) {
            if (ch > 127)
                System.out.printf("Character %s is not ASCII. Unicode value: %s\n", ch, (int) ch);
        }
    }

    /**
     * 12. The Java Development Kit includes a file src.zip with the source code of the Java library.
     * Unzip and, with your favorite text search tool, find usages of the labeled break and continue
     * sequences. Take one and rewrite it without a labeled statement.
     * <p>
     * Code for break from java/util/concurrent/ConcurrentSkipListMap.java in src.zip
     */
    private static void exercise12() {
        System.out.println("The following code:\n        outer: for (;;) {\n            for (Node<K,V> b = findPredecessor(key, cmp), n = b.next;;) {\n                Object v; int c;\n                if (n == null)\n                    break outer;\n                Node<K,V> f = n.next;\n                if (n != b.next)\n                    break;\n                if ((v = n.value) == null) {\n                    n.helpDelete(b, f);\n                    break;\n                }\n                if (b.value == null || v == n)\n                    break;\n                if ((c = cpr(cmp, key, n.key)) == 0)\n                    return n;\n                if (c < 0)\n                    return null;\n                b = n;\n                n = f;\n            }\n        }\n        return null;");
        System.out.println("\ncan be written like this:\n        for (;;) {\n            for (Node<K,V> b = findPredecessor(key, cmp), n = b.next;;) {\n                Object v; int c;\n                if (n == null)\n                    return null;\n                Node<K,V> f = n.next;\n                if (n != b.next)\n                    break;\n                if ((v = n.value) == null) {\n                    n.helpDelete(b, f);\n                    break;\n                }\n                if (b.value == null || v == n)\n                    break;\n                if ((c = cpr(cmp, key, n.key)) == 0)\n                    return n;\n                if (c < 0)\n                    return null;\n                b = n;\n                n = f;\n            }\n        }");
        // Missing the continue case
    }

    /**
     * 13. Write a program that prints a lottery combination, picking six distinct numbers between 1
     * and 49. To pick six distinct numbers, start with an array list filled with 1 . . . 49.
     * Pick a random index and remove the element. Repeat six times. Print the result in sorted order.
     */
    private static void exercise13() {
        ArrayList<Integer> arrayOfNumbers = new ArrayList<>();
        for (int i = 1; i < 50; i++) {
            arrayOfNumbers.add(i);
        }
        Random arrayIndex = new Random();
        for (int j = 0; j < 6; j++) {
            int numberToRemove = arrayIndex.nextInt(arrayOfNumbers.size());
            arrayOfNumbers.remove(numberToRemove);

        }
        Collections.sort(arrayOfNumbers);
        System.out.println(arrayOfNumbers);
    }

    /**
     * 14. Write a program that reads a two-dimensional array of integers and determines whether it
     * is a magic square (that is, whether the sum of all rows, all columns, and the diagonals is
     * the same). Accept lines of input that you break up into individual integers, and stop when
     * the user enters a blank line. For example, with the input
     * 16 3 2 13
     * 5 10 11 8
     * 9 6 7 12
     * 4 15 14 1
     * (Blank line)
     * <p>
     * your program should respond affirmatively.
     */
    private static void exercise14() {
        Scanner in = new Scanner(System.in);
        String line;
        System.out.print("What is the size of the two-dimensional array? ");
        Integer sizeOfArray = Integer.parseInt(in.nextLine());
        int[][] square = new int[sizeOfArray][sizeOfArray];
        int rowCount = 0;

        System.out.printf("Enter the elements of the two-dimensional array of size %d.\n", sizeOfArray);
        System.out.println("Type a row at a time. Finish with a blank line");

        while (!(line = in.nextLine()).isEmpty()) {
            String[] valuesEntered = line.split("\\s+");
            if (valuesEntered.length != sizeOfArray) {
                System.out.println("Not a valid two-dimensional array");
                System.exit(-1);
            }

            int[] values = new int[sizeOfArray];
            for (int l=0; l<valuesEntered.length; l++) {
                try {
                    values[l] = Integer.parseInt(valuesEntered[l]);
                } catch (NumberFormatException e) {
                    System.out.println("Not a valid numeric two-dimensional array");
                    System.exit(-1);
                }
            }
            try {
                square[rowCount] = values;
                rowCount++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Not a valid numeric two-dimensional array");
                System.exit(-1);
            }
        }

        if (rowCount != sizeOfArray) {
            System.out.println("Not a valid two-dimensional array");
            System.exit(-1);
        }

        int rowMainDiagonal = 0;
        for (int j = 0; j < square.length; j++) {
            rowMainDiagonal = rowMainDiagonal + square[j][j];
        }
        int magicConstant = rowMainDiagonal;

        int rowAntidiagonal = 0;
        for (int k = 0; k < square.length; k++) {
            rowAntidiagonal = rowAntidiagonal + square[k][square.length - 1 - k];
        }
        if (rowAntidiagonal != magicConstant) {
            System.out.println("Not a magic square");
            System.exit(-1);
        }

        for (int[] row : square) {
            int rowSum = 0;
            for (int element : row) {
                rowSum = rowSum + element;
            }
            if (rowSum != magicConstant) {
                System.out.println("Not a magic square");
                System.exit(-1);
            }
        }

        for (int i = 0; i < square.length; i++) {
            int rowColumn = 0;
            for (int[] row : square) {
                rowColumn = rowColumn + row[i];
            }
            if (rowColumn != magicConstant) {
                System.out.println("Not a magic square");
                System.exit(-1);
            }
        }

        System.out.println("It is a magic square. Success!");
    }

    /**
     * 15. Write a program that stores Pascal’s triangle up to a given n in an
     * ArrayList<ArrayList<Integer>>.
     */
    private static void exercise15() {
        ArrayList<ArrayList<Integer>> pascalTriangle = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the \"height\" of the triangle: ");
        Integer height = in.nextInt();
        for (int i=0; i<height; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j=0; j<height; j++) {
                if (j == 0) {
                    row.add(1);
                } else if (i == 0) {
                    row.add(0);
                } else {
                    row.add(pascalTriangle.get(i - 1).get(j - 1) + pascalTriangle.get(i - 1).get(j));
                }
            }
            pascalTriangle.add(row);
        }
        for (ArrayList<Integer> rowToPrint : pascalTriangle) {
            System.out.println(rowToPrint);
        }
    }

    /**
     * 16. Improve the average method so that it is called with at least one parameter.
     */
    private static void exercise16() {
        double avg = average(3, 4.5, 10, 0);
        System.out.println(avg);
        avg = average(1);
        System.out.println(avg);
        avg = average(1, 2, 3, 43, 5, 5.55555555);
        System.out.println(avg);

    }

    private static void printUsage() {
        System.out.println("Exercise should be a number between 1 and 16");
        System.exit(-1);
    }

    private static double average(double first, double... rest) {
        double sum = first;
        for (double v : rest) sum += v;
        return sum / (rest.length + 1);
    }
}
