import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine()); //파싱처리
		br.close(); //버퍼닫기
		int A = 0; 
 
		for( int i = 1 ; i <= N ; i++ ) A+=i;
 
		System.out.println(A);
	}
}
 