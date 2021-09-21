package PowerOfNumber;

import java.util.Scanner;

public class MyCalculator {
	public long power(int n, int p) throws NorPmayBeNegative {
		if(n<=0 || p<=0) {
			if(n==0 || p==0) {
				throw new NorPmayBeNegative("n or p should not be Zero");
			}
			else {
				throw new NorPmayBeNegative("n or p should not be negative");
			}
		}
		
		return (long) Math.pow(n, p);
		
	}
	
	public static void main(String args[]) {
		MyCalculator mc = new MyCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of number:");
		int n= sc.nextInt();
		System.out.println("Enter Value of pow which you want:");
		int p = sc.nextInt();
		try {
			
			System.out.println(n+"^"+p+" = "+mc.power(n,p));
		} catch (NorPmayBeNegative e) {
			e.printStackTrace();
		}
		
	}

}
