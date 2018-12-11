
public class Palindrom {

	public boolean Palindroms(int number) {
		// TODO Auto-generated method stub
		int remainder,sum=0;
		int i = number;
		while(i>0){
			remainder=i%10;
			sum = (sum*10)+remainder;
			i=i/10;
		}
		return sum==number;
	}

}
