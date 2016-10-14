package s4;

public class hugb {

	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		
		
		String s = "1,2";
		
		
		int t = ADD(s);
		System.out.println(t);
		
		

	}
	
	
	static int ADD(String s)
	{
		if (s.isEmpty())
			return 0;
		
		String nums[] = s.split(",");
		
		if (nums.length == 1)
			return Integer.parseInt(s);
		
		return Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
		
	}
	
	
	
}
