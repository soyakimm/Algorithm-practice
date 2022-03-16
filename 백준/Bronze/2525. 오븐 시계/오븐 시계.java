import java.util.Scanner;

    class Main{
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt(); //시
        int min = sc.nextInt(); //분
        int addtime = sc.nextInt(); //더하는 시간
        int D;
        
        D = hour*60 + min + addtime; //Hour을 분으로 바꾸고 시간을 더함
        hour = D/60;
        min = D%60;
        
        if(hour>=24) {
            hour = hour - 24;    
        }
        
        System.out.println(hour + " " + min);
        
    }
}