import typeinfo.pets.*;
import java.util.*;
public class SimpleIterator {
	public static void main(String[] args){
		typeinfo.pets.ForNameCreator petCreator=new ForNameCreator();
		List<Pet> pets=petCreator.arrayList(12);
		Iterator<Pet> it=pets.iterator();
		while(it.hasNext()){
			Pet p=it.next();
			System.out.println(p.id()+":"+p);
		}
		it=pets.iterator();
		if(it.hasNext()){
			System.out.println("Yes");
			Pet p=it.next();
			System.out.println(p.id()+":"+p);
			it.remove();
			System.out.println(pets);
		}
		else{
			System.out.println("No");
		}
	}
}
