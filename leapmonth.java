/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exams;

/**
 *
 * @author ochie
 */
public class leapmonth {
    
    public static void main(String[] args) {
        int year = 2024; // Year to check for leap month
        int month = 2;   // Month to check for leap month

        boolean isleapmonth = (year % 4 == 0);
        isleapmonth = isleapmonth && (year % 100 != 0);
        isleapmonth = isleapmonth || (year % 400 == 0);

        if (isleapmonth) {
            System.out.println(year + " is a leap year.");
            if (month == 2) {
                System.out.println("February is a leap month in a leap year.");
            } else {
                System.out.println("February is not a leap month in a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
            System.out.println("February is not a leap month in a non-leap year.");
        }
    }

}