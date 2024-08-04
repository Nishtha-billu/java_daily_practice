package corejavaday3;

public class SwapingOf2numbers {

	public static void main(String[] args) 
	
	{
	//Swapping of numbers
		
		int a=20, b=40;
		System.out.println("Before swapping a and b values are:" +a+" "+b);
	
	
		a=b+a; // a=40+20=60
	    b=a-b; //b=60-40=20
	    a=a-b; //a= 60-20= 40
	    System.out.println("After swapping a and b values are:" +a+" "+b);
	
	
	}

}
