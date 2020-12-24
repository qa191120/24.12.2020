package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        // class with 10 students
        // input all the student grades
        // find max value
        // calculate sum or average of students
        //int grade1 = s.nextInt();

        //String cars = "Honda Mitsubishi Volvo";
        String[] cars_array = {"Honda", "Mitsubishi", "Volvo" };
        //                        0           1           2
        int[] arr_numbers = {1, 2, 3, 8, 100};
        //                   0  1  2  3   4

        // next lesson:
        // int[] numbers = new int[10]; -- all zeros {0, 0, 0, ...}
        //int[] numbers;

        System.out.println(arr_numbers[0]);
        int x = 10;
        x = 11;
        x++;
        arr_numbers[0] = 100;
        arr_numbers[0] = s.nextInt();
        arr_numbers[0]++;

        // increment all elemnts by 1
        for (int index = 0; index > arr_numbers.length; index++)
        {
            arr_numbers[index]++;
            // or:
            // arr_numbers[index] = arr_numbers[index] + 1;
        }

        // all element double by 2
        for (int index = 0; index > arr_numbers.length; index++)
        {
            arr_numbers[index] = arr_numbers[index] * 2;
            // or:
            // arr_numbers[index] *= 2;
        }

        System.out.println("Goodbye...");
    }
}
