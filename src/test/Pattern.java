package test;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		String str1 = "";
		String str2 = "";
		System.out.print("enter the number:");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int count = 0;
		int len = 0;
		int[] ia=new int[a];
		for (int i = 1; i <= a; i++) {
			str1=str1+i;
		}
		System.out.println(str1);
		len = str1.length();
		while ((count < len)) {
			char[] ch = str1.toCharArray();
			
			str2 = "";
			for (int j = str1.length() - 1; j > 0; j--) {
				str2 = str2 + ch[j];
			}
			str1 = str2;
			System.out.println(str1);
			count++;
		}
	}
}
