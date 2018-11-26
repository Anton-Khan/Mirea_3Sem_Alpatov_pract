import java.util.Scanner;

public class Rec {

	public static void main(String[] args) {
		
		System.out.println("Enter your number:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		prinT(n);
		scan.close();
		
		
	}
	
	
	static int prinT(int n) {
		if(n >= 0)
		{
		System.out.print(0 + " ");
		return prinT(n, 0);
		}
		return 0;
	}
	
	static int prinT(int n, int num) {
		if(num < n)
		{
		num++;
		System.out.print(num + " ");
		return prinT(n, num);
		}
		return 0;
	}
	
	
}
