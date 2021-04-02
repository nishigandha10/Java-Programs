package practice;

import java.util.Scanner;

public class FactorialOfNumUsingRecursion {
	
	
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
	int x=sc.nextInt();
	
   
  
           
	       System.out.println("FActorial of number is"+factorial(x));
              
   sc.close();
	          }
	
	public static int factorial(int num)
	{
		if(num == 0){
            return 1;
        }
		 return num*factorial(num -1);
	}
}
