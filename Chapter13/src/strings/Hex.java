package strings;
import java.io.*;
import java.util.*;
public class Hex {
	public static String format(byte[] data){
		StringBuilder result=new StringBuilder();
		int n=0;
		for(byte b:data){
			if(n%16==0){
				result.append(String.format("%05x: ",n));
			}
			result.append(String.format("%02x ",b));
			n++;
			if(n%16==0){
				result.append("\n");
			}
		}
		result.append("\n");
		return result.toString();
	}
	public static void main(String[] args){
		byte[] bytes=new byte[100];
		for(int i=0;i<100;i++){
			bytes[i]=(byte)i;
		}
		System.out.println(format(bytes));
	}
}
