import java.util.Scanner;

public class presentation {
    public static void main(String[] args) {
    int finish=1;
        //마름모
        while (true) {

            System.out.println("입력값=마름모크기");
            System.out.println("숫자를 입력하세요");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println("입력값 : "+n);
            //n=n+1; //사용자입력값+1 =2 // 마름모모양 최소값==2

            if (n > 0) {
                n=n+1;
                //상단
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < i * 2 + 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                //하단
                for (int i = 1; i < n; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < 2 * n - (i * 2 )-1; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                System.out.println("1. 원으로 넘어가기    2.다른 크기 마름모보기");
                finish=sc.nextInt();
                if(finish==1){
                    break;
                }
                continue;
            } else {
                System.out.println("마름모 모양을 나타낼수 없습니다 다시입력하시오");              
                continue;

            }
        }
        //마름모 끝

        // j<Math.sqrt(n-i*i) 원의방적신
        //1. 좌표평면만들기 반지름입력받으면 2r제곱이 해당 좌표평면
        //원시작
        while(true){
            System.out.println("입력값=원의크기 ");
            System.out.println("숫자를 입력하세요");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println("입력값 : "+n);
            //n=n+1; //사용자입력값+1 =2 // 원모양 최소값==3, 최고값36
            n=n+2;
            int r=n;
            // 가로*세로, 정사각 ==2r제곱
            if(n>=3&&n<36){
                for(int i=-r;i<=r;i++){ // 좌표평면=2r제곱
                    for(int j=-r;j<=r;j++){ //좌표평면=2r제곱중 해당부분
                        if(i*i+j*j<=r*r){
                            System.out.print(" ■ ");
                        }
                        else{
                            System.out.print(" . ");
                        }
                    }
                    System.out.println("");
                }
            }else {
                System.out.println("원 모양을 나타낼수 없습니다 다시입력하시오");
                continue;
            }
            System.out.println("1.별모양 넘어가기     2. 다른 크기 원보기 ");
            finish=sc.nextInt();
            if(finish==1){
                break;
            }else{
                continue;
            }
        }
        //원끝

        //별.
        //3부분으로 나눈 포문

        while(true){
            System.out.println("입력값 = 별의 크기");
            System.out.println("숫자를 입력하세요");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println("입력값 : "+n);
            //n=n+1; //사용자입력값+4 =5 // 별모양 최소값==5
            n=n+4;
            if(n>4&&n<88){
                //상단
                for (int i = 0; 3*i < n; i++) {
                    for (int j = 0; j <= n - i - 1; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < i * 2 + 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                //중단
                /*--------------------------------------------------------------------------------------*/
                for (int i = 0; 3*i < n-1; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < 2 * n - (i * 2)-1; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                //하단
                /*--------------------------------------------------------------------------------------*/

                int count=1;//공백변수

                for (int i = 0; 3*i <= n; i++) { // for(int i=0;i<n;i++)
                    for(int j=0;j<n/3-i;j++){
                        System.out.print(" ");
                    }
                    for (int j = 0; j <= (n - i -1)-n/3-i; j++) {
                        System.out.print("*");
                    }
                    for(int j = 0; j <= 6*(count-1); j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j <= (n - i -1)-n/3-i; j++) {
                        System.out.print("*");
                    }
                    count=count+1;


                    System.out.println("");

                }
                System.out.println("1. 종료하기   2.다른 크기 별");
                finish=sc.nextInt();
                if(finish==1){
                    return;
                }else{

                }


                continue;

            }else{
                System.out.println("별모양을 그릴 수 없습니다. 다시입력하시오");
                continue;
            }
        }
    }
}
