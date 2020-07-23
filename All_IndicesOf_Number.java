package Recursion;

import java.util.Scanner;

public class All_IndicesOf_Number {

static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	private static int[] allIndexes(int input[], int x,int startIndex)
	{
		if(startIndex == input.length)
			return new int[0];
		
		int [] smallAns = allIndexes(input,x, startIndex + 1);
		
		if(input[startIndex] == x)
		{
			int arr[] = new int[smallAns.length + 1];
			arr[0] = startIndex;
			
			for(int i = 0; i < smallAns.length; i++)
			{
				arr[i+1] = smallAns[i];
			}
			return arr;
		}
		else
		{
			return smallAns;
		}
		
	}
	public static int[] allIndexes(int input[], int x)
	{
		return allIndexes(input,x,0);
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		int output[] = allIndexes(input, x);
		for(int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}
}
