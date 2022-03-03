import java.util.Arrays;
import java.util.Scanner;

public class randomMatrix {
    public static void main(String[] args){
        //시작
        while(true){
        System.out.println("엔터를 누르시면 시작합니다.");
        System.out.println("-------------------------------------------------------------------------------------------------");
        Scanner sc=new Scanner(System.in);
        sc.nextLine();
        System.out.println("가로, 세로 중복없는 n*n 행렬을만듭니다.");
        System.out.println("1번을 입력하면 종료합니다");
        System.out.print("숫자를 입력하세요 :     ");

        int n=sc.nextInt();
        if(n==1){
            return;
        }else{

        int[][] arr=new int[n][n];
        int realN=((int)(Math.random()*n+1));

        int count=0;
        int randomCount=0;
        //배열의 초기화
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                arr[i][j]=0;
            }
        }
                //가로열비교
                //시작
                //실제저장하는인덱스- 2차원배열
                for(int i=0;i<arr.length;i++){
                    for(int j=0;j<arr.length;j++){

                        //값비교 인덱스
                        for(int r=0;r<arr.length;r++){
                            for(int c=0;c<arr.length;c++){
                                //연산횟수 카운트
                                count=count+1;
                                //무한루프에 걸렸을때 메인으로 가기위한 카운트변수
                                randomCount=randomCount+1;
                                
                                //무한루프잡음
                                if(randomCount>10000){
                                    System.out.println();
                                    System.out.println("-------------------------------------------------------------------------------------------------");
                                    System.out.println("값을 넣을수 없습니다 ");
                                    //무한루프탈출 다시 메인감
                                    main(args);
                                  return;
                                }
                                //열비교
                                if(Arrays.asList(arr[i][c]).contains(realN)){
                                    realN=((int)(Math.random()*n+1));
                                    //중복방지 초기화
                                    r=0; //[0][j] 부터 다시검사
                                    c=0; //[i][0] 부터 다시검사
                                }
                                //행비교
                                if(Arrays.asList(arr[r][j]).contains(realN)){
                                    realN=((int)(Math.random()*n+1));
                                    //중복방지 초기화
                                    r=0;
                                    c=0;
                                }
                            } //c for 문끝
                        } // r,c for문 끝(값 비교)
                        //비교끝난후 값저장 - 출력 - 다시 난수발생
                        randomCount=0;
                        arr[i][j]=realN;
                        System.out.print("   "+arr[i][j]+"   ");
                        realN=((int)(Math.random()*n+1));

                    } // i,j for 문 끝 (값 저장)
                   System.out.println(); // 행 바꿈(i+1)
            }
                System.out.println("실행 횟수: "+count);
            if(arr.length>=n-1){
                continue;
            }

        }
    }
    }
}