package handlingArrays;

public class TwosumProb {

	public static void main(String[] args) {
	
		int nums[]= {2, 11, 15, 7, 3 };
		int target=5;
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 1; j < nums.length; j++)
			{
				if (nums[i] + nums[j] == target&&(i!=j)) 
				{
					System.out.println("[" + i + "," + j + "]");
					System.out.println(" num1:"+ nums[i]);
					System.out.println(" num2:"+ nums[j]);
				}
			}
	
}
}}