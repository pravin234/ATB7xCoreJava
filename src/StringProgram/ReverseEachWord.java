package StringProgram;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str = "India is my country ";
		printEachWordReverse(str);

	}

	private static void printEachWordReverse(String str) {

		String[] arr = str.split(" ");
		String reverse = "";
		String reverseString = "";

		for (int i = 0; i < arr.length; i++) {
			int lengthOfEachWord = arr[i].length();

			for (int j = lengthOfEachWord - 1; j >= 0; j--) {
				reverse = String.valueOf(arr[i].charAt(j));
				System.out.print(reverse);
				reverseString += reverse;
			}

			System.out.print(" ");
		}

	}
}


//India is my country 
//aidnI si ym yrtnuoc 