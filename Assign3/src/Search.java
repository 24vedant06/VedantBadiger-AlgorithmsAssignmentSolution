
public class Search {
	public int search(float[] arr,float search,int n) {
		
		int found=-1;
	

		for(int i=0;i<n;i++) {
			if(arr[i]==search) {
				found=i;
			}
		}
			if(found==-1) {
				System.out.println("element not found");
			}
			else {
				System.out.println("element found at position : ");
			}
			return (found+1);
		}
}
	

