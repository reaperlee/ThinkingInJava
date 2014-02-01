package exception;
class MyException1 extends Exception{
	private int x;
	MyException1(){
		
	}
	MyException1(String msg){
		super(msg);
	}
	MyException1(String msg,int x){
		super(msg);
		this.x=x;
	}
	public int val(){
		return this.x;
	}
	public String getMessage(){
		return "Detailed message:"+x+" "+super.getMessage();
	}
}
public class ExtraFeatures {
	public static void f() throws MyException1 {
		System.out.println("Throwing MyException In f()");
		throw new MyException1();
	}
	public static void g() throws MyException1{
		System.out.println("Throwing MyException In g()");
		throw new MyException1("Originated In g()");
	}
	public static void h() throws MyException1{
		System.out.println("Throwing MyException In h()");
		throw new MyException1("Originated In h()",12);
	}
	public static void main(String[] args){
		try{
			f();
		}catch(MyException1 e){
			e.printStackTrace(System.out);
		}
		
		try{
			g();
		}catch(MyException1 e){
			e.printStackTrace(System.out);
		}

		try{
			h();
		}catch(MyException1 e){
			e.printStackTrace(System.out);
		}
	}
}
