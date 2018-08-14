//Beginner Java Projects
//1. Hello World
//2. Capitalize the first letter of an input
//3. Pick the first even number in the array
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class HelloWorld {
	
	public static void main(String[] args){
		System.out.println("Hello World");
		//capitalize();
		System.out.println(returnFirstEven());
	}

	public static void capitalize(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = reader.next();
		String cap = word.substring(0,1).toUpperCase() + word.substring(1);

		System.out.println(cap);
		reader.close();
	}

	public static List<Integer>  returnFirstEven(){
		Scanner input = new Scanner(System.in).useDelimiter("\\s*\\s*");
		System.out.println("Enter an array of numbers");

		List<Integer> numbers = new ArrayList<Integer>();
		while (input.hasNextInt()){
			numbers.add(input.nextInt());	
		}
		System.out.println("You entered the following array" + numbers);
		input.close();
		return numbers;
	}
}






