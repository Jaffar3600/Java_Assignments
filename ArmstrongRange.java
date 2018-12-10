
public class ArmstrongRange {
	public static void main(String[] args){
		System.out.println("Armstrong numbers between 100-999 are...");
		int s1,len=0;
		for(int i=100;i<=999;i++)
		{
			s1=i;
			while(s1!=0)
				{
				len=len+1;
				s1=s1/10;
				
				}
			int s2=i,rem,mul=1,sum=0;
			while(s2!=0)
				{
				rem=s2%10;
				for(int j=1;j<=len;j++){
					mul=mul*rem;
				}
				sum=sum+mul;
				s2=s2/10;
				mul=1;
				}
			if(sum==i)
				{
				System.out.println(i);
				}
			len=0;
			sum=0;
			//System.out.println("1234");
		}
	}
}
