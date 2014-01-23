package interfaces.interfaceprocessor;
import java.util.*;

class Upcase extends StringProcessor{
	public String process(Object input){
		return input.toString().toUpperCase();
	}
}

class Downcase extends StringProcessor{
	public String process(Object input){
		return input.toString().toLowerCase();
	}
}
public abstract class StringProcessor implements Processor {
	public String name(){
		return getClass().getSimpleName();
	}
	public abstract String process(Object input);
	public static String s="If she weights the same as duck,she's made of wood";
	public static void main(String[] args){
		Apply.process(new Upcase(),s);
		Apply.process(new Downcase(),s);
	}
}
