class Cleanser{
	private String s="Cleanser";
	public void append(String a){
		s+=a;
	}
	public void dilute(){
		this.append(" dilute()");
	}
	public void apply(){
		this.append(" apply()");
	}
	public void scrub(){
		this.append(" scrub()");
	}
	public String toString(){
		return this.s;
	}
	public static void main(String[] args){
		Cleanser x=new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);
	}
}

public class Detergent extends Cleanser{
	public void scrub(){
		append(" Detergent.scrub()");
		super.scrub();
	}
	public void foam(){
		append(" foam()");
	}
	public static void main(String[] args){
		Detergent x=new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("Testing base class:");
		Cleanser.main(args);
	}
}
