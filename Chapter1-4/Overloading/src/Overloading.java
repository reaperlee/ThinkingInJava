class Tree{
	int height;
	Tree(){
		this.height=0;
		System.out.println("Planting a seedling");
	}
	Tree(int initialHeight){
		this.height=initialHeight;
		System.out.println("Creating a new tree with"+this.height+"feet tall");
	}
	void info(){
		System.out.println("Tree is  "+this.height+"feet tall");
	}
	void info(String s){
		System.out.println(s+":Tree is "+this.height+"feet tall");
	}
}

public class Overloading {
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			Tree t=new Tree(i);
			t.info();
			t.info("Overloading method");
		}
		new Tree();
	}
}
