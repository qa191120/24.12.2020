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

        System.out.println("cars length:");
        System.out.println(cars_array.length);

        System.out.println("numbers length:");
        System.out.println(arr_numbers.length);

        // print all elements in array
        // how to input elements from user -> into array

        // printing the int array
        System.out.println(arr_numbers[0]);
        System.out.println(arr_numbers[4]);
        //int[] arr_numbers = {1, 2, 3, 8, 100}; length = 5
        //                     0  1  2  3   4  -- include
        //                     0  1  2  3   4  5 -- not include
        for (int index = 0; index < arr_numbers.length; index++)
        {
            // index: 0, 1, 2, 3, 4
            System.out.println(arr_numbers[index]);
        }

        //                           0            1         2
        // String[] cars_array = {"Honda", "Mitsubishi", "Volvo" };
        for (int index = 0; index <= cars_array.length - 1; index++)
        {
            // index: 0, 1, 2
            System.out.println(cars_array[index]);
        }

        // create array of 5 numbers : 60, -10, 30, 45, 12
        int[] arr_of_5 = {60, -10, 30, 45, 12};
        
        // print all of the array elements using for loop (+length)
        for (int index = 0; index < arr_of_5.length; index++)
        {
            System.out.println(arr_of_5[index]);
        }
        
        // create array of 5 float : -5.12, 4.8, 12, 4.33, 9.51, -12.7
        float[] arr_of_floats = {-5.12f, 4.8f, 12f, 4.33f, 9.51f, -12.7f};
        //                          0     1     2     3      4     5  
        
        // print the first half of the array (using array length!)
        for (int index = 0; index < arr_of_floats.length / 2; index++)
        {
            System.out.println(arr_of_floats[index]);
        }
        
        // print the second half of the array (in separate loop)
        for (int index = arr_of_floats.length / 2; index < arr_of_floats.length; index++)
        {
            System.out.println(arr_of_floats[index]);
        }
        
        // print all the array elements from last to first
        for (int index = arr_of_floats.length - 1; index >= 0; index--)
        {
            System.out.println(arr_of_floats[index]);
        }
        
        // *etgar: create array of 1,2,3,4,5
        //           print powers 2 of the array.
        //           result: 1,4,9,16,25
        int[] arr_1_5 = {1,2,3,4,5};
        for (int index = 0; index < arr_1_5.length; index++)
        {
            System.out.println(arr_1_5[index] * arr_1_5[index]);
        }
        
        // **etgar: create array of 6 random numbers (between 1-10)
        //          input number from user
        //          check if user input number is inside of the array
        //              if so - print "bingo"

        System.out.println("Goodbye...");
    }
}
