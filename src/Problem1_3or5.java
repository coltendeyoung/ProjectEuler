/** The question asks us to calculate the sum of all natural numbers BELOW
 * 1000 which are multiples of 3 or 5.
**/
public class Problem1_3or5 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i<1000; i++) {
			if (i%3 == 0 || i%5 == 0)
				sum+=i;
		}
		System.out.println(sum);
	}
}
