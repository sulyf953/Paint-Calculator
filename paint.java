package com.tsi.training.suleyman;

import java.util.Scanner;

public class paint {
    public static void other2 (String[] args) {

        //Declare the variables
        double dbArea1;
        int intCoats;
        int ChoiceP;
        float fltCovT = 17;
        float fltCovR = 13;
        float PriceT = 5.97f;
        float PriceR = 3.12f;
        float CansT;
        float CansR;
        float fltCT;
        float fltCR;

        //Give instructions, and provide the options available
        System.out.println("====================================");
        System.out.println("| Pick one these Dulux paint types |");
        System.out.println("|              Options:            |");
        System.out.println("|         1. Trade Paint           |");
        System.out.println("|         2. Retail Paint          |");
        System.out.println("====================================");

        //Take the option the user inputs
        System.out.println(           "Enter option: ");
        ChoiceP = new Scanner(System.in).nextInt();

        //The user input will decide where they go next
        switch (ChoiceP){


            //Calculate for Dulux Trade paint
            case 1: {
                System.out.println("Enter the area in meters sq: ");
                dbArea1 = new Scanner(System.in).nextDouble();
                System.out.println("Enter the number of coats: ");
                intCoats = new Scanner(System.in).nextInt();
                CansT = Math.round((dbArea1 * intCoats) / fltCovT);
                fltCT = (CansT * PriceT);
                System.out.println("Cost of the job: " + "£" + fltCT);
                System.out.println("Number of cans needed: " + CansT);
                System.out.println("Paint Coverage per liter: " + fltCovT);
                System.out.println(               "End");
                break;
            }
            case 2:{
                System.out.println("Enter the area in meters sq: ");
                dbArea1 = new Scanner(System.in).nextDouble();
                System.out.println("Enter the number of coats: ");
                intCoats = new Scanner(System.in).nextInt();
                CansR = Math.round((dbArea1 * intCoats) / fltCovR);
                fltCR = (CansR * PriceR);
                System.out.println("Cost of the job: " + "£" + fltCR);
                System.out.println("Number of cans needed: " + CansR);
                System.out.println("Paint Coverage per liter: " + fltCovR);
                System.out.println(               "End");
                break;
            }
            default:{
                System.out.println("Invalid option, please try again!");
                break;
            }

        }






    }

}
