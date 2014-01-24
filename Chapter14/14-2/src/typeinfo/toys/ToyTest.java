package typeinfo.toys;
interface HasBatteries{
	
}
interface Waterproof{
	
}
interface Shoots{
	
}
class Toy{
	Toy(){
		
	}
	Toy(int i){
		
	}
}
class FancyToy extends Toy
	implements HasBatteries,Waterproof,Shoots{
	FancyToy(){
		super(1);
	}
	public void f(){
		System.out.println("This is f");
	}
}
public class ToyTest {
	static void printInfo(Class cc){
		System.out.println("Class name:"+cc.getName()+" is interface? ["+cc.isInterface()+"]");
		System.out.println("Simple name:"+cc.getSimpleName());
		System.out.println("Cannonical name:"+cc.getCanonicalName());
	}
	public static void main(String[] args){
		Class c=null;
		try{
			c=Class.forName("typeinfo.toys.FancyToy");
		}catch(Exception e){
			System.out.println(e.toString());
			System.exit(1);
		}
		printInfo(c);
		
		for(Class face:c.getInterfaces()){
			printInfo(face);
		}
		Class up=c.getSuperclass();
		Object obj=null;
		System.out.println("******************");
		try{
			obj=up.newInstance();
		}catch(Exception e){
			System.out.println(e.toString());
			System.exit(1);
		}
		printInfo(obj.getClass());
	}
}
