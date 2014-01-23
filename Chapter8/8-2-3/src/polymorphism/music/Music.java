package polymorphism.music;


class Instrument {
	void play(Note n){
		System.out.println("Instrument.play()"+n);
	}
	String what(){
		return "Instrument";
	}
	void adjust(){
		System.out.println("Adjusting Instrument");
	}
}

class Wind extends Instrument{
	@Override void play(Note n){
		System.out.println("Wind.play()"+n);
	}
	@Override String what(){
		return "Wind";
	}
	@Override void adjust(){
		System.out.println("Adjusting Wind");
	}
}

class Percussion extends Instrument{
	@Override void play(Note n){
		System.out.println("Percussion.play()"+n);
	}
	@Override String what(){
		return "Percussion";
	}
	@Override void adjust(){
		System.out.println("Adjusting Percussion");
	}
}
		
class Stringed extends Instrument{
	@Override void play(Note n){
		System.out.println("Stringed.play()"+n);
	}
	@Override String what(){
		return "Stringed";
	}
	@Override void adjust(){
		System.out.println("Adjusting Stringed");
	}
}
class Brass extends Wind{
	@Override void play(Note n){
		System.out.println("Brass.play()"+n);
	}
	@Override String what(){
		return "Brass";
	}
	@Override void adjust(){
		System.out.println("Adjustiong Brass");
	}
}
public class Music {
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Instrument[] e){
		for(Instrument i:e){
			Music.tune(i);
		}
	}
	public static void main(String[] args){
		Instrument[] orchestra={
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass()
		};
		Music.tuneAll(orchestra);
	}
}
