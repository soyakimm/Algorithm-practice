import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int Hour = in.nextInt(); /*시간*/
		int Min = in.nextInt();  /*분*/
		
		in.close();
		
		if(Min < 45) {
			Hour--;   /* 시간이 1 감소*/
			Min = 60 - (45 - Min); /* 분 감소*/
			if(Hour < 0 ) {
				Hour = 23;
			}
			
			System.out.println(Hour + " " + Min);
			
		} else {
			System.out.println(Hour + " " + (Min - 45));
		}

	}

}
