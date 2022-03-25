package day4;

 import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//import java.nio.Buffer;
//import java.nio.file.Files;
import java.io.*;
public class Largestnumberinfile {
	public static void main(String args[]) throws IOException
	{
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("data.txt"));
			ArrayList<Double>arr=new ArrayList<>();
			String line;
			while((line=br.readLine())!=null)
			{
				String[] r=line.split(" ");
				for(int i=0;i<r.length;i++)
				{
					double val=Double.parseDouble(r[i]);
					arr.add(val);
					System.out.println(val);
				}
			}
			br.close();
			double max=0;
			for(int i=0;i<arr.size();i++)
			{
	           if(arr.get(i)>max)
	           {
	        	   max=arr.get(i);
	           }
			}
			System.out.println("the maximum double value is " +max);
	}
		catch(IOException io)
		{
			System.out.println("Error occurred");
		}
		catch(NumberFormatException n)
		{
			System.out.println("Error occurred");
		}

		
}
}
