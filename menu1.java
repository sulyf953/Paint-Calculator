package com.tsi.training.suleyman;


import java.util.Scanner;


public class menu {

    public static void displayMenu(int Opts[],String Items[]){

        //Display Menu Graphic
        System.out.println("============================");
        System.out.println("|        MAIN MENU         |");
        System.out.println("============================");
        System.out.println("|Options:                  |");
        //Loop through options
        for (int i = 0; i < Opts.length; i++){
             System.out.printf("%d. %s\n", Opts[i], Items[i]);
        }
        System.out.println("|                          |");
        System.out.println("============================");
        System.out.println("Enter Option: ");

    }


    public static void main(String[] args) {

        //Variable
        int Choice;

        //Menu data
        int Options[] = {1, 2, 3};
        String menuItems[] = {"Area Calculator", "Cost Calculator", "Exit"};

        //Menu display
        displayMenu(Options, menuItems);

        //Setup Scanner
        Choice = new Scanner(System.in).nextInt();


        //Switch construct: Goes to one of the functions the user input
        while (Choice != 4) {

            //Check choice value
            if (Choice == 1) {
                other1();
                break;

            }

            else if (Choice == 2) {
                other2();
                break;
            }

            else if (Choice == 3) {
                System.out.println("See you next time!!!");
                System.exit(0);
            }

            else {
                System.out.println("Invalid Option! Please try again: ");
                displayMenu(Options, menuItems);
            }

        }


    }

    public static void other1() {

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
        dbArea = Math.round((2 * (dbLength * dbHeight)) + (2 * (dbWidth * dbHeight)));

        //Outputs the total area of the walls
        System.out.println("The total area of the walls: " + dbArea + "Msq");

        menu.main(null);

    }


    public static void other2() {

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
        System.out.println("Enter option: ");
        ChoiceP = new Scanner(System.in).nextInt();

        //The user input will decide where they go next
        switch (ChoiceP) {


            //Calculate for Dulux Trade paint
            case 1: {
                System.out.println("Enter the area in meters sq: ");
                dbArea1 = new Scanner(System.in).nextDouble();
                System.out.println("Enter the number of coats: ");
                intCoats = new Scanner(System.in).nextInt();
                CansT = Math.round((dbArea1 * intCoats) / fltCovT);
                fltCT = (CansT * PriceT);
                System.out.println("Cost of the job: £" + String.format("%.2f", fltCT));
                System.out.println("Number of cans needed: " + CansT);
                System.out.println("Paint Coverage per liter: " + fltCovT);
                System.out.println("End");
                break;
            }
            case 2: {
                System.out.println("Enter the area in meters sq: ");
                dbArea1 = new Scanner(System.in).nextDouble();
                System.out.println("Enter the number of coats: ");
                intCoats = new Scanner(System.in).nextInt();
                CansR = Math.round((dbArea1 * intCoats) / fltCovR);
                fltCR = (CansR * PriceR);
                System.out.println("Cost of the job: £" + String.format("%.2f", fltCR));
                System.out.println("Number of cans needed: " + CansR);
                System.out.println("Paint Coverage per liter: " + fltCovR);
                System.out.println("End");
                break;
            }
            default: {
                System.out.println("Invalid option, please try again!");
                break;
            }

        }
        menu.main(null);
    }

}

