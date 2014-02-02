package exception;
class BaseballException extends Exception{
	
}
class Foul extends BaseballException{
	
}
class Strike extends BaseballException{
	
}
abstract class Inning{
	public Inning() throws BaseballException{
		
	}
	public void event() throws BaseballException{
		
	}
	public abstract void atBat() throws Strike,Foul;
	public void walk(){
		
	}
}
class StormException extends Exception{
	
}
class RainedOut extends StormException{
	
}
class PopFoul extends Foul{
	
}

interface Storm{
	public void event() throws RainedOut;
	public void rainHard() throws RainedOut;
}
public class StormyInning extends Inning implements Storm{
	public StormyInning() throws RainedOut,BaseballException{
		
	}
	public StormyInning(String s) throws RainedOut,BaseballException{
		
	}
	public void rainHard() throws RainedOut{
		
	}
	public void event(){
		
	}
	public void atBat() throws PopFoul{
		
	}
	public static void main(String[] args){
		try{
			StormyInning si=new StormyInning();
			si.atBat();
		}catch(PopFoul e){
			System.out.println("Pop foul");
		}catch(RainedOut e){
			System.out.println("Rained out");
		}catch(BaseballException e){
			System.out.println("");
		}
	}
}
