package typeinfo.pets;
import java.util.*;

public class Pets extends PetCreator {
	private static List<Class<? extends Pet>> types=new ArrayList<Class<? extends Pet>>();
	private static String[] typeString={
		"typeinfo.Cat",
		"typeinfo.Cymric",
		"typeinfo.Dog",
		"typeinfo.Hamster"
	};
	@SuppressWarnings("Unchecked")
	private static void  load(){
		for(String tmp:typeString){
			try{
				types.add((Class<? extends Pet>)Class.forName(tmp));
			}catch(Exception e){
				throw new RuntimeException(e);
			}
		}
	}
	static {
		load();
	}
	public List<Class<? extends Pet>> types(){
		return types;
	}
}
