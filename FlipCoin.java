import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		int n, headscount = 0, tailscount = 0;
		double heads, tails;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of times you want to flip the coin: ");
		n = sc.nextInt();
		for (int j = 0; j < n; j++) {
			double random = Math.random();
			if (random < 0.5)
				tailscount++;
			else
				headscount++;
		}

		heads = headscount / (double) n * 100;
		tails = tailscount / (double) n * 100;
		System.out.println("Percentage of heads: " + heads + "%");
		System.out.println("Percentage of tails: " + tails + "%");

	}

}
