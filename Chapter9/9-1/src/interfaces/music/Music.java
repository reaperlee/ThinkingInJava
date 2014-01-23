package interfaces.music;

abstract class Instrument{
	private int i;
	public abstract void play(Note n);
	public String what(){
		return "Instrument";
	}
	public abstract void adjust();
}

class Wind extends Instrument{
	public void play(Note n){
		System.out.println("Wind().play"+n);
	}
	public String what(){
		return "Wind";
	}
	public void adjust(){
		System.out.println("Wind().adjust");
	}
}



public class Music {
	static void tune(Instrument i){
		i.play(Note.C_MIDDLE);
	}
	public static void main(String[] args){
		Instrument i=new Wind();
		Music.tune(i);
	}
}
