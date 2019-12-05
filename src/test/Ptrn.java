package test;

import java.util.Scanner;

public class Ptrn {
	public static void main(String[] args) {
		System.out.print("enter the number:");
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		String str1="";
		for(int i=1;i<=a;i++)
		{
			str1=str1+i;	
		}
		System.out.println(str1);
		for(int j=1;j<str1.length();j++) {
			System.out.println(rev(str1));
		}
	}
	public static String rev(String str2) {
		String str3="";
		for(int k=str2.length();k>1;k--) {
			str3=str3+k;
			 
		}
		String str4=str3;
		return str3;
	
	}
	

}
