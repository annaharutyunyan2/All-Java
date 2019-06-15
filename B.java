public class B {
	public static void main(String[] args){
		int a[] = {12, 3, 6, 7, 90, 0, 22, 1, 7};
		for(int i = 0; i<a.length-1; i++){
			if(a[i]> a[i+1]){
				int temp = a[i+1];
				a[i+1] = a[i];
				a[i] = temp;
				i = -1;
			}
		}

		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}

	}
}