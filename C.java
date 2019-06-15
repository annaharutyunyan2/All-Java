import java.util.Scanner;
public class C {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		//int n = scanner.nextInt();
		int a[] = {5, 4, 2, 1, 10, 25, 0, 7, 3, 2};
		boolean payman = true;
		while(payman){
			payman = false;
			for(int i = 0; i <a.length-1; i++){
				if(a[i] > a[i+1]){
					int temp = a[i+1];
					a[i+1] = a[i];
					a[i] = temp;
					payman = true;
				}

			}
		}

		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}
}