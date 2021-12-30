import java.util.*;

public class Operations {
	public void operation(float[] arr, int n,boolean[] priceRose) {
		
		int choice,a=0,position=0;    
		int trueCount=0,falseCount=0;
		float search;
		Scanner scn = new Scanner(System.in);
		
		while(a==0) {
			System.out.println("1. Display the companies stock prices in ascending order\r\n"
					+ "2. Display the companies stock prices in descending order\r\n"
					+ "3. Display the total no of companies for which stock prices rose today\r\n"
					+ "4. Display the total no of companies for which stock prices declined today\r\n"
					+ "5. Search a specific stock price\r\n"
					+ "6. press 0 to exit");
					choice = scn.nextInt();
					switch(choice) {
					case 1: System.out.println("Stock prices in ascending order are");
							Arrays.sort(arr);
								for(int i=0;i<n;i++) {
								System.out.println(arr[i]);
							}
								break;
					case 2: System.out.println("Displaying the companies stock prices in descending order");
					        Arrays.sort(arr);
							for(int i=n-1;i>=0;i--) {
							System.out.println(arr[i]);
							}
							break;
					case 3: System.out.print("Displaying the total no of companies for which stock prices rose today : ");
							for(int i=0;i<n;i++) {
								if(priceRose[i]==true) {
									trueCount++;
								}
							}
							System.out.println(trueCount);
							break;
					case 4: System.out.print("Displaying the total no of companies for which stock prices declined today : ");
							for(int i=0;i<n;i++) {
								if(priceRose[i]==false) {
									falseCount++;
								}
							}
							System.out.println(falseCount);
							break;
					case 5: Search ele = new Search();
							System.out.println("Search a specific stock price");
							System.out.print("enter the price you want to search : ");
							search = scn.nextFloat();
							position = ele.search(arr, search, n);	
							System.out.println(position);
							break;
					case 6: a=1;
							System.out.println("Terminated....");
							break;
					
					}			
		
  }
}
}