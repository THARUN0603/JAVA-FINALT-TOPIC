package Finaltopic;

public class ForeachDemo {

	public static void main(String[] args) {
		System.out.println("For Each for 1D Array:");
		int arr[]= {1,2,3,4,5,6,7,8,9};
		for(int num:arr) {
			System.out.println(num+"");
		}
		System.out.println();
		
		System.out.println("For Each for 2D Array:");
		int a[][]= {{1,2,3},{4,5,6},{7,8,9},{11,22,33},{44,55,66},{77,88,99}};
		for(int temp[]:a) {
			for(int value:temp) {
				System.out.println(value+"");
			}
			System.out.println();
		}

	}

}
