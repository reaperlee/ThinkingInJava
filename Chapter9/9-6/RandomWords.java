import java.nio.*;
import java.util.*;
import lixing.random.*;
class RandomAdapter extends RandomDoubles implements Readable{
	private int count;
	public int read(CharBuffer cb){
		if(count--==0){
			return -1;
		}
		String result=Double.toString(super.next())+" ";
		cb.append(result);
		return result.length(); 
	}
	public RandomAdapter(int count){
		this.count=count;
	}
}
public class RandomWords implements Readable{
	private static Random rand=new Random(47);
	private static final char[] captials="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static final char[] lowers="abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static final char[] vowels="aeiou".toCharArray();
	private int count;
	public RandomWords(int count){
		this.count=count;
	}
	public int read(CharBuffer cb){
		if(this.count--==0){
			return -1;
		}
		cb.append(captials[rand.nextInt(captials.length)]);
		for(int i=0;i<4;i++){
			cb.append(vowels[rand.nextInt(RandomWords.vowels.length)]);
			cb.append(lowers[rand.nextInt(RandomWords.lowers.length)]);
		}
		cb.append(" ");
		return 10;
	}
	public static void main(String[] args){
		Scanner s=new Scanner(new RandomWords(10));
		while(s.hasNext()){
			System.out.println(s.next());
		}
		Scanner s1=new Scanner(new  RandomAdapter(2)  );
		while(s1.hasNext()){
			System.out.println(s1.next());
		}
	}
}
