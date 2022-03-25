import java.util.Scanner;
public class GradesAverage  

{ 

	public static void main(String[] args)  

	{ 

		Scanner sc= new Scanner(System.in); 

		System.out.println("Enter the number of students:" ); 

		int numStudents = sc.nextInt(); 

		int i, j, sum=0, grades=0; 

		for (i=0; i<numStudents; i++) 

		{ 

			//sum = sum+grades; 

			System.out.println("Enter the grade for student"+(i+1)+":" ); 

			grades = sc.nextInt(); 

			if(grades<=100) 

			{ 

				sum= sum+grades; 

			} 

			else 

			{ 

				System.out.println("Invalid grade, try again..."); 

				i--; 

			} 

		} 

		//System.out.println("Sum is :" +sum); 
		int average = sum / numStudents; 

		System.out.println("Average is :" +average); 

	} 

} 