package test;
import java.util.*;
public class PrintInt {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("rose");
	al.add("lyre");
	al.add("random");
	al.add("yellow");
	System.out.println(al);
	for(String s:al) {
		if(s.contains("r"))
			System.out.println();
		else
			System.out.println(s);
	}
}
	
	
}
