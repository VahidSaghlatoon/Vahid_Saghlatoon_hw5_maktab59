package com.vahidsaghlatoon;

import java.util.Scanner;

public class Request {


    public void taxiRequest()
    {
        Cost cost = new Cost();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter type-> economic(1) - special(2) - motor(3) : ");
        int type = input.nextInt();
        cost.calculateCost(type);



    }
}
