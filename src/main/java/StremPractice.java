
public class StremPractice {

	public static void main(String[] args) {
		// Split string "Example United state of America" (45)
		// Using this we can give any condition
		String bucket1 = "United state of Americae";
		String bucket11 = "Bangladesh";
		String[] bucket2 = bucket1.split(" ");

//		for (int i = 0; i < bucket1.length(); i++) {
//
//			System.out.println(bucket2[i]);
//
//		}

		
		// reverse string
		String bucket3 = new StringBuffer(bucket1).reverse().toString();
		System.out.println("After reverse " + bucket3);

		
		
		// How to Find any letter example 'e' from String(42)
		int count = 0;
		for(int i = 0; i<bucket1.length();i++)
		{
			if (bucket1.charAt(i)=='e') {
				System.out.println("index of e at indext number "+i++);
				count++;
				
			}
		
		}
		
		// Basic for loop

		// Try catch (138)

		// Switch (46)

	}

}
