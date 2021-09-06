package com.vahidsaghlatoon;

import java.util.Scanner;

public class Cost {
    public static final int ECONOMIC_TARIFF = 5000;
    public static final int SPECIAL_TARIFF = 10000;
    public static final int MOTOR_TARIFF = 4000;
    private double[] rainy = {1.2, 2.0, 0.8};
    private double[] peak = {1.2, 2.0, 2.0};
    private double[] rainyAndPeak = {1.4, 3.0, 1.5};


    public void economic() {
        Scanner input = new Scanner(System.in);
        City city = new City();
        double result = 0;
        System.out.print("Enter status-> rainy(1) - peak(2) - rainy and peak(3) :  ");
        int status = input.nextInt();
        if (status == 1) {
            int areaFactor = city.areasFactor();
            result = ECONOMIC_TARIFF * areaFactor * rainy[0];
        } else if (status == 2) {
            int areaFactor = city.areasFactor();
            result = ECONOMIC_TARIFF * areaFactor * peak[0];
        } else if (status == 3) {
            int areaFactor = city.areasFactor();
            result = ECONOMIC_TARIFF * areaFactor * rainyAndPeak[0];
        }
        System.out.println(" trip cost is  : " + result);
    }

    public void special() {
        Scanner input = new Scanner(System.in);
        City city = new City();
        double result = 0;
        System.out.print("Enter status-> rainy(1) - peak(2) - rainy and peak(3) :  ");
        int status = input.nextInt();
        if (status == 1) {
            int areaFactor = city.areasFactor();
            result = SPECIAL_TARIFF * areaFactor * rainy[1];
        } else if (status == 2) {
            int areaFactor = city.areasFactor();
            result = SPECIAL_TARIFF * areaFactor * peak[1];
        } else if (status == 3) {
            int areaFactor = city.areasFactor();
            result = SPECIAL_TARIFF * areaFactor * rainyAndPeak[1];
        }
        System.out.println(" trip cost is  : " + result);
    }

    public void motor() {
        Scanner input = new Scanner(System.in);
        City city = new City();
        double result = 0;
        System.out.print("Enter status-> rainy(1) - peak(2) - rainy and peak(3) :  ");
        int status = input.nextInt();
        if (status == 1) {
            int areaFactor = city.areasFactor();
            result = MOTOR_TARIFF * areaFactor * rainy[2];
        } else if (status == 2) {
            int areaFactor = city.areasFactor();
            result = MOTOR_TARIFF * areaFactor * peak[2];
        } else if (status == 3) {
            int areaFactor = city.areasFactor();
            result = MOTOR_TARIFF * areaFactor * rainyAndPeak[2];
        }
        System.out.println(" trip cost is  : " + result);
    }

    public void calculateCost(int type) {
        if (type == 1) {
            economic();
        } else if (type == 2) {
            special();
        } else if (type == 3) {
            motor();
        }
    }
}
