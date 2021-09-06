package com.vahidsaghlatoon;

import java.util.Scanner;

public class City {
    private  int[][] areas  = {{1,2,2,4,3},{2,1,4,2,3},{3,5,1,3,2},{4,3,3,1,2},{3,3,2,2,1}};

    public  int areasFactor()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter origin : ");
        int origin = input.nextInt();
        System.out.print("Enter destination : ");
        int destination = input.nextInt();
        return areas[origin][destination];
    }
}
