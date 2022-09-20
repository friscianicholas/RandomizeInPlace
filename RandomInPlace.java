package randomInPlace401;
import java.lang.Math;
import java.util.Arrays;

public class RandomInPlace {
public static void main(String[] args) {
	int[] theArray = new int[10];
	for(int i = 0; i < 10; i++) {
		//initialization of array, numbered 1 through 10
		theArray[i] = i;
	}
	System.out.println("Initial Array: " + Arrays.toString(theArray));
	//randomize function
	randomize(theArray);
}
static void randomize(int[] theArray) {
	int max = 9;
	int store;
	//randomizing algorithm
	for(int i = 0; i < 10; i++) {
		int rand = i + (int)(Math.random() * ((max - i) + 1));
		System.out.println("Element location to swap with " + i + ": " + rand);
		store = theArray[rand];
		theArray[rand] = theArray[i];
		theArray[i] = store;
		System.out.println(Arrays.toString(theArray));
	}
	
}
}

