class Book{
	boolean checkedOut=false;
	Book(boolean checkOut){
		this.checkedOut=checkOut;
	}
	void CheckIn(){
		this.checkedOut=false;
	}
	protected void finalize(){
		if(this.checkedOut){
			System.out.println("Error:Checked Out");
		}
	}
}
public class TerminationCondition {
	public static void main(String[] args){
		Book novel=new Book(true);
		novel.CheckIn();
		new Book(true);
		System.gc();
	}
}
