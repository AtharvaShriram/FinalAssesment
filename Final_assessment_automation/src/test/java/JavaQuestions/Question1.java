package JavaQuestions;

import java.util.Scanner;

public class Question1 {

	static void vowelspresentornot(String a)
	{
		char ch;
		int i=0;
		for(int j=0;j<a.length();j++)
		{
		  ch=a.charAt(j);	
		  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		  {
	            i=1;
		    System.out.println(ch); 		 
		  }
		}
		if(i==0)
			System.out.println("No vowels found in the string you just gave.Thank You!"); 
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String b;
		System.out.print("Enter the string you want to check for vowels : ");
		b=sc.nextLine();	
		System.out.println("Vowels in the string you gave '"+b+"' are as follows :"); 	
		vowelspresentornot(b);
	}
}