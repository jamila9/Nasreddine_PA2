import java.util.Scanner; 
public class Nasreddine_p2 { 
 
public static void main(String []args){  
	Scanner scnr = new Scanner(System.in);
	double weight, height;  
	double bmi;  int option;
	System.out.println("*********************BMI Calculator*********************************");
	System.out.println("********************************************************************");
	System.out.println("If you wil enter your weight in pounds and height in meters, press 1.");
	System.out.println("If you will enter your weight in kg and height in inches, press 2.");
	System.out.println("********************************************************************");
	option = scnr.nextInt();
	switch (option) {
	case 1:
		System.out.println("Enter your weight pounds: ");
		weight = scnr.nextDouble();
		System.out.println("Enter your height inches: ");
		height = scnr.nextDouble();
		bmi = ( 703 * weight) / Math.pow(height, 2.0);
		System.out.println("Your BMI is: " + bmi);
		if (bmi < 18.5 )                 
			System.out.print("Weight Status: Underweight"); 
            else if (bmi >= 18.5 && bmi < 25)
            System.out.print("Weight Status: Normal");
            else if (bmi >= 25 && bmi < 30)
            System.out.print(" Weight Status: Overweight");
            else if (bmi >= 30)
            System.out.print("Weight status :Obese");
			break; 
 
        case 2:
        	System.out.println("Enter your weight kilograms: ");
        	weight = scnr.nextDouble(); 
        	System.out.println("Enter your height feet: ");
        	height = scnr.nextDouble();
        	bmi = (weight) / Math.pow(height, 2.0);
        	System.out.println("Your BMI is: " + bmi);
        	if (bmi < 18.5 )
        	System.out.print("Weight Status: Underweight");
            else if (bmi >= 18.5 && bmi < 25)
            System.out.print("Weight Status: Normal"); 
            else if (bmi >= 25 && bmi < 30)
            System.out.print(" Weight Status: Overweight");
            else if (bmi >= 30)
            System.out.print("Weight status :Obese");
        	break;
        	} 
	}
} 
