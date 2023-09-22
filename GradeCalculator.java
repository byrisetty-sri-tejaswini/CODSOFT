import java.io.*;
import java.util.*;
public class GradeCalculator{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter Number of Subjects");
		int subjects=sc.nextInt();
		for(int i=1;i<=subjects;i++)
		{		
			System.out.println("Enter the marks in the subject"+i);
			int marks=sc.nextInt();
			sum=sum+marks;
		}
		System.out.println("Total Marks Obtained = "+sum);
		int averagepercentage=sum/subjects;
		System.out.println("AveragePercentage = "+averagepercentage);
		if(averagepercentage>89)
		{
			System.out.println("Your Grade is A+");
		}
		else if(averagepercentage>79)
		{
			System.out.println("Your Grade is A");
		}
		else if(averagepercentage>69)
		{
			System.out.println("Your Grade is B");
		}
		else if(averagepercentage>59)
		{
			System.out.println("Your Grade is C");
		}
		else if(averagepercentage>49)
		{
			System.out.println("Your Grade is D");
		}
		else if(averagepercentage>39)
		{
			System.out.println("Your Grade is E");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}



		