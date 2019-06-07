public class GitProjectRunner implements PrintQuotient, PerfectSquare{
	public static void main(String[]args){
		PrintQuotient pq = (a, b) -> System.out.printf("%.3f\n", a/b);
		pq.printQuotient(1000f, 50f);
		PerfectSquare ps = n -> Math.sqrt(n) == (int)(Math.sqrt(n)); //same as overriding method

		System.out.println(ps.isPerfectSquare(117.3));
		System.out.println(ps.isPerfectSquare(16));
	}

	public void printQuotient(float a, float b){}
	public boolean isPerfectSquare(double n){return false;}

}