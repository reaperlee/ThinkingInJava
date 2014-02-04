package strings;
import java.io.*;
import java.util.*;

public class UseOfFormat {
	private Formatter f;
	private String name;
	UseOfFormat(String name,Formatter f){
		this.name=name;
		this.f=f;
	}
	public void move(int x,int y){
		f.format("%s MOVES TO [%d,%d]\n",this.name,x,y);
	}
	public static void  main(String[] args){
		UseOfFormat usf1=new UseOfFormat("Tom",new Formatter(System.out));
		UseOfFormat usf2=new UseOfFormat("Jerry",new Formatter(System.err));
		usf1.move(1,2);
		usf2.move(1,2);
		usf1.move(3,4);
		usf2.move(3,4);
	}
}
