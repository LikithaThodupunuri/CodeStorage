package test;
class A5{
	static int a=10;
	int x=20;
	static void m1() {
		System.out.println("A5 class m1");
	}
	void m2() {
		System.out.println("A5 class m2");
	}
	void m3() {
		System.out.println("A5 class m3");
	}
}
public class B5 extends A5 {
		static int a=50;
		int x=60;
static void m1(){
	//super.m1();
	System.out.println("B5 class m1");
}
void m2() {
	super.m2();
	System.out.println("B5 class m2");
}
void m4() {
	System.out.println(super.a+"......."+a);
	System.out.println(super.x+"......."+x);
super.m1();
m1();
super.m2();
m2();
}
public static void main(String[] args) {
	System.out.println("a:"+a);
	m1();
	B5 b=new B5();
	b.m4();
	
}
	}


