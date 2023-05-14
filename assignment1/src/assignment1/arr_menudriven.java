package assignment1;
import java.util.Scanner;
public class arr_menudriven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println("1:Read Array 2:Print Array 3:Search element in array 4:Reverse Array 5:Even number from array6:sum of array element\r\n"
				+ "");
		int[]arr;
		System.out.println("How many elements to store?");
		int size= sc.nextInt();
		arr=new int[size];
		System.out.println("array created for operating numbers"+arr.length);
		
		
		
		do
		{
			System.out.println("Enter choice:");
			ch= sc.nextInt();
			switch(ch)
			{
			{case 1: //read
				for(int i=0;i<arr.length;i++)
				{
					arr[i]=sc.nextInt();
				}
				\
			}
		}

	}

}
