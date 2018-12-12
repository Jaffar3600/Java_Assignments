
public class Factorial {

	public int Factorials(int i) {
		// TODO Auto-generated method stub
		int answer=1;
		for(int count=1;count<=i;count++){
			answer=count*answer;
		}
		return answer;
	}

}
