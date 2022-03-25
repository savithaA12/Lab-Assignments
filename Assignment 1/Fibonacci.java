public class Fibonacci {
	static int dp[];
	static int fibonacci(int n) {
		for(int i = 0; i<n+1; i++) {
			if(i<=1)// base case
				dp[i] = i;
			else {
				dp[i] = dp[i-1] + dp[i-2];
			}
		}
		return dp[n];
	}
	static void printTable(int table[]) {
		for(int i=0; i<table.length; i++) {
			System.out.print(table[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int n = 20;
		dp = new int[n+1];
		
		System.out.println(n+"th term: "+fibonacci(n));
		System.out.println("series:");
		printTable(dp);        // Drop last digit and repeat the loop
		}
	
	}

