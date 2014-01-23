class SpaceShipControls{
	void up(int velocity){
		System.out.println("up "+velocity);
	}
	void down(int velocity){
		System.out.println("down "+velocity);
	}
	void left(int velocity){
		System.out.println("left "+velocity);
	}
	void right(int velocity){
		System.out.println("right "+velocity);
	}
	void forward(int velocity){
		System.out.println("forward "+velocity);
	}
	void back(int velocity){
		System.out.println("back "+velocity);
	}
}
public class SpaceShip {
	private String name;
	private SpaceShipControls controls=new SpaceShipControls();
	public SpaceShip(String name){
		this.name=name;
	}
	public void back(int velocity){
		this.controls.back(velocity);
	}
	public void down(int velocity){
		this.controls.down(velocity);
	}
	public void forward(int velocity){
		this.controls.forward(velocity);
	}
	public void left(int velocity){
		this.controls.left(velocity);
	}
	public void right(int velocity){
		this.controls.right(velocity);
	}
	public void up(int velocity){
		this.controls.up(velocity);
	}
	public static void main(String[] args){
		SpaceShip protector=new SpaceShip("NSEA Protector");
		protector.forward(100);
	}
}
