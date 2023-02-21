package WorkShop3;

import java.util.Scanner;

/*
 * Write a program Array Write a method which takes array as argument
                         & filter out negative numbers & postive 
                         numbers & store in two different arrays.[-1,20,-3,30,40,-19]
                         [-1,-3,-19] [20,30,40] store +ve value in +ve array and -ve value in -ve array.
 */


public class PositiveAndNegative {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array :: ");
		int size = input.nextInt();//get the size of array
		
		
		int [] positiveArray= new int [size];
		int [] negativeArray=new int [size];
		
		int positiveIndex=0;
		int negativeIndex=0;
		for(int i =0;i<size;i++)//getting the n times of input from user
		{
			System.out.println("Enter Number :: ");
			int number = input.nextInt();
			if(number>0)//for check if positive
			{
				positiveArray[positiveIndex]=number;
				positiveIndex++;
			}
			else if (number <0)//for check if negative
			{
				negativeArray[negativeIndex]=number;
				negativeIndex++;
			}
		}
		System.out.println("Positive array :: ");
		
		for(int i =0;i<positiveIndex;i++)//for displaying positive array elements
		{
			System.out.print(positiveArray[i]+" ");
		}
		System.out.println();
		System.out.println("Negative Array :: ");
		for(int i=0;i<negativeIndex;i++)//for displaying negative array elements
		{
			System.out.print(negativeArray[i]+" ");
		}
		
	}

}
