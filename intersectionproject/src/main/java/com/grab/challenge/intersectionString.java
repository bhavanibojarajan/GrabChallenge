package com.grab.challenge;

import org.hsqldb.lib.StopWatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class intersectionString {

    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        Scanner scanner = new Scanner(System.in);
        Scanner scan =new Scanner(System.in);
        String[] s1 = {"GitHub","Gradle", "Maven", "Selenium", "Appium", "Continous Integration", "TestNG"};

        String[] s2 = {"GitHub","JUnit", "Jenkins", "Gradle", "log4j", "Appium"};


       List<String> s3= getCommonWords(s1,s2);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Intersection of two List");
        System.out.printf("String1 : " );
        for ( int i = 0; i < s1.length; i++) {
            System.out.printf(s1[i]+ " ");
        }
        System.out.printf("%n");
        System.out.printf("String2 : " );
        for ( int i = 0; i < s2.length; i++) {
            System.out.printf(s2[i]+ " ");
        }
        System.out.printf("%n");
        System.out.println("INTERSECTED STRINGS : "+s3);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        stopwatch.stop();
        System.out.println("Time Taken for the program execution "+stopwatch.elapsedTime());

    }


static public  List<String> getCommonWords(String[] s1, String[] s2)
{
    List<String> s3 = new ArrayList<String>();

    int k=0;
    for (int i = 0; i < s1.length; i++)
            {
                for (int j = 0; j < s2.length; j++)
                {
                    if(s1[i].equals(s2[j]))
                    {
                        s3.add(s2[j]);
                    }
                }
            }

return s3;
    }

}
