
public class MissingNum {

	public int Missing(int i, int j, int k) {
		// TODO Auto-generated method stub
		int arr[]={i,j,k};
		int Current_Total = 0;
		for(int n = 0;n < arr.length ; n++){
			Current_Total = Current_Total+arr[n];
		}
		int Expected_Total= (arr.length*(arr.length+1))/2;
		int result = Expected_Total - Current_Total;
		
		return result;
	}

	public int MissingNumb(int i, int j, int k, int l, int m, int n, int o,
			int p, int q) {
		// TODO Auto-generated method stub
		int arr[]={i,j,k,l,m,n,o,p,q};
		int Current_Total = 0;
		for(int n1 = 0;n1 < arr.length ; n1++){
			Current_Total = Current_Total+arr[n1];
		}
		int Expected_Total= (arr.length*(arr.length+1))/2;
		int result = Expected_Total - Current_Total;
		
		return result;
			}
}
