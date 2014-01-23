import java.util.*;

public class ArraysOfPrimitives {
	public static void main(String[] args){
		int[] a1={1,2,3,4,5};
		int[] a2;
		a2=a1;
		for(int i=0;i<a2.length;i++){
			a2[i]+=1;
		}
		for(int i=0;i<a1.length;i++){
			System.out.println("a1["+i+"]="+a1[i]);
		}
		
		Random rand=new Random(47);
		int[] a3=new int[rand.nextInt(20)];
		System.out.println("a3.length="+a3.length);
	}
}
