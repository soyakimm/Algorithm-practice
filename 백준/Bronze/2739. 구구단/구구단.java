import java.util.*;

public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //첫줄에 N이 주어진다.
        
        for(int i = 1; i < 10; i++) { //N은 1봐 크거나 같고, 9보다 작거나 같다.
            System.out.println(N + " * " + i + " = " + N*i);
        }
    }
}