package com.easy.kotlin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by jack on 2017/7/15.
 */
public class Basics {

    public static void main(String... args) {
        System.out.print("Java");
        System.out.println("Java");


        final List<Integer> listOfNumber = Arrays.asList(1, 2, 3, 4);
        final Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Jack");
        map.put(2, "Ali");
        map.put(3, "Mindorks");

        // Java 9
        //final List<Integer> listOfNumber2 = List.of(1, 2, 3, 4);
        //
        //final Map<Integer, String> keyValue = Map.of(1, "Jack",
        //    2, "Ali",
        //    3, "Mindorks");

    }

    public String getGrade(int score) {
        String grade;
        switch (score) {
            case 10:
            case 9:
                grade = "A";
                break;
            case 8:
            case 7:
            case 6:
                grade = "B";
                break;
            case 5:
            case 4:
                grade = "C";
                break;
            case 3:
            case 2:
            case 1:
                grade = "D";
                break;
            default:
                grade = "E";
        }
        return grade;
    }

}
