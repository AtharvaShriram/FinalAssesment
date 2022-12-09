package JavaQuestions;
import java.util.Scanner;

public class Question2 {

		public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms in the series you want");
		int n=sc.nextInt();
		int i=0,j=1,upcomingterm=0;
		System.out.println("The Fibonacci series with " + n + " terms is :");
		for(int a=0;a<n;a++)
		{
		if(a<=1)
			upcomingterm=a;
		else
		{
			upcomingterm=i+j;
		i=j;
		j=upcomingterm;
		}
		System.out.println(upcomingterm);
		}
		}
	}

