package arrays;

import java.util.*;
public class IceCream {
	private static Random rand=new Random(47);
	private static final String[] FAVORS={
		"Chocolate","Strawberry","Mint Chip","Vanilla Fudge Swirl"
		,"Mocha Almond Fudge","Rum Raisin","Mud Pie","Praline Cream"
	};
	public static String[] favorSet(int n){
		String[] result=new String[n];
		for(int i=0;i<n;i++){
			result[i]=FAVORS[rand.nextInt(FAVORS.length)];
		}
		return result;
	}
	public static void main(String[] args){
		String[] getFavorSet=IceCream.favorSet(12);
		System.out.println(Arrays.toString(getFavorSet));
	}
}
