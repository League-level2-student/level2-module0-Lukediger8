package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] cool = {"asian", "cool","not a nerd", "not Jay", "Not Kim" };
		//2. print the third element in the array
		System.out.println(cool[2]);
		//3. set the third element to a different value
		cool[2] = cool[3];
		//4. print the third element again
		System.out.println(cool[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		 for (int i = 0; i < 5; i++) {
			   System.out.println(cool[i]);
		 
		 }
		
		//6. make an array of 50 integers
		int[] cool1 = new int[50]; 
		//7. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		 for (int i = 0; i < 50; i++) {
			 int rand1 = rand.nextInt(51);
			 cool1[i]  = rand1;
		 }
		//8. without printing the entire array, print only the smallest number in the array
		int small = 100000000;
		for (int i = 0; i < 50; i++) {
			if(small>cool1[i]) {
				small = cool1[i];
			}
		}
		System.out.println(small);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < 50; i++) {
			System.out.print(cool1[i]+" ");
		}
		//10. print the largest number in the array.
		System.out.println();
		int large = 0;
		for(int i = 0; i<50; i++) {
			if(large<cool1[i]) {
				large = cool1[i];
				
			}
		}
			System.out.println(large);
			for (int i = 0; i < 50; i++) {
				System.out.print(cool1[i]+" ");
			}
		
		}
		
		
	}

