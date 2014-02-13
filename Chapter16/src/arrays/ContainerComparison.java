package arrays;

import java.util.*;

class BerylliumSphere{
	private static long counter;
	private final long id=counter++;
	public String toString(){
		return "Sphere "+id;
	}
}
public class ContainerComparison {
	public static void main(String[] args){
		BerylliumSphere[] spheres=new BerylliumSphere[10];
		for(int i=0;i<5;i++){
			spheres[i]=new BerylliumSphere();
		}
		System.out.println(Arrays.toString(spheres));
		System.out.println(spheres[4]);
		List<BerylliumSphere> sphereList=new ArrayList<BerylliumSphere>();
		for(int i=0;i<5;i++){
			sphereList.add(new BerylliumSphere());
		}
		System.out.println(sphereList.toString());
		System.out.println(sphereList.get(4));
		
		int[] intList=new int[10];
		for(int i=0;i<10;i++){
			intList[i]=i;
		}
		System.out.println(Arrays.toString(intList));
		
		List<Integer> integerList=new ArrayList<Integer>(Arrays.asList(0,1,2,3,4));
		integerList.add(12);
		System.out.println(integerList);
	}

}
