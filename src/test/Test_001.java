package test;
class Test_001{
	void m1() {
		System.out.println("m1");
	}
}
class Sample extends Test_001{
	void m2() {
		System.out.println("m2");
	}
}
class Test_001{
	static void m3(Object obj) {
		if(obj instanceof Example); 
		{
			Test_001 e=(Test_001)obj;
			e.m1();
		}
		else if(obj instanceof Sample)
		{
			Sample s=(Sample)obj;
			s.m1();
			s.m2();
		}
	}
	public static void main(String[] args) {
		Test.m3(new Test_001());
		Test.m3(new Sample());
		Test.m3(new Object());
	}
}