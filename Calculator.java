class Calculator
{
     public static void main(String[] args)
	{
		
		
System.out.println("Addition is:"+ add(10,20));	
System.out.println("Subtraction is:"+sub(10,20));
		System.out.println("Division is:"+div(10,20));
		System.out.println("Multiplication is:"+mul(10,20));
		
		
	}
         static float add(float a,float b)
		{
    			
			return a+b;	
		}
	static float sub(float a,float b)
		{
    			
			return a-b;	
		}
	static float div(float a,float b)
		{
    			
			return a/b;		
		}
	static float mul(float a,float b)
		{
    			
			return a*b;	
		}
}  