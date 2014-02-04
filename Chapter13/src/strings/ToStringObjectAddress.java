package strings;

class Apple{
	private int i;
	private static int counter=0;
	Apple(){
		this.i=counter++;
	}
	public String toString(){
		return "Apple "+i+" ;Address:"+super.toString();
	}
}
public class ToStringObjectAddress {
	public static void main(String[] args){
		Apple[] appleList=new Apple[10];
		for(int i=0;i<10;i++){
			appleList[i]=new Apple();
			System.out.println(appleList[i]);
		}
	}
}
