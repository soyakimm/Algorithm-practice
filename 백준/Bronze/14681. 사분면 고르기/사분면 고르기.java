import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		float A=scan.nextInt();
		float B=scan.nextInt();
		
		if(A>0 & B>0) {
		
			System.out.println("1");
		}
		else if(A<0 & B>0) {
			System.out.println("2");
		}
		else if(A<0 & B<0) {
			System.out.println("3");
		}
		else if(A>0 & B<0) {
			System.out.println("4");
		}
	}
}