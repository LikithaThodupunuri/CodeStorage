package test;
class Example_02 {
	Example_02(){
		System.out.println("Example 0 parameter");
	}
	Example_02(int a){
		System.out.println("Example int parameter");
	}	
}
class Sample_02 extends Example_02{
	Sample_02(int a){
		super(a);
		System.out.println("sample 0 parameter");
	}
	public static void main(String[] args) {
		Sample_02 e1=new Sample_02(4);
	}
}


