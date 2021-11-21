package com.tsi.training.suleyman.farah;

import java.util.Scanner;

//I used the Dulux to calculate the cost of paint and the meter squared per liter of paint
//The cost of 1 liter of Dulux paint is £2.20 for a standard white paint
//The meter squared per liter of white Dulux paint is 16 MtSq
//These were my parameters that I was using in the project to calculate the cost of the job and cans needed

public class PaintCostCalculator {


    public static void main(String[] args) {

        float fltPaintMeterSq = 16;
        //This is the total meters square per 1 liter white paint by Dulux
        float fltPricePerCan = 2.20f;
        //This is the price per can of 1 liter white paint by Dulux
        float fltTotalMeterSq;
        //This is the total meter squared for the job imputed by the painter
        float fltPrice;
        //This is the cost of painting job
        float fltJobDivideCan;
        //This is the division of the total job msq by the paint can msq


        System.out.println("Enter the Total Meters Squared: ");
        //This allows the painter to enter the total meters squared for the paint job
         fltTotalMeterSq = new Scanner(System.in).nextFloat();
         //This captures the information inputted by the painter


        fltJobDivideCan = Math.round((fltTotalMeterSq) / (fltPaintMeterSq));
        //This is the equation to calculate the amount of cans needed for the paint job rounded
        System.out.println("The total cans needed are: " + fltJobDivideCan );
        //This prints the answer to the above string and the answer from the above equation


        fltPrice = Math.round(fltJobDivideCan * fltPricePerCan);
        //This is the multiplication of number of cans with the price of paint
        System.out.println("The total cost for the job is: £" + fltPrice);
        //This prints the total cost of the paint job




        }
    }

