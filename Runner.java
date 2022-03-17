import java.lang.Math;
// 1. I learned how to use lambda expressions to implement interfaces
// 2. I learned how to use GitKraken
interface BooleanPart
{
	public boolean BooleanPart(int n);
}

public class Runner{
	public static void main(String[]args){

		//I learned that Math.sqrt can easily find whether a number is a perfect square.
		//I learned how to collaborate with others!
		BooleanPart booleanLambdas = (int n) -> { return (Math.sqrt(n) % 1 == 0); };
		System.out.println(booleanLambdas.BooleanPart(26));
		QuotientPrint test = new QuotientPrint();
		Print_Quotient asdf = (float a, float b) -> System.out.printf("%s\n", Math.round(1000*a/b)/1000f);

		asdf.printQuotient(29027.61f, 69);
	}
}

public interface Print_Quotient
{
	// hello
	public void printQuotient(float a, float b);
}