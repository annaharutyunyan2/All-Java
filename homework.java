import java.util.Scanner;
public class homework{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		spiral(input, 0);
	}
	public static void spiral(int a, int b){
		if (a == 0){
			return;
		}
		for(int i = 0; i < b; i++){
			System.out.print(" ");
		}
		for(int i = 0; i < a; i++){
			System.out.print("- ");
		}
		System.out.println();
		spiral(a - 1, b + 1);
	}
}