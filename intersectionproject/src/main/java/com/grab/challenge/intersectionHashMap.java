package com.grab.challenge;

import org.hsqldb.lib.StopWatch;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class intersectionHashMap {

    public static void main(String args[]) {


        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        int n, r, hc;

        Map<Integer, String> hashedStrings1 = new HashMap<Integer, String>();

        System.out.print("Enter Number of string to be entered:  ");
        n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter String:");
            String input = scanner.nextLine();
            hc = input.hashCode();
            hashedStrings1.put(hc, input);
        }


        Map<Integer, String> hashedStrings2 = new HashMap<Integer, String>();

        System.out.print("Enter Number of string to be entered:  ");
        r = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= r; i++) {
            System.out.print("Enter String:");
            String input = scanner.nextLine();
            hc = input.hashCode();
            hashedStrings2.put(hc, input);
        }

        Map<Integer, String> hashedStrings3 = getCommonWords(hashedStrings1, hashedStrings2);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Intersection of two List");
        System.out.print("Hashed  value of the String set1  : +");
        hashedStrings1.forEach((key, value) -> System.out.print(key + " : " + value + "  "));

        System.out.print("\n");
        System.out.print("Hashed  value of the String set2  : +");
        hashedStrings2.forEach((key, value) -> System.out.print(key + " : " + value + "  "));

        System.out.print("\n");

        System.out.print("Intersection  value of the String set3 : +");
        hashedStrings3.forEach((key, value) -> System.out.print(key + " : " + value + "  "));

        System.out.print("\n");


        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        stopwatch.stop();
        System.out.println("Time Taken for the program execution " + stopwatch.elapsedTime());


    }


    public static Map<Integer, String> getCommonWords(Map<Integer, String> s1, Map<Integer, String> s2)

    {

        Map<Integer, String> hashedStrings3 = new HashMap<Integer, String>();
        for (Map.Entry<Integer, String> me : s1.entrySet())
            {
                if (s2.containsKey(me.getKey())) {

                    hashedStrings3.put(me.getKey(), me.getValue());

                }
            }

            return hashedStrings3;
        }


    }



