package Wk4;

import java.util.Scanner;

public class BMI2 {
	private static  double weight;
	private static double height;
	public static void main(String[] args)  {
        calculateBMI(height, weight);
    }
 
    public static void calculateBMI(double weight,double height)  {
        System.out.print("Enter weight in pounds: ");
        Scanner s = new Scanner(System.in);
         weight = s.nextFloat();
        weight= weight/2.205; 
        System.out.print("Enter height in inches: ");
         height = s.nextFloat();
        height= height*0.0254;
        
        		         
        double bmi= weight/(height*height);
         
        System.out.println("Your BMI is: "+bmi);
        printBMICategory(bmi);
         
    }
     
    // Prints BMI category
    public static void printBMICategory(double bmi) {
        if(bmi < 18.5) {
            System.out.println("Underweight");
        }else if (bmi < 25) {
            System.out.println("Normal");
        }else if (bmi < 30) {
            System.out.println("Overweight");
        }else {
            System.out.println("You are obese");
        }
    }

}
