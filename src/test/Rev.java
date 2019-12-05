package test;
import java.util.Scanner;
public class Rev {
public static void main(String[] args) {
	Scanner cn=new Scanner(System.in);
	System.out.println("enter the number");
	int a=cn.nextInt();
	System.out.println(getReverse(a));
}
public static int getReverse(int n) {
	int rev=0;
	while(n>0) {
		rev=rev*10+(n%10);
		n=n/10;
	}
	return rev;
}
}
