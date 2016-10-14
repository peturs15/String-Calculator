package s4;

public class hugb {

	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		
		
		String s = "//;\n1;2";
		
		
		int t = ADD(s);
		System.out.println(t);
		
		

	}
	
	
	static int ADD(String s) throws Exception
	{
		if (s.isEmpty())
			return 0;
		
		s = s.substring(2);
		
		int total = 0;
		String neg = "";
		String nums[] = s.split("\n");
		int i = nums[0].isEmpty()? 1 : 0;
		char delimeter = ',';
		
		if (i == 0)
		{
			delimeter = s.charAt(0);
			i = 1;
		}
		
		for (; i < nums.length; i++)
		{
			String nums2[] = nums[i].split(Character.toString(delimeter));
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
