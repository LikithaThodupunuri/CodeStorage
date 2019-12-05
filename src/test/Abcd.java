package test;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Abcd {
	
		public static void main(String[] args) {
			String str1 = "";
			String str2 = "";
			System.out.print("enter the number:");
			Scanner scn = new Scanner(System.in);
			try{
			int a = scn.nextInt();
			int[] ia1=new int[a];
			for (int i = 1; i <= a; i++) {
				str1=str1+i;
			}
			}
			catch(Exception e)
			{
				System.out.println("enter again");
				
			}
			int sum = 0;
			int len = 0;
			int num=0;
			int c=0;
			int c1=0;
			int num1=0;
			
		
			num=Integer.parseInt(str1);
			//System.out.println(num);
			sum=num;
			while(c1<str1.length()) {
				num1=sum;
				System.out.println(sum);
			while(c<=str1.length()-c1)
			{
				sum=sum*10+num1%10;
				num1/=10;	
				c++;
			}
			
			c1++;
			}

			
		}

}
