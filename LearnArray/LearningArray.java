package LearnArray;

import java.util.Arrays;

public class LearningArray 
{
	public static void main(String[] args) 
	{
		int [] avg = {1, 7, 89, 66,54,2};
		int len = avg.length;
		int sum =0;
		for (int i=0; i < len; i++)
		{
			sum = sum+ avg[i];
		}
		double average = sum/len;
		System.out.println(len);
		System.out.println(sum);
		System.out.println(average);
		System.out.println("***************************");
		
		int [] dup = {22,12,45,67,45,33,2,12,98,5,7,2};
		Arrays.sort(dup);
		for (int j=0; j < dup.length-1; j++)
        {
        	if(dup[j] == dup[j+1])
            {
        		System.out.println(dup[j]);
            }
        }

		
		
	}

}
