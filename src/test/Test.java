package test;
import java.util.Arrays;
import java.util.Scanner;
public class Test {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.print("enter the string:");
	String s1= scn.nextLine();
	char[] ch1=s1.toCharArray();
	int count=0;
	char[] ch2 = Arrays.copyOf(ch1, ch1.length);
	for(int i=0;i<ch1.length;i++) 
{
	
		for(int j=0;j<ch1.length-1;j++)
	{
		 if(ch1[i]==ch2[j])
		 {
			  count++;
		 }
		 else
			 count=count;
	}
		System.out.println(ch1[i]);
		System.out.println("count:"+count);
}
}
}
