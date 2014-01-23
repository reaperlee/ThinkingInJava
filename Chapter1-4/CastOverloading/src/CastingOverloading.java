class TestClass{
	/*
	void func(int x){
		System.out.println("This is INT method,x="+x);
	}
	*/
	void func(double x){
		System.out.println("This is DOUBLE method,x="+x);
	}
}

public class CastingOverloading {
	public static void main(String[] args){
		TestClass a=new TestClass();
		a.func(1);
	}
}
