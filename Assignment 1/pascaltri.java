package pascaltri;
import java.util.Scanner;

public class pascaltri 
{
	public static void main(String[] args) 
	{
		int i, j;
		System.out.println("Enter the number of rows: ");
		Scanner sc= new Scanner(System.in);
		int rows = sc.nextInt();
		for (i=1; i<=rows; i++)
		{
			for (j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//System.out.print(" ");
		sc.close();
	}
}
