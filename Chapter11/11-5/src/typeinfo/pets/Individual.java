package typeinfo.pets;

public class Individual {
	private static long counter;
	private String name="";
	private long id=counter++;
	public long id(){
		return this.id;
	}
	public String toString(){
		if(this.name!=""){
			return this.name;
		}
		else{
			return this.getClass().getSimpleName();
		}
	}
	public Individual(){
		
	}
	public Individual(String name){
		this.name=name;
	}
}
