package s4;

public class hugb {

	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		
		
		String s = "1\n2,3";
		
		
		int t = ADD(s);
		System.out.println(t);
		
		

	}
	
	
	static int ADD(String s)
	{
		if (s.isEmpty())
			return 0;
		
		int total = 0;
		String nums[] = s.split("\n");
		for (int i = 0; i < nums.length; i++)
		{
			
			String nums2[] = nums[i].split(",");
			for (int y = 0; y < nums2.length; y++)
			{
				total += Integer.parseInt(nums2[y]);
			}
			
		}
		
		return total;

		
	}
	
	
	
}
