/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Judah Libera
 */
import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int loop = 0, w = 0, h = 0;

        do {
            loop = 0;
            System.out.printf("What is you weight in pounds? ");
            String ws = sc.nextLine();
            try
            {
                w = Integer.parseInt((ws));
            }
            catch(NumberFormatException n)
            {
                loop = 1;
            }
        }while(loop == 1);

        do {
            loop = 0;
            System.out.printf("What is you height in inches? ");
            String hs = sc.nextLine();
            try
            {
                h = Integer.parseInt((hs));
            }
            catch(NumberFormatException n)
            {
                loop = 1;
            }
        }while(loop == 1);

        double bmi = ((double)w / (double)(h * h)) * 703;
        if(bmi < 18.5)
            System.out.printf("Your BMI is %.1f.\nYou are underweight. You should see your doctor", bmi);
        else if (bmi > 25)
            System.out.printf("Your BMI is %.1f.\nYou are overweight. You should see your doctor", bmi);
        else
            System.out.printf("Your BMI is %.1f.\nYou are within the ideal weight range", bmi);
    }
}