package week1.day1.homework;

public class ArmstrongNumber {

	public int findLength(int num) {

		int s = num;

		int l = 0;

		while (s > 0)

		{

			s = s / 10;
			l = l + 1;

		}

		return l;

	}
	
	
	
	public boolean armstrongNumber(int num)
	
	{
		
		int s=num;
		
		int r;
		
		int sum=0;
		
		
		while (s>0)
			
		{
			r=s%10;
			
			s=s/10;
			
			sum=(int) (sum+Math.pow(r, findLength(num)));
			
			
		}
		
		
	
		if (sum==num)
			
		{
			
			return true;
			
		}
		
		
		else {
			
			return false;
		}
	}

	public static void main(String[] args) {

		ArmstrongNumber obj = new ArmstrongNumber();
		
		boolean armstrongNumber = obj.armstrongNumber(371);
		
		if (armstrongNumber==true)
		{
			
			System.out.println("its a armstrong number");
		}
		
		else
		{
			System.out.println("its not a armstrong number");
			
		}

	

	}

}
