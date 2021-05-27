import java.util.*;

public class AdditionAndSubtraction{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(z == 0) {
			System.out.println(0);
			return;
		}
		if(x == y){
			if(z == x){
				System.out.println(1);
			}else System.out.println(-1);
			return;
		}
		
		int i = 1;
		int ap, aq, af;
		af = 0;
		while(true){
			ap = af + x;
			if(ap == z){
				System.out.println(2*i - 1);
				break;
			}
			
			aq = ap - y;
			if(aq == z){
				System.out.println(2 * i);
				break;
			}			
			
			if(aq > z && ap > z){
				System.out.println(-1);
				break;
			}
			
			if(ap < 0 && aq < 0){
				System.out.println(-1);
				break;
			}
			
			af = aq;
			
			i++;
		}
		
	}
}