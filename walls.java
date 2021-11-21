package com.tsi.training;


import java.util.Scanner;

public class walls {

    public static void other1 (String[] args){

        //Declare all my variables
        double dbHeight;
        double dbLength;
        double dbWidth;
        double dbArea;

        //Assisting them on how to measure the room
        System.out.println("=====================================================");
        System.out.println("|                   Instructions:                   |");
        System.out.println("| Measure the height and width of the smallest wall |");
        System.out.println("|    Then measure the length of the longest wall    |");
        System.out.println("=====================================================");


        //Taking the measurements of the room

        System.out.println("Enter the height in meters: ");
        dbHeight = new Scanner(System.in).nextDouble();
        //The input for height

        System.out.println("Enter the length in meters: ");
        dbLength = new Scanner(System.in).nextDouble();
        //The input for length

        System.out.println("Enter the width in meters: ");
        dbWidth = new Scanner(System.in).nextDouble();
        //The input for width

        //Finding the area of the walls
        dbArea = Math.round((2*(dbLength * dbHeight))+(2*(dbWidth * dbHeight)));

        //Outputs the total area of the walls
        System.out.println("The total area of the walls: " + dbArea + "Msq");




    }

}
