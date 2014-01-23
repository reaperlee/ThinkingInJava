package access;

import access.dessert.*;
public class ChocolateChip extends Cookie{
	public ChocolateChip(){
		System.out.println("ChocolateChip Constructor");
	}
	private void bite1(){
		
	}
	public void bite(){
		System.out.println("Bite ChocolateChip");
	}
	public void chomp(){
		/*
		super.bite();
		this.bite();
		*/
		bite();
	}
	public static void main(String[] args){
		ChocolateChip x=new ChocolateChip();
		x.chomp();
	}
}
