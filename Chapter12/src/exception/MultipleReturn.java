package exception;

public class MultipleReturn {
	public static void f(int i){
		System.out.println("Initialization Needs Cleanup");
		try{
			System.out.println("Point1");
			if(i==1) return;
			System.out.println("Point2");
			if(i==2) return;
			System.out.println("Point3");
			if(i==3) return;
			System.out.println("END");
			return;
		}finally{
			System.out.println("Performing");
		}
	}
	public static void main(String[] args){
		for(int i=0;i<4;i++){
			f(i);
		}
	}
}
