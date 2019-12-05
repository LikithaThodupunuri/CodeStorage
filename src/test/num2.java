package test;

import java.util.Scanner;

public class num2 {
	public static int reverse (int num) {
		String s1=String.valueOf(num),rev1="";
		for(int i=s1.length()-1;i>=0;i--)
		{
		rev1=rev1+s1.charAt(i);
		}
		return Integer.parseInt(rev1);
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the value:");
		int a=scn.nextInt(),sqr=a*a;
		int sqr2=reverse(a)*reverse(a);
	   if(sqr==reverse(sqr2))
		   System.out.println(a+" is an adam number");
	   else
		   System.out.println(a+" is not an adam number");
	}

}
