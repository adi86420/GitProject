public class PrintQuotientRunner implements PrintQuotient{
	public static void main(String[]args){
		PrintQuotient pq = (a, b) -> System.out.printf("%.3f\n", a/b);
		pq.printQuotient(1000f, 50f);

	}
	public void printQuotient(float a, float b){}
}