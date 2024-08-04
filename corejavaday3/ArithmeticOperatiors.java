package corejavaday3;

public class ArithmeticOperatiors {

	public static void main(String[] args) 
	
	
	{ 
		int a=300, b=200;
		int  result =a+b;
		
		System.out.println("sum of a & b is:"+result);
				
		System.out.println(a+b);
		
			System.out.println("sum of a & b is:"+(a+b));
			System.out.println("diffrence of a & b is:"+(a-b));
			System.out.println("Multiplication of a & b is:"+(a*b));
	        System.out.println("division of a & b is:"+(a/b));
	        System.out.println("Modulo division of a & b is:"+(a%b));
	
	
	//2 Relational/Comparison operator > >= < <= !=  ==   can use for any data type
	// Returns boolean value in True/False
		System.out.println(a>b); //True
		System.out.println(a<b); //False
		System.out.println(a>=b);//True
		System.out.println(a<=b); //False
	
	a=300;
	
	System.out.println(a!=b);//false
	System.out.println(a==b );//true
	
	boolean res=a>b;
	System.out.println(res);
	
	//logical operator && || !
	//returns boolean value and works between two boolean value
	
	
	boolean x = true;
	boolean y = false;
	 
	 
	System.out.println(x && y); //false
	System.out.println(x || y); //true
	System.out.println(!x); //false
	System.out.println(!y); //true
	
	boolean b1 =a>b; //true
	boolean b2 = a<b; // false 
	System.out.println(b1 && b2); // false
	System.out.println(b1 || b2); // true
	System.out.println((100<200) && (200>100)); //true
	
	
	
	
	
	
	}

}
