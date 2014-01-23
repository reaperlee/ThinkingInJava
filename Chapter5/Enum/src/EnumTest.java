enum Spiciness{
	NOT,MILD,MEDIUM,HOT,FLAMING
}
class Burrito{
	Spiciness degree;
	Burrito(Spiciness degree){
		this.degree=degree;
	}
	void describe(){
		System.out.print("This burrito is ");
		switch(degree){
			case NOT:
				System.out.println("not spicy at all");
				break;
			case MILD:
			case MEDIUM:
				System.out.println("a little hot");
				break;
			case HOT:
			case FLAMING:
				System.out.println("maybe too hot");
				break;
			default: break;
		}
	}
}
public class EnumTest {

	public static void main(String[] args){
		/*
		for(Spiciness s:Spiciness.values()){
			System.out.println(s+",ordinal "+s.ordinal());
		}
		*/
		Burrito plain=new Burrito(Spiciness.NOT);
		Burrito greenChile=new Burrito(Spiciness.MEDIUM);
		plain.describe();
		greenChile.describe();
	}

}
