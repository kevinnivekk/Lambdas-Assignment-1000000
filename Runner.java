import java.lang.Math;

interface BooleanPart
{
	public boolean BooleanPart(int n);
}

public class Runner{
	public static void main(String[]args){
		BooleanPart booleanLambdas = (int n) -> { return (Math.sqrt(n) % 1 == 0); };
		System.out.println(booleanLambdas.BooleanPart(26));
	}
}