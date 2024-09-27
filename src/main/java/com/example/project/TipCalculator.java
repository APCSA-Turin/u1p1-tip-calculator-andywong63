package com.example.project;

public class TipCalculator {
    public static String roundMoney(double number) {
        return "$" + String.format("%.2f", number); // https://stackoverflow.com/a/27832159
    }
    public static String roundMoneyDown(double number) {
        number = (int) (number * 100) / 100.0;
        return "$" + String.format("%.2f", number); // https://stackoverflow.com/a/27832159
    }
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here

        double tip = (int) (cost * percent + 0.5) / 100.0;
        double totalCost = cost + tip;

        String costRounded = roundMoney(cost);
        String tipRounded = roundMoney(tip);
        String perPersonCost = roundMoney(cost / people);
        String perPersonTip = roundMoney(tip / people);
        String perPersonTotal = roundMoneyDown(totalCost / people);
        String totalCostRounded = roundMoney(totalCost);
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + costRounded + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: " + tipRounded + "\n");
        result.append("Total Bill with tip: " + totalCostRounded + "\n");
        result.append("Per person cost before tip: " + perPersonCost + "\n");
        result.append("Tip per person: " + perPersonTip + "\n");
        result.append("Total cost per person: " + perPersonTotal + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 5;
        int percent = 10;
        double cost = 125;
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
