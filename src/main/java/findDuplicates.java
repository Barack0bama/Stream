import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

public class findDuplicates {

	public static void main(String[] args) {

		// List condition ex: Find that are not 4 letters word

		List<String> words = Arrays.asList("Yellow", "Green", "Teal", "Red", "Yellow", "Red", "Blue", "Pink", "Gold",
				"Blue");
		// print out all words that contains 4 letters
		List<String> result = words.stream().filter(word -> word.length() != 4).collect(Collectors.toList());
		System.out.println(result);

		// Remove duplicates

		List<String> colors = Arrays.asList("Yellow", "Black", "Green", "Orange", "Purpple", "Red", "Red");
		List<String> sorting = colors.stream().distinct().collect(Collectors.toList());
		System.out.println(sorting);

		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(56);
		numbers.add(70);
		numbers.add(1);
		numbers.add(100);
		numbers.add(25);
		
		// Find Min and Max using stream
		System.out.println(numbers);
		int max = numbers.stream().mapToInt(number -> number).max().getAsInt();
		int min = numbers.stream().mapToInt(number -> number).min().getAsInt();

		// Find Sum
		int sum = numbers.stream().mapToInt(number -> number).sum();
		double avg = numbers.stream().mapToDouble(number -> number).average().getAsDouble();

		System.out.println("The max value is " + max + " And the min value is " + min + " And the total is " + sum + " "
				+ "and the avg of all the numebrs are " + avg);


	}

}