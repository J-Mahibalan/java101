package mahiapp;

public class Z extends Y{
	
	Z(){
		System.out.println("no Args Constructor of Z");
		}
	Z(int c){ 
		super(100);
		System.out.println("Constructor of Z" + c);
		}
}