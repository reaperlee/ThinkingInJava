
public class DotThis {
	private int index=0;
	public DotThis(int i){
		this.index=i;
	}
	public void f(){
		System.out.println("DotThis.f() with index "+index);
	}
	public class Inner{
		public DotThis outer(){
			return DotThis.this;
		}
	}
	public Inner inner(){
		return new Inner();
	}
	public static void main(String[] args){
		DotThis dt=new DotThis(2);
		DotThis.Inner dti=dt.inner();
		dti.outer().f();
		DotThis.Inner aInner=dt.new Inner();
		aInner.outer().f();
	}
}
