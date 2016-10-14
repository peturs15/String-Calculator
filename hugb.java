package s4;

public class hugb {

	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		
		
		String s = "1001,2";
		
		
		int t = ADD(s);
		System.out.println(t);
		
		

	}
	
	
	static int ADD(String s) throws Exception
	{
		if (s.isEmpty())
			return 0;
		
		int total = 0;
		String neg = "";
		String nums[] = s.split("\n");
		for (int i = 0; i < nums.length; i++)
		{
			
			String nums2[] = nums[i].split(",");
			for (int y = 0; y < nums2.length; y++)
			{
				if (Integer.parseInt(nums2[y]) <= 1000)
					total += Integer.parseInt(nums2[y]);
				
				if (Integer.parseInt(nums2[y]) < 0)
				{
					if (neg.isEmpty())
						neg = (nums2[y]);
					else
						neg += "," + nums2[y];
				}
			}
			
		}
		
		if (!neg.isEmpty())
			throw new Exception("Negatives not allowed:" + neg);
		return total;


		
	}
	
	
	
}
