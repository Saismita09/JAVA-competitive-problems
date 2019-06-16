import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);

		long n = scn.nextLong();

		long[] arr = new long[19];
		int i = 0;

		
		while (n != 0) {

			long rem = n % 10;
			arr[i] = rem;
			i++;
			n = n / 10;

		}

		
		for (int j = 0; j < i; j++) {

			if (j == i - 1 && arr[j] == 9) {
			
			}
			else if (arr[j] >= 5) {
				arr[j] = 9 - arr[j];
			}

		}

	
		for (int k = i - 1; k >= 0; k--) {
			System.out.print(arr[k]);
		}
		System.out.println();

    }
}

////////////////////////////              OR        //////////////////////////////////
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
         Scanner scn = new Scanner(System.in);

			long n = scn.nextLong();

			
			int mul=0;
			long ans=0;
			while (n != 0) {

				long rem = n % 10;
				if(n/10==0&&rem==9)
				{
					ans+=rem*(long)Math.pow(10, mul);
				}
				else if(rem>=5)
					{
						rem=9-rem;
						ans+=rem*(long)Math.pow(10, mul);	
					}
				else
				{
					ans+=rem*(long)Math.pow(10, mul);
				}
				
				n = n / 10;

				mul++;
			}

			
		

		
			
			System.out.println(ans);

    }
}

