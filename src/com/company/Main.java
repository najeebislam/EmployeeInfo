package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner("");
    String employeeName = input.next();
    System.out.print("Please enter your full name!");


    Double employeeWeekHours = input.nextDouble();
    System.out.println("Please enter how many hours you have worked this week!");
    if (employeeWeekHours > 45) {
        double overtimeHours = (double) employeeWeekHours - 45;
        double overTimeHoursEquivalent = (double) overtimeHours * 1.5;
        double finalHours = (double) employeeWeekHours + overTimeHoursEquivalent;


        }



    double employeeWage = input.nextDouble();
    System.out.println("Please enter your hourly wage!");
    double employeeSalary = (double) employeeWage * finalHours;
    System.out.println("Your");
    



    }
}
