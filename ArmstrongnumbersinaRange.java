import java.util.Scanner;
class ArmstrongnumbersinaRange 
{
	public static void main(String[] args) 
	{
		Scanner k=new Scanner(System.in);
		System.out.println("Enter lower range:");
		int lr=k.nextInt();
		System.out.println("Enter upper range:");
		int ur=k.nextInt();
		for(int i=lr;i<ur;i++)
		{
			int check,rem,sum=0,count=0;
			check=i;
			
			while(check!=0)
			{
				rem=check%10;
			   sum=sum+(rem*rem*rem);
			   check=check/10;
			}
			if(sum==i)
			{
				System.out.println(""+i+"is an Armstrong Number");
			}
		}
	}
}
