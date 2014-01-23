class Instrument{
	private String name;
	public Instrument(String name){
		this.name=name;
	}
	public void play(){
		System.out.println("Playing "+this.name);
	}
	public String toString(){
		return this.name;
	}
	static void tune(Instrument i){
		System.out.println("Tuning "+i);
	}
}
public class Wind extends Instrument{
	public Wind(){
		super("Wind");
	}
	public static void main(String[] args){
		Wind w=new Wind();
		Instrument.tune(w);
	}
}
