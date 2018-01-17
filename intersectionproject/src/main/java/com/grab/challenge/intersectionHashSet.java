package com.grab.challenge;



import com.google.common.collect.Sets;
import org.hsqldb.lib.StopWatch;

import java.util.*;


public class intersectionHashSet {


    public static void main(String args[]) {
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        Scanner scanner = new Scanner(System.in);
        Scanner scan =new Scanner(System.in);
        // Set which stores some 
        Set<String> set1 = new HashSet<String>();

        int n;
        System.out.print("Enter Number of string to be entered:  ");
        n=Integer.parseInt(scanner.nextLine());
        for(int i=1; i<=n; i++)
        {
            System.out.print("Enter String:");
            String input = scanner.nextLine();
            set1.add(input);
        }




        // Another Set which stores map2
        Set<String> set2 = new HashSet<String>();
        int r;
        System.out.print("Enter Number of string to be entered:  ");
        r=Integer.parseInt(scan.nextLine());
        for(int i=1; i<=r; i++)
        {
            System.out.print("Enter String:");
            String input = scan.nextLine();
            set2.add(input);
        };



        Set<String> set3=intersectionHashSet.getCommonWords(set1,set2);

        // Calculating Intersection of two Set in Java
        //Set<String> intersection = Sets.intersection(set2,set1 );
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.printf("Intersection of two Set%n SET1 : %s %n SET2 : %s %n INTERSECTED STRINGS : %s %n%n",
                set1.toString(), set2.toString(), set3.toString());



        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        stopwatch.stop();
        System.out.println("Time Taken for the program execution "+stopwatch.elapsedTime());

    }
public static <T> Set<T> getCommonWords(Set<T> s1, Set<T> s2)
{
   Set<T> s3=Sets.intersection(s1,s2);
   return  s3;
}


}

