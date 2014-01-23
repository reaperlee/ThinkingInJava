
public class Flower {
	int petalCount=0;
	String s="Initial value";
	Flower(int petal){
		this.petalCount=petal;
		System.out.println("Constructor with int arg only,petalCount="+this.petalCount);
	}
	Flower(String ss){
		this.s=ss;
		System.out.println("Constructor with String arg only,s="+this.s);
	}
	Flower(int petal,String ss){
		this(petal);
		//this(ss);
		this.s=ss;
		System.out.println("Constructor with int & String s="+this.s+" petalCount="+this.petalCount);
	}
	Flower(){
		this(47,"hi");
		System.out.println("Default Constructor");
	}
	void printPetalCount(){
		System.out.println("PetalCount="+this.petalCount+" s="+this.s);
	}
	public static void main(String[] args){
		Flower x=new Flower();
		x.printPetalCount();
	}
}
