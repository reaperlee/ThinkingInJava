package holding;
import java.util.*;
import typeinfo.pets.*;
public class ListFeatures {
	public static void main(String[] args){
		Random rand=new Random(2);
		ForNameCreator petCreator=new ForNameCreator();
		List<Pet> pets=petCreator.arrayList(7);
		System.out.println("1:"+pets);
		Hamster h=new Hamster();
		pets.add(h);
		System.out.println("2:"+pets);
		System.out.println("3:"+pets.contains(h));
		pets.remove(h);
		Pet p=pets.get(2);
		System.out.println("4:"+p+" "+pets.indexOf(p));
		Pet cymric=new Cymric();
		System.out.println("5:"+pets.indexOf(cymric));
		System.out.println("6:"+pets.remove(cymric));
		System.out.println("7:"+pets.remove(p));
		System.out.println("8:"+pets);
		pets.add(3,new Mouse());
		System.out.println("9:"+pets);
		List<Pet> sub=pets.subList(1,4);
		System.out.println("subList:"+sub);
		System.out.println("10:"+pets.containsAll(sub));
		//Collections.sort(sub);
		Collections.shuffle(sub,rand);
		System.out.println("Shuffle SubList:"+sub);
		List<Pet> copy=new ArrayList<Pet>(pets);
		System.out.println("11:"+copy);
	}

}
