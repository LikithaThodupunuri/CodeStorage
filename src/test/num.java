package test;

import java.util.Scanner;

public class num {
	public static int rev(int num)
	{
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+(num%10);
			num/=10;
		}
		return rev;
		
	}

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter the number:");
		int a=s1.nextInt();
		int sqr=a*a;
		int sqr2=rev(a)*rev(a);
		
		if(sqr==rev(sqr2))
		{
		System.out.println(a+" is an adam number");
		}else
		System.out.println(a+" is not an adam number");
	}

}
