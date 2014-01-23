package equalmethod;

class Value{
	int i;
}
public class EqualMethod {
	public static void main(String[] args){
		Integer n1=new Integer(27);
		Integer n2=new Integer(27);
		System.out.println("n1==n2?"+(n1.equals(n2)));
		Value v1=new Value();
		Value v2=new Value();
		v1.i=27;
		v2.i=27;
		System.out.println("v1==v2?"+(v1.equals(v2)));
	}
}
