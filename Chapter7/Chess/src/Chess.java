class Game{
	Game(int i){
		System.out.println("Game Constructor");
	}
}
class BoardGame extends Game{
	BoardGame(){
		super(2);
		System.out.println("BoardGame Constructor i=2");
	}
}
public class Chess extends BoardGame {
	Chess(){
		//super(11);
		System.out.println("Chess Constructor");
	}
	public static void main(String[] args){
		Chess x=new Chess();
	}
}
