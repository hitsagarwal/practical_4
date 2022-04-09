package practical_4;
import java.util.Scanner;
public class p04_task01_ifelsestatement {
	
		public static void main(String[] args) {
			
			p04_task01_ifelsestatement obj = new p04_task01_ifelsestatement();
			
			obj.flowControl();
		}
		
		void flowControl() {
			boolean pass = true;
			
			// if else conditions
			if(pass) 
				System.out.println("You have successfully passed :)");
			else
				System.out.println("Try again :)");
			
			
			// creating scanner object
			Scanner input = new Scanner(System.in);
			
			// if else ladder
			float cgpa;
			System.out.println("Enter CGPA secured : ");
			cgpa = input.nextFloat();
			
			if(cgpa >= 9.0f && cgpa < 10.0f)
				System.out.println("Excellent !");
			else if(cgpa >= 8.5f && cgpa < 9.0f)
				System.out.println("Very good !");
			else if(cgpa >= 7.0f && cgpa < 8.5f)
				System.out.println("Good !");
			else
				System.out.println("Average !");
			
			if(cgpa > 10.f)
				System.out.println("Bad!");
			
			
			input.close();
			
			
			
		}
}
