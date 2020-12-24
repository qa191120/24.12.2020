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

        System.out.println(cars_array[0]);

        // targil: print first + last item in each array
        // targil: print middle  item in each array (even = middle + 1)
        // question: what happends when you try to print beyond last?

        // create an array of integers with numbers: 6, -100, 30, 40, 500
        // .. what is the cell number of 500 ?
        int[] arr_numbers = {6, -100, 30, 40, 500};
        //                   0    1    2   3    4

        // create an array of floats with numbers: 0.2, -4.57, 10.11
        float[] arr_floats = {0.2f, -4.57f, 10.11f};
        //                      0      1       2

        // create an array of booleans with : true, true, false, false, true
        boolean[] arr_booleans = {true, true, false, false, true};
        //                         0      1     2      3      4

        // *etgar: create an array of integers with 4 random numbers
        int[] arr_randoms = {r.nextInt(1000), r.nextInt(1000),
                r.nextInt(1000), r.nextInt(1000)};
        // *etgar:examine using break-point



        System.out.println("Goodbye...");
    }
}
