package test;
public class Test_01 {
	public static void main(String[] args) {
		Example e1=new Example(7);
		System.out.println(e1);
		System.out.println(e1.hashCode()); 
		System.out.println(System.identityHashCode(e1));
		System.out.println();
		Example e2=new Example(7);
		System.out.println(e1);
		System.out.println(e1.hashCode());
		System.out.println(System.identityHashCode(e1));
		
		
		System.out.println();System.out.println();
		
		String s1=new String("6");
		String s2=new String("6");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(System.identityHashCode(s1));
		System.out.println();
		System.out.println(s2);
		System.out.println(s2.hashCode());
		System.out.println(System.identityHashCode(s2));
		System.out.println();
		String s3="a";
		String s4="a";
		System.out.println(s3);
		System.out.println(s3.hashCode());
		System.out.println(System.identityHashCode(s3));
		System.out.println();
		System.out.println(s4);
		System.out.println(s4.hashCode());
		System.out.println(System.identityHashCode(s4));
		System.out.println();
		String s5="ab";
		System.out.println(s5);
		System.out.println(s5.hashCode());
		System.out.println(System.identityHashCode(s5));
		System.out.println();
		String s6="ab";
		System.out.println(s6);
		System.out.println(s6.hashCode());
		System.out.println(System.identityHashCode(s6));
		System.out.println();
		String s7="abc";
		System.out.println(s7);
		System.out.println(s7.hashCode());
		System.out.println(System.identityHashCode(s7));
		System.out.println();
	}
}
