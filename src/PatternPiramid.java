import java.util.Scanner;

public class PatternPiramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			int temp =  n-i;
			for(int j=0;j<temp;j++){
				System.out.print(" ");
			}
			for(int k=0;k<i;k++){
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		for(int i=1;i<n;i++){
			int temp =  n-i;
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<temp;k++){
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		
	}

}
