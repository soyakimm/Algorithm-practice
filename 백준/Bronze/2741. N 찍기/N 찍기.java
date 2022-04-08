import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ns[] = new int[N];
		if (N <= 100000) {
			for (int i = 1; i <= N; i++) {
				ns[i-1] = i;
				System.out.println(ns[i-1]);
			}
		}
		sc.close();
	}
}


