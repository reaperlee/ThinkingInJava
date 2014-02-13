package arrays;

import java.util.Arrays;

class DemoObject1{
	private int id;
	private String name;
	DemoObject1(){
		this.name="Null";
		this.id=0;
	}
	DemoObject1(String name,int id){
		this.name=name;
		this.id=id;
	}
	public String toString(){
		return this.name+" "+this.id;
	}
	public boolean equals(DemoObject1 obj){
		return this.name==obj.name&&this.id==obj.id;
	}
}
public class ComparingArrays {
	public static void main(String[] args){
		DemoObject1[] do1={
			new DemoObject1()	
			,new DemoObject1()
			,new DemoObject1()
			,new DemoObject1()
			,new DemoObject1()
		};
		DemoObject1[] do2={
			new DemoObject1()	
			,new DemoObject1()
			,new DemoObject1()
			,new DemoObject1()
			,new DemoObject1()
		};
		System.out.println("do1="+Arrays.toString(do1));
		System.out.println("do2="+Arrays.toString(do2));
		System.out.println("do1==do2? "+Arrays.equals(do1,do2));
		System.out.println("do1[0]==do2[0]"+do1[0].equals(do2[0]));
	}
}
