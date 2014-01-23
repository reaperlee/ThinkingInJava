package foreachstring;

public class ForEachString {
	public static void main(String[] args){
		for(char c:"This is a simple test!".toCharArray()){
			System.out.print(c+" ");
		}
	}
}
