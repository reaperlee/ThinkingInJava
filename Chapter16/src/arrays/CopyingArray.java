package arrays;

import java.util.Arrays;

class DemoObject{
	private static int counter=0;
	private int id=counter++;
	private String name;
	public DemoObject(){
		this.name="NULL";
	}
	public DemoObject(String name){
		this.name=name;
	}
	public String toString(){
		return this.name+" "+this.id;
	}
	public void setName(String name){
		this.name=name;
	}
}

public class CopyingArray {
	public static void main(String[] args){
		int[] i=new int[7];
		int[] j=new int[10];
		Arrays.fill(i,47);
		Arrays.fill(j,99);
		System.out.println("i="+Arrays.toString(i));
		System.out.println("j="+Arrays.toString(j));
		System.arraycopy(i,0,j,0,i.length);
		System.out.println("After Copying j="+Arrays.toString(j));
		
		
		DemoObject[] dc=new DemoObject[5];
		DemoObject[] dc1=new DemoObject[5];
		dc1[0]=new DemoObject();
		dc1[1]=new DemoObject();
		Arrays.fill(dc,new DemoObject());
		System.out.println(Arrays.toString(dc));
		System.out.println("dc1="+Arrays.toString(dc1));
		System.arraycopy(dc1,0,dc,0,2);
		System.out.println("dc="+Arrays.toString(dc));
		dc[0].setName("ABC");
		System.out.println("dc="+Arrays.toString(dc));
		System.out.println("dc1="+Arrays.toString(dc1));
	}
}
