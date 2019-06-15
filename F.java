import java.util.Scanner;
public class F{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n);
		}
	public static void print(int n){
		if(n == 1 || n == 2){
			System.out.print(n);
		}else{
			System.out.print(n + " ");
			print(n - 2);
		}
	}
	}