import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	    int sum = (num % 10) + (num / 10);
		System.out.println(sum);

	}
}