import java.util.*;

public class EvaluatingExpression{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String exp = sc.next();
		String[] digits = exp.split("\\+|\\-");
		int[] numbers = new int[digits.length];
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = Integer.parseInt(digits[i]);
		int x = 1;
		long sum = numbers[0];
		for(int i = 0; i < exp.length(); i++){
			if(exp.charAt(i) == '+'){
				sum += numbers[x++];
			}else if(exp.charAt(i) == '-')
				sum -= numbers[x++];
		}
		System.out.println(sum);
	}
}