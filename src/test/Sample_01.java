package test;
class Example_01{
	Example_01(){
		System.out.println("Example_01 zero parameter");
	}
	Example_01(int a){
		System.out.println("Example_01 int parameter");
	}
}
class Sample_01 extends Example_01 {
Sample_01(){
	System.out.println("Sample_01 zero parameter");
}
Sample_01(int a){
	super(a);
	System.out.println("Sample_01 int parameter");
}
public static void main(String[] args) {
	Sample_01 s1= new Sample_01();
	Sample_01 s2=new Sample_01(6);
}
}
