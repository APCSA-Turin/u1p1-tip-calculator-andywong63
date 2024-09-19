package com.example.project;

public class TipCalculator {
    public static double roundToPlaces(double number, int places) {
        double multiplyFactor = Math.pow(10, places);
        return (int) (number * multiplyFactor + 0.5) / multiplyFactor;
    }
    public static double roundDownToPlaces(double number, int places) {
        double multiplyFactor = Math.pow(10, places);
        return (int) (number * multiplyFactor) / multiplyFactor;
    }
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here

        double tip = (int) (cost * percent + 0.5) / 100.0;
        double totalCost = cost + tip;
        double perPersonCost = roundToPlaces(cost / people, 2);
        double perPersonTip = roundToPlaces(tip / people, 2);
        double perPersonTotal = roundDownToPlaces(totalCost / people, 2);
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: " + "$" + tip + "\n");
        result.append("Total Bill with tip: " + "$" + totalCost + "\n");
        result.append("Per person cost before tip: " + "$" + perPersonCost + "\n");
        result.append("Tip per person: " + "$" + perPersonTip + "\n");
        result.append("Total cost per person: " + "$" + perPersonTotal + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12;
        int percent = 15;
        double cost = 566.97;
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
