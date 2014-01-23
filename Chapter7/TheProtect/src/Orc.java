class Villain{
	private String name;
	protected void set(String nm){
		this.name=nm;
	}
	public Villain(String name){
		this.name=name;
	}
	public String toString(){
		return "I'm a villain and my name is "+this.name;
	}
}
public class Orc extends Villain {
	private int orcNumber;
	public Orc(String name,int number){
		super(name);
		this.orcNumber=number;
	}
	public void change(String name,int number){
		super.set(name);
		this.orcNumber=number;
	}
	public String toString(){
		return "Orc "+this.orcNumber+": "+super.toString();
	}
	public static void main(String[] args){
		Orc orc=new Orc("Limburger",12);
		System.out.println(orc);
		orc.change("Bob",19);
		System.out.println(orc);
	}
}
