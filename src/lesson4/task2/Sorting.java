package lesson4.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        System.out.print("base ");
        base(args);
        System.out.println();
        System.out.print("asc ");
        asc(args);
        System.out.println();
        System.out.print("desc ");
        desc(args);
        System.out.println();
        System.out.print("inner ");
        inner(args);


    }

    public static void base(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
            if (i < args.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void asc(String[] args) {
        Integer[] numbers = new Integer[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void desc(String[] args) {
        Integer[] numbers = new Integer[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(numbers, Collections.reverseOrder());
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void inner(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        for (String arg : args) {
            l.add(Integer.parseInt(arg));
        }

        ArrayList<Integer> sortedList = new ArrayList<>(l);
        Collections.sort(sortedList, Collections.reverseOrder());

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < sortedList.size(); i++) {
            if (i % 2 == 0)
                result.add(sortedList.get(i));
        }
        for (int i = sortedList.size() - 1; i >= 0; i--) {
            if (i % 2 != 0)
                result.add(sortedList.get(i));
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(", ");
            }
        }
    }

}




