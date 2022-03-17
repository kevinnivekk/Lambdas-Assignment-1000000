public class Runner{
	public static void main(String[]args){
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