import java.util.Scanner;

public class for_first {
        public static void main(String[] args) {
        //배열
        //표현: int[] 변수명 ={대입값1,대입값2,대입값3}
        //배열의 길이는 고정
        //값의 접근은 변수명[인덱스] //인덱스는 0부터시작
        //변수명[3] 은 변수명배열의 네번째 항목을 의미

        //배열의 길이
        //변수명.length 조건문을 실행할때 배열의 길이가 넘어버리면
        //ArrayIndexOutOfBoundsException 오류가 발생한다

        //배열의 선언과 값대임
        //변수선언+초기화;  변수반복조건;    증감치
        //      초기치;  (반복)조건문;     증감치'
        //String[] numbers = {"one", "two", "three"}; //String 타입 배열 선언 + 변수 numbers에 "one", "two", "three" 대입
        //numbers[0]="one"
        //numbers[1]="two"
        //numbers[2]="three"

        //.length
        //          조건 : 변수i가 numbers의 길이가 넘지않게
        /*for(int i=0;    i< numbers.length;       ++i){*/
        /*--------------------------------------------------------------------------------------------------------*/
        //반복할 코드
        //System.out.println(numbers[i]);
        //변수명 numbers[인덱스] i=인덱스는 0부터 1씩증가
        //System.out.println(numbers[i]+"i값[인덱스]: "+i);
        //EX)))5명의 학생이 시험-> 60점 넘으면 합격, 불합격
            /*int [] marks = {33,59,60,61,70};
            for(int i=0; i<marks.length;++i){
                if(marks[i] >60){
                    System.out.println("합격");
                }else{
                    System.out.println("불합격");
                }
            }*/
        /*--------------------------------------------------------------------------------------------------------*/
        //for와 continue
        //위의 예제를 그대로 이용해서
        //60점 이상인 사람에게는 축하 메시지를 보내고
        // 나머지 사람에게는 아무런 메시지도 전하지 않는 프로그램을 만들어 보자.

       /* int[] marks = {33, 59, 60, 61, 70};
        for (int i = 0; i < marks.length; ++i) {
            if(marks[i]<=60){
                continue;
            }
            System.out.println(i+1+"번째학생의 합격을 축하합니다");
        }*/
        /*--------------------------------------------------------------------------------------------------------*/
        //이중 포문*** 첫번째 for문 행, 두번째 for문 렬
        //ex)구구단출력
        //System.out.print("\n");
        //System.out.println(""); 같은거
       /* for(int i =0;i<10;i++){ //
            for(int j =0;j<10;j++){ //
                System.out.print(i*j+""); // System.out.print 줄바꾸지 않고 출력 --> 열출력
            }
            System.out.println("");//  System.out.println 줄바꿔서 출력 --> 행
        }*/
        /*--------------------------------------------------------------------------------------------------------*/
          //연습
        while (true) {
        System.out.println("입력값=마름모크기");
        System.out.println("숫자를 입력하세요");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("입력값 : "+n);
        //n=n+1; //사용자입력값+1 =2 // 마름모모양 최소값==2
        n=n+1;
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < i * 2 + 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                for (int i = 1; i < n; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < 2 * n - (i * 2 )-1; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                continue;
            } else {
                System.out.println("마름모 모양을 나타낼수 없습니다 다시입력하시오");
                continue;
            }
        }
    }
}
