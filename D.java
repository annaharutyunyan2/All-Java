public class D{
	public static void main(String[] args){
		int arr1[] = {2, 3, 1, 4, 0, 28, 36, 24, 13};
		int counter1=0,counter2 = 0;
		for(int i = 0; i < arr1.length - 1; i++){
			counter1++;
			if (arr1[i] > arr1[i+1]){
				int temp1 = arr1[i+1];
				arr1[i+1] = arr1[i];
				arr1[i] = temp1;
				i = -1;
			}
		}
		int arr2[] = {2, 3, 1, 4, 0, 28, 36, 24, 13};
		boolean condition = true;
		while(condition){
			condition = false;
			for(int j = 0; j < arr2.length - 1; j++){
				counter2++;
				if(arr2[j] > arr2[j+1]){
					int temp2 = arr2[j+1];
					arr2[j+1] = arr2[j];
					arr2[j] = temp2;
					condition = true;
				}
			}
		}
	for(int i = 0; i < arr1.length; i++){
			System.out.println(arr1[i]);
		}
	for(int j = 0; j < arr2.length; j++){
			System.out.println(arr2[j]);
		}

		System.out.println("bubbles: " + counter2);
		System.out.println("stupid:  " + counter1);
	}
}