import java.util.*;

public class Increment{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		for(int i = 0; i < number.length(); i++){
			if(number.charAt(i) != '9'){
				System.out.println(number.length());
				return;
			}
		}
		System.out.println(number.length() + 1);
	}
}