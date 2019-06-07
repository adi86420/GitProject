public class GitProjectRunner implements PrintQuotient, PerfectSquare{
	public static void main(String[]args){
		PrintQuotient pq = (a, b) -> System.out.printf("%.3f\n", a/b);'
		//lamda notation allows for efficient programming
		//you can get a lot more done in a single file
		//it has a different formating system using the percent sign
		pq.printQuotient(1000f, 50f);

		PerfectSquare ps = n -> Math.sqrt(n) == (int)(Math.sqrt(n)); //same as overriding method

		System.out.println(ps.isPerfectSquare(117.3));
		System.out.println(ps.isPerfectSquare(16));

	}

	//github allows for great communication and collaboration between programmers
	//we were able to distribute the work needed for the project and get our individual tasks done, so we could then coombine our own work and complete the project easily
	//our work was well organized and neat because of gitkraken

	public void printQuotient(float a, float b){}
	public boolean isPerfectSquare(double n){return false;}

}