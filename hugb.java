package s4;

public class hugb {

	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		
		
		String s = "1,2,3,4";
		
		
		int t = ADD(s);
		System.out.println(t);
		
		

	}
	
	
	static int ADD(String s)
	{
		if (s.isEmpty())
			return 0;
		
		int total = 0;
		String nums[] = s.split(",");
		for (int i = 0; i < nums.length; i++)
		{
			total += Integer.parseInt(nums[i]);
		}
		return total;

		
	}
	
	
	
}
