package exception;

class MyException extends Exception{
	MyException(){
		
	}
	MyException(String msg){
		super(msg);
	}
}
public class FullConsturctor {
	public static void f() throws MyException{
		System.out.println("Throw MyException From f()");
		throw new MyException();
	}
	public static void g() throws MyException{
		System.out.println("Throw MyException From g()");
		throw new MyException("Originated in g()");
	}
	public static void main(String[] args){
		try{
			f();
		}catch(MyException e){
			e.printStackTrace(System.out);
		}
		try{
			g();
		}catch(MyException e){
			e.printStackTrace(System.out);
		}
	}
}
