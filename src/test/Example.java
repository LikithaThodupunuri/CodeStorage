package test;
public class Example {
int x;
public Example(int x){
	this.x=x;
	}
@Override
public int hashCode() {
		return x;
	}

}


