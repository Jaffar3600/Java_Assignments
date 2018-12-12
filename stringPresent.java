
public class stringPresent {
	int occurence=0;
	public boolean SearchName(String[] Names,String string) {
		// TODO Auto-generated method stub
		boolean result=false;
		
		//System.out.println(Names [0]);
		for(int count = 0; count < Names.length; count++)
		if(Names[count].equals(string)){
			occurence++;
		result = true;
	}
		return result;

}

	public int OccurenceName() {
		// TODO Auto-generated method stub
		
		return occurence;
	}
}
