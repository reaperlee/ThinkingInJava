class Candy{
	static{
		System.out.println("Loading Candy");
	}
}
class Gum{
	static{
		System.out.println("Loading Gum");
	}
}
class Cookie{
	static{
		System.out.println("Loading Cookie");
	}
}
public class SweetShop {
	public static void main(String[] args){
		System.out.println("Inside main");
		new Candy();
		System.out.println("After creating Candy");
		try{
			Class.forName("Gum");
		}catch(Exception e){
			System.out.println(e.toString());
		}
		System.out.println("After Class.forName(\"Gum\")");
		new Cookie();
	}
}
