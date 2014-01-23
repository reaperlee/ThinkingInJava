package castingnumbers;

public class CastingNumbers {
	public static void main(String[] args){
		double above=0.7,below=0.4;
		float fabove=0.7f,fbelow=0.4f;
		int iabove=(int)above;//必须有强制类型转换
		System.out.println("(int)above="+iabove);
		System.out.println("(int)below="+(int)below);
		System.out.println("(int)fabove="+(int)fabove);
		System.out.println("(int)fbelow="+(int)fbelow);
		System.out.println("above.round()="+Math.round(above));
		System.out.println("below.round()="+Math.round(below));
		System.out.println("fabove.round()="+Math.round(fabove));
		System.out.println("fbelow.round()="+Math.round(fbelow));
	}
}
