import java.util.*;
class Apple{
	private static long counter;
	private final long id=counter++;
	public long id(){
		return this.id;
	}
}
class Orange{
	
}
public class ApplesAndOrangesWithGenerics {
	public static void main(String[] args){
		ArrayList<Apple> apples=new ArrayList<Apple>();
		for(int i=0;i<3;i++){
			apples.add(new Apple());
		}
		for(int i=0;i<apples.size();i++){
			System.out.println(apples.get(i).id());
		}
		System.out.println("Use foreach");
		for(Apple c:apples){
			System.out.println();
		}
	}
}
