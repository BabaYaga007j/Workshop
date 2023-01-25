package Workshop1;

import java.util.Scanner;


public class EvenOdd {
	
	
	public void checkEvenOrOdd(int num)
	{
		int even=0;
		int odd=0;
		while(num!=0)
		{
			int rem=num%10;
			
			if(rem%2==1)
			{
				odd++;
				
			}
			else
			{
				even++;

			}
			num=num/10;	
		}
		System.err.println("Number of Evens :: "+even);
		System.err.println("Number of Odds :: "+odd);
		
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.err.println("Enter a number  :: ");
		int num =scanner.nextInt();
		EvenOdd even=new EvenOdd();
		even.checkEvenOrOdd(num);
		
	
		
		
	}
	

}
