public class GitProjectRunner implements PrintQuotient, PerfectSquare{
	public static void main(String[]args){
		//lambda functions in Java allow you to store methods from in interface to a variable
		//interfaces cannot be instantiated, but this is a work around
		PrintQuotient pq = (a, b) -> System.out.printf("%.3f\n", a/b); //allows you to control the decimals shown
		pq.printQuotient(1000f, 50f);
		PerfectSquare ps = n -> Math.sqrt(n) == (int)(Math.sqrt(n)); //similar to overriding method

		//if there is only one parameter, you do not need parenthesis
		//if there are zero or two or more parameters, you need parenthesis

		System.out.println(ps.isPerfectSquare(117.3));
		System.out.println(ps.isPerfectSquare(16));
	}
	//still need to override method normally
	public void printQuotient(float a, float b){}
	public boolean isPerfectSquare(double n){return false;}

	//git kraken is a UI that basically uses the same command as using git through a terminal
	//adding to a staging area is like 'git add', committing is like 'git commit'
	//git kraken and collaboration helped me understand how pulling and pushing works
	//I have only used git to store my projects because I was the only collaborator
	//git is very useful when there are multiple collaborators
	//i understood how the local repo and the master branch should match before doing other work, or else there could be complications

}