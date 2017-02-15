
import java.io.*;
import java.util.*;

public class PatternHashStarAlternative {

	// public <T> void swapp(<T> a,<T> b){
	// <T> temp = a;
	// b = a;
	// a = temp;
	// }
	//

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int i = 1, j = n - 1;
		List<String> res = new ArrayList<String>();
		char a = '*', b = '#';
		for (int ii = 0; ii < (n + 1) / 2; ii++) {

			String temp2 = "";

			if (ii % 2 == 0) {
				for (int k = 0; k < i; k++)
					temp2 += a;

				for (int k = 0; k < j; k++)
					temp2 += b;
			} else {

				for (int k = 0; k < j; k++)
					temp2 += a;

				for (int k = 0; k < i; k++)
					temp2 += b;

			}
			res.add(temp2);
			i++;
			j--;
			char temp = a;
			a = b;
			b = temp;

		}
		i--;
		j++;
		for (int ii = (n + 1) / 2; ii < n; ii++) {

			String temp2 = "";

			if (ii % 2 == 0) {
				for (int k = 0; k < j; k++)
					temp2 += a;

				for (int k = 0; k < i; k++)
					temp2 += b;

			} else {

				for (int k = 0; k < i; k++)
					temp2 += a;
				for (int k = 0; k < j; k++)
					temp2 += b;

			}

			res.add(temp2);

			i++;
			j--;
			char temp = a;
			a = b;
			b = temp;

		}

		for (String each : res) {
			System.out.println(each);
		}

	}
}