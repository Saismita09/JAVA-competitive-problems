import java.util.*;
public class Main {
    public static void main(String args[]) {
        	Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		for(int i=0;i<=num;i++)
		{
			int k=i;
			while(k>0)
			{
				System.out.print("  ");
				k--;
			}
			int l=num-i;
			while(l>=0)
			{
				System.out.print(l+" ");
				l--;
			}
			l+=2;
			while(l<=(num-i))
			{
				System.out.print(l+" ");
				l++;
			}
			System.out.println("");
		}

		for(int i=num-1;i>=0;i--)
		{
			int k=i;
			while(k>0)
			{
				System.out.print("  ");
				k--;
			}
			int l=num-i;
			while(l>=0)
			{
				System.out.print(l+" ");
				l--;
			}
			l+=2;
			while(l<=(num-i))
			{
				System.out.print(l+" ");
				l++;
			}
			System.out.println("");
		}

    }
}
