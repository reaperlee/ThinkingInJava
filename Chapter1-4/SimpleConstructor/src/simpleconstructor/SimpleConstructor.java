package simpleconstructor;
class Rock{
	Rock(){
		System.out.println("This is a new rock");
	}
}

class Rock1 {
	Rock1(int i){
		System.out.println("This is Rock"+i);
	}
}
public class SimpleConstructor {

	public static void main(String[] args){
		for(int i=0;i<10;i++){
			new Rock1(i);
		}
	}
}
