package exception;
class ThreeException extends Exception{
	
}

public class FinalWorks {
	static int count=0;
	public static void main(String[] args){
		while(true){
			try{
				if(count++==0){
					throw new ThreeException();
				}
				System.out.println("No Exception");
			}catch(ThreeException e){
				System.out.println("ThreeException");
			}finally{
				System.out.println("In finally!");
				if(count==2){
					break;
				}
			}
		}
	}
}