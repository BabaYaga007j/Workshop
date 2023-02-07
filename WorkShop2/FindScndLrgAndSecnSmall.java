package WorkShop2;

import java.util.Scanner;


/*
 * Find the Second Largest &  Second Smallest Elements in an Array..
 */

public class FindScndLrgAndSecnSmall {
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter How Many Elements You Want To Enter :: ");
		int numOfElements = scanner.nextInt();
		
		int[] array= new int[numOfElements];
		for (int i =0; i<array.length;i++)
		{
			System.out.println("Enter  "+(i+1)+ " Element :: ");
			array[i]= scanner.nextInt();
		}
		
		System.out.println(" Entered Elements Are :: ");
		for(int i =0; i<array.length;i++)
		{
			System.out.print(array[i]+ " ");
		}
		
		int min=0;
		for(int i =0; i<array.length;i++)
		{
			for(int j =(i+1); j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					min = array[i];
					array[i]=array[j];
					array[j]=min;
				}
			}
		}
		System.out.println();
		System.out.println("Sorted array :: ");
		for(int i =0; i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("Seccond Smalest :: ");
		System.out.println(array[1]);
		System.out.println("Seccond largest :: ");
		System.out.println(array[array.length-2]);
	}

}
