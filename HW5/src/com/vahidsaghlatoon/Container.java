package com.vahidsaghlatoon;

import java.util.Scanner;

public class Container {
    private int[] digits;

    public void menu() {
        {
            Scanner input = new Scanner(System.in);
            setNumberOfDigit();
            addElement();
            int choice;
            while (true) {
                System.out.print(
                        " 1->add new element\n" +
                        " 2->remove element by index\n" +
                        " 3->remove element by value\n" +
                        " 4->print all elements\n" +
                        " 5->ascending sort\n" +
                        " 6->descending sort sort\n" +
                        " 7->find element index\n" +
                        " 8->Exit : ");
                choice = input.nextInt();
                if (choice == 1)
                    addOneElement();
                else if (choice == 2)
                    removeElementByIndex();
                else if (choice == 3)
                    removeElementByValue();
                else if (choice == 4)
                    printArrayElements();
                else if (choice == 5)
                    ascendingSort();
                else if (choice == 6)
                    descendingSort();
                else if (choice == 7)
                    findElement();
                else if (choice == 8)
                    break;
            }
        }
    }

    public void addOneElement() {
        int count;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter new digit :");
        int value = input.nextInt();
        int[] newArray = new int[digits.length+1];
        for (int i = 0; i <digits.length ; i++) {
            newArray[i]= digits[i];
        }
        newArray[newArray.length-1] = value ;
        digits = new int[newArray.length];
        for (int i = 0; i <newArray.length ; i++) {
            digits[i]=newArray[i];
        }
    }

    private void findElement() {
        if (digits != null) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter element value : ");
            int value = input.nextInt();
            int index = -1;
            for (int i = 0; i < digits.length; i++) {
                if (digits[i] == value)
                    index = i;
            }
            System.out.println("------result is : " + index + "-------");
        } else System.out.println("first set number of digit ");
    }

    private void descendingSort() {
        if (digits != null) {
            for (int i = 0; i < digits.length; i++) {
                for (int j = i + 1; j < digits.length; j++) {
                    int temp;
                    if (digits[j] > digits[i]) {
                        temp = digits[i];
                        digits[i] = digits[j];
                        digits[j] = temp;
                    }
                }
            }
            System.out.println("----sorted----");
        } else
            System.out.println("first set number of digit ");
    }

    private void ascendingSort() {
        if (digits != null) {
            for (int i = 0; i < digits.length; i++) {
                for (int j = i + 1; j < digits.length; j++) {
                    int temp;
                    if (digits[j] < digits[i]) {
                        temp = digits[i];
                        digits[i] = digits[j];
                        digits[j] = temp;
                    }
                }
            }
            System.out.println("----sorted----");
        } else
            System.out.println("first set number of digit ");
    }

    private void removeElementByValue() {
        if (digits != null) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter digit : ");
            int value = input.nextInt();
            int counterValue = 0;
            boolean check = false;
            for (int i = 0; i < digits.length; i++) {
                if (digits[i] == value) {
                    check = true;
                    counterValue++;
                }
            }
            if (check) {
                int[] newArray = new int[digits.length - counterValue];
                int count = 0;
                for (int i = 0; i < digits.length; i++) {
                    if (digits[i] != value) {
                        newArray[count] = digits[i];
                        count++;
                    }
                }
                count = 0;
                digits = new int[digits.length - counterValue];
                for (int i = 0; i < newArray.length; i++) {
                    digits[count] = newArray[i];
                    count++;
                }
                System.out.println("----removed----");
            } else
                System.out.println("can't find this value");
        } else
            System.out.println("first set number of digit ");
    }

    public void printArrayElements() {
        if (digits != null) {
            System.out.print("-------Elements { ");
            for (int element : digits) {
                System.out.print(element + " ");
            }
            System.out.println("}-------");
        } else
            System.out.println("first set number of digit ");
    }

    public void removeElementByIndex() {
        if (digits != null) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter digit index : ");
            int index = input.nextInt();
            int[] newArray = new int[digits.length - 1];
            int count = 0;
            for (int i = 0; i < digits.length; i++) {
                if (digits[i] != digits[index]) {
                    newArray[count] = digits[i];
                    count++;
                }
            }
            count = 0;
            digits = new int[digits.length - 1];
            for (int i = 0; i < newArray.length; i++) {
                digits[count] = newArray[i];
                count++;
            }
            System.out.println("----removed----");
        } else
            System.out.println("first set number of digit ");
    }

    public void setNumberOfDigit() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of digits : ");
        digits = new int[input.nextInt()];
    }

    public void addElement() {
        if (digits != null) {
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < digits.length; i++) {
                System.out.print("Enter digit : ");
                digits[i] = input.nextInt();
            }
        } else
            System.out.println("first set number of digit ");
    }


}
