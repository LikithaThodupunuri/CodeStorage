package test;

public class SumOfArrayEle {
public static void main(String[] args) {
	int[] a= {10,20,30,40};
	System.out.println(a.length);
	int n,c=0;
	for(int i=0;i<a.length;i++) {
		n=c+a[i];
		c=n;
	}
	System.out.println(c);
}
}
