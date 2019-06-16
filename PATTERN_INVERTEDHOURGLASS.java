import java.util.*;
public class Main {
    public static void main(String args[]) {
        	Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		
		for(int i=0;i<n1;i++)
		{
			int k=n1-i;
			int l=i+1;
			int j=n1;
			while(l!=0)
			{
			System.out.print(j+" ");
			l--;
			j--;
		    }
			int h=2*k-1;
			while((h)!=0)
			{
				System.out.print("  ");
				h--;
			}
		    l=i+1;
		    j=n1-i;
		    while(l!=0)
		    {
		    	System.out.print(j+" ");
		    	l--;
		    	j++;
		    }
		    System.out.println();
		}
		///////////////////////////////
		for(int i=n1;i>=0;i--)
		{
			System.out.print(i+" ");
		}
		for(int i=1;i<=n1;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
        ////////////////////////////////////////
		for(int i=n1-1;i>=0;i--)
		{
			int k=n1-i;
			int l=i+1;
			int j=n1;
			while(l!=0)
			{
			System.out.print(j+" ");
			l--;
			j--;
		    }
			int h=2*k-1;
			while((h)!=0)
			{
				System.out.print("  ");
				h--;
			}
		    l=i+1;
		    j=n1-i;
		    while(l!=0)
		    {
		    	System.out.print(j+" ");
		    	l--;
		    	j++;
		    }
		    System.out.println();
		}

    }
}
