package exception;

class SimpleException extends Exception{
	public String toString(){
		return "This is SimpleException";
	}

}

public class InheritingException {
	public void f() throws SimpleException{
		System.out.println("Throwing Exception From f()");
		throw new SimpleException();
	}
	public static void main(String[] args){
		InheritingException sed=new InheritingException();
		try{
			sed.f();
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
}
