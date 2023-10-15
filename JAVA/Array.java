import java.util.*;
public class Array
{
	public static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		int[] arr=new int[]{1,2,3,4,5,6,7};
		int size=arr.length;
		System.out.print("Array elements before shuffle : ");
		printArray(arr);
		Random random = new Random();
		for(int i=size-1;i>=0;i--)
		{
			int j= random.nextInt(i+1);
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		System.out.print("Array elements after shuffle : ");
		printArray(arr);
	}
}