package mahiapp;

class Y extends X1{
	
	Y(){
		System.out.println("no Args Constructor of Y");
		}
	Y(int b){ 
		super(1000);
		System.out.println("Constructor of Y" + b);
		}
}