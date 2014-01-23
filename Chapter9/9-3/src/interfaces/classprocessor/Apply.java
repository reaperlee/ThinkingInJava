package interfaces.classprocessor;
import java.util.*;
class Processor{
	public String name(){
		return this.getClass().getSimpleName();
	}
	Object process(Object input){
		return input;
	}
}
class Upcase extends Processor{
	String process(Object input){
		return input.toString().toUpperCase();
	}
}
class Splitter extends Processor{
	String process(Object input){
		return Arrays.toString(input.toString().split(" "));
	}
}
public class Apply {
	public static void process(Processor p,Object s){
		System.out.println("Using Processor "+p.name());
		System.out.println(p.process(s));
	}
	public static String s="Disagreement with beliefs is by difinition incorrect";
	public static void main(String[] args){
		process(new Upcase(),s);
		process(new Splitter(),s);
	}
}
