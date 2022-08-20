package ex1_a;

public class Demo {

	public static void main(String[] args) {
		
		//crate an integer array with 10 element
		
		int arr[]= {45,3,66,23,100,12,1,49,76,22};
		
		//call the bubblesort in the main function
		
		Sort sort = new Sort();
		
		sort.bubbleSort(arr); //call parameter arry before we implement the Sort class 
		
		System.out.println("Sorted array: ");
		for(int i=0; i<10; i++) {
			System.out.println(arr[i]+"");
		}

	}

}
