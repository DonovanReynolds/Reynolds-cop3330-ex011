package org.example;

import java.util.Scanner;

/*
 *   UCF COP 3330 Fall 2021 Assignment 11 Solution
 *   Copyright 2021 Donovan Reynolds
 */
public class App 
{
    public static void main( String[] args )
    {
        String eurosText = inputOutput("How many euros are you exchanging?");
        String exchangeText = inputOutput("What is the exchange rate?");

        int euros = Integer.parseInt(eurosText);
        double exchange = Double.parseDouble(exchangeText);
        double dollars = Math.ceil((euros * exchange)*100)/100;

        System.out.printf("%d euros at an exchange rate of %.4f is %.2f U.S. dollars." , euros,exchange,dollars);

    }
    public static String inputOutput(String textToSay)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(textToSay);
        return input.nextLine();
    }
}
