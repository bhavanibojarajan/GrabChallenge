package com.grab.challenge;

import org.hsqldb.lib.StopWatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class intersectionList {

    public static void main(String args[]) {

        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        Scanner scanner = new Scanner(System.in);
        Scanner scan =new Scanner(System.in);

      //  Arrays.asList("GitHub","Gradle", "Maven", "Selenium", "Appium", "Continous Integration", "TestNG" ));
        ArrayList<String> List1 = new ArrayList<String>();
        int n;
        System.out.print("Enter Number of string to be entered:  ");
        n=Integer.parseInt(scanner.nextLine());
        for(int i=1; i<=n; i++)
        {
            System.out.print("Enter String:");
            String input = scanner.nextLine();
            List1.add(input);
        }

        //"GitHub","JUnit", "Jenkins", "Gradle", "log4j", "Appium"

        ArrayList<String> List2 = new ArrayList<String>();
        int r;
        System.out.print("Enter Number of string to be entered:  ");
        r=Integer.parseInt(scan.nextLine());

        for(int i=1; i<=r; i++)
        {
            System.out.print("Enter String:");
            String input = scan.nextLine();
            List2.add(input);
        };
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        System.out.println("Intersection of two List");
        System.out.println("List1 :"+List1);
        System.out.println("List2 :"+List2);
        System.out.printf("INTERSECTED STRINGS : ");
        System.out.println(new  intersectionList().getCommonWords(List1,List2));

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        stopwatch.stop();
        System.out.println("Time Taken for the program execution :"+stopwatch.elapsedTime());
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }


    public <T> List<T> getCommonWords(List<T> list1, List<T> list2) {
        List<T> list = new ArrayList<T>();

        for (T t : list1) {
            if(list2.contains(t)) {
                list.add(t);
            }}
            return list;
    }
}