public class GitProjectRunner implements PerfectSquare{
public static void main(String[] args){
PerfectSquare ps = n -> Math.sqrt(n) == (int)(Math.sqrt(n)); //same as overriding method

System.out.println(ps.isPerfectSquare(117.3));
System.out.println(ps.isPerfectSquare(16));
}

public boolean isPerfectSquare(double n){return false;}

}
