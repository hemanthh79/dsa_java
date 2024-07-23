package dsa_java;
import java.util.Arrays;

public class bubbleSort
{
	public static void main(String[] args) 
	{
		int temp;
		int arr[] = {3,5,12,1,2,4,9,3};
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(arr[j]<arr[j-1])
				{
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		//Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
	}
}

