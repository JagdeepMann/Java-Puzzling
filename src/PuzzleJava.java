
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class PuzzleJava {

//	 Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)


	public void printSum(int[] arr) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("Sum of all numbers in the array = " +sum);

		for(int i = 0; i<arr.length; i++) {
			if (arr[i]>10) {
				array.add(arr[i]);
			}
		}
		System.out.println(array);
	}
	
//	Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.
	
	public void shuffleArray(String[] arr) {
		ArrayList<String> array = new ArrayList<String>();
		ArrayList<String> array2 = new ArrayList<String>();
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].length() > 5) {
				array.add(arr[i]);
			}
		}		
		System.out.println(array);
		
		for(int i = 0; i<arr.length; i++) {
			array2.add(arr[i]);
		}
		Collections.shuffle(array2);
		System.out.println(array2);
	}
	
//	Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and, after shuffling, display the last letter from the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message.
	
	public void shuffleArray2(String[] arr) {
		ArrayList<String> array = new ArrayList<String>();
		for(char i = 'a'; i <= 'z'; i++) {
			array.add(Character.toString(i));
		}
		Collections.shuffle(array);
		System.out.println(array);
		System.out.println("First letter is : " + array.get(0));
		System.out.println("Last letter is : " + array.get(25));

		if (" aeiou".indexOf(array.get(0))>0) {
			System.out.println("its a vowel");
		}
	
	}

//	Generate and return an array with 10 random numbers between 55-100.
	
	public void randomNums() {
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(55, 101);
			array.add(randomNum);
		}
		System.out.println(array);
	}

//	Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
	
	public void randomNums2() {
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(55, 101);
			array.add(randomNum);
		}
		System.out.println(array);
		Collections.sort(array);
		System.out.println(array);
		System.out.println("Minimum value is : " + array.get(0));
		System.out.println("Maximum value is : " + array.get(9));
		
	}
	
//	Create a random string that is 5 characters long.
	
	public void randomString() {
		Random random = new Random();
		StringBuilder rawString = new StringBuilder();
		String lettersNums = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		
		for (int i = 0; i < 5; i++) {
			rawString.append(lettersNums.charAt(random.nextInt(lettersNums.length())));
		}
		
		System.out.println(rawString.toString());
		
	}
	
	
//	 Generate an array with 10 random strings that are each 5 characters long
	
	public void randStringArray() {
		ArrayList<String> array = new ArrayList<String>();
		Random random = new Random();
		StringBuilder rawString = new StringBuilder();
		String lettersNums = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 5; i++) {
				rawString.append(lettersNums.charAt(random.nextInt(lettersNums.length())));
			}
			
			String arrayStrings = rawString.toString();
			array.add(arrayStrings);
			rawString.setLength(0);
		}
		System.out.println(array);
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
}
