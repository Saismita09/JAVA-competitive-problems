import java.util.*;
public class Main {
    public static void main(String args[]) {
       Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		while (n != 0) {
			int n1 = s.nextInt();
			int[] arr = new int[n1];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = s.nextInt();
			}
			int cz = 0, co = 0;
			int ini = 0, fin = 0, max = 0, temp = 0;
			for (int i = 0; i < arr.length; i++) {
			
				cz=0;co=0;
				for (int j = i; j < arr.length; j++) {
					if (arr[j] == 0) {
						cz++;
					}
					if (arr[j] == 1) {
						co++;
					}
					if (cz == co) {
						temp = j - i + 1;
						if (temp > max || (cz==0 && co==0)) {
							ini = i;
							fin = j;
							max = j - i + 1;
						}
					}
				}
			}
			if (ini == 0 && fin == 0) {
				System.out.println("none");
			} else
				System.out.println(ini + " " + fin);
			n--;
		}

    }
}
