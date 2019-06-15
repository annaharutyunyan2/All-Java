public class A {
	static boolean bs(int a[], int k, int start, int end){
		if(start<=end){
			int mid = (start + end)/2;

			if (k == a[mid]) {
				return true;
			}else if (k < a[mid]){
					return bs(a, k, start, mid - 1);
			}else{
					return bs(a, k, mid + 1, end);
			}
		}else{
				return false;
			}
		}
	public static void main(String[] args){
		
			int x[] = {5, 10, 15, 21, 33, 44, 55, 89, 101};
			System.out.println(bs(x,55,0,x.length-1));
		}
	}

// compiler, interpreter (to read)