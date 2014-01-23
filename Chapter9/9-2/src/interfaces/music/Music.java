package interfaces.music;

interface Instrument{
	int VALUE=5;
	void play(Note n);
	void adjust();
}

class Wind implements Instrument{
	public void play(Note n){
		System.out.println(this+".play() "+n);
	}
	public String toString(){
		return "Wind";
	}
	public void adjust(){
		System.out.println(this+".adjust()");
	}
}
class Percussion implements Instrument{
	public void play(Note n){
		System.out.println(this+".play() "+n);
	}
	public void adjust(){
		System.out.println(this+".play()");
	}
	public String toString(){
		return "Percussion";
	}
}

class Stringed implements Instrument{
	public void play(Note n){
		System.out.println(this+".play() "+n);
	}
	public String toString(){
		return "Stringed";
	}
	public void adjust(){
		System.out.println(this+".adjust()");
	}
}
class Brass extends Wind{
	public String toString(){
		return "Brass";
	}
}
class Woodwind extends Wind{
	public String toString(){
		return "WoodWind";
	}
}
public class Music {
	static void tune(Instrument i){
		i.play(Note.C_MIDDIE);
	}
	static void tuneAll(Instrument[] e){
		for(Instrument i:e){
			i.play(Note.C_MIDDIE);
		}
	}
	public static void main(String[] args){
		Instrument[] orchestra={
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind()
		};
		Music.tuneAll(orchestra);
	}
}
