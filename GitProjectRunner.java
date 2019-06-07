public class GitProjectRunner implements PrintQuotient, PerfectSquare{
	public static void main(String[]args){
		PrintQuotient pq = (a, b) -> System.out.printf("%.3f\n", a/b);'
		//lamda notation allows for efficient programming
		//you can get a lot more done in a single file
		//it has a different formating system using the percent sign
		//lambda functions in Java allow you to store methods from in interface to a variable
		//interfaces cannot be instantiated, but this is a work around
		pq.printQuotient(1000f, 50f);

		PerfectSquare ps = n -> Math.sqrt(n) == (int)(Math.sqrt(n)); //same as overriding method

		//if there is only one parameter, you do not need parenthesis
		//if there are zero or two or more parameters, you need parenthesis

		System.out.println(ps.isPerfectSquare(117.3));
		System.out.println(ps.isPerfectSquare(16));

	}

	//github allows for great communication and collaboration between programmers
	//we were able to distribute the work needed for the project and get our individual tasks done, so we could then coombine our own work and complete the project easily
	//our work was well organized and neat because of gitkraken

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