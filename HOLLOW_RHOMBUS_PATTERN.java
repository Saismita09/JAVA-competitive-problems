import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
		int n  = s.nextInt();
		for(int i=1;i<=n;i++)
		{
			int k=n-i;
			while(k!=0)
			{
				System.out.print(" ");
				k--;
			}
			if(i==1 || i==n)
			{
				int j=n;
				while(j!=0)
				{
					System.out.print("*");
					j--;
				}
			}
			else
			{
				int j=n-2;
				System.out.print("*");
				while(j!=0)
				{
					System.out.print(" ");
					j--;
				}
				System.out.print("*");
				
			}
		System.out.println();
		}


    }
}
