package arrays;

import java.util.Arrays;

public class ArrayOptions {
	public static void main(String[] args){
		BerylliumSphere[] a;
		BerylliumSphere[] b=new BerylliumSphere[5];
		System.out.println(Arrays.toString(b));
		BerylliumSphere[] c=new BerylliumSphere[5];
		for(int i=0;i<2;i++){
			if(c[i]==null){
				c[i]=new BerylliumSphere();
			}
		}
		System.out.println(Arrays.toString(c));
		System.out.println("The length of c is "+c.length);
	}
}
