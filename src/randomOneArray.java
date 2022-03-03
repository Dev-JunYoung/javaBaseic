import java.util.Arrays;

public class randomOneArray {
    public static void main(String[] args){
        int n=40;
        int[] arr=new int[n];
        int realN=((int)(Math.random()*n+1));
        //arr[0]=랜덤수
        //arr[1]의 arr[0] 확인
        //arr[2]의 arr[0]arr[1] 확인
        //arr[3]의 arr[0]arr[1]arr[2] 확인
        //arr[4]의 arr[0]arr[1]arr[2]arr[3] 확인

        //확인후 arr[n]값과 같다 --> 난수발생 '다시' 비교
        //   다르다     arr[n]=realN 저장 --> arr[n+1]값으로 넘어감



        while(true){

            arr[0]=realN;
            //arr[i] 실제 저장하는 인덱스
            for(int i=0;i<arr.length;i++){
                //값비교하는 인덱스
                for (int j=0;j<arr.length;j++){
                    //내부에arr[0]~arr[n-1] 확인 true--> 난수발생 다시 비교
                    if(Arrays.asList(arr[j]).contains(realN)){
                        realN=((int)(Math.random()*n+1));
                        //*************난수발생시킨 후 다시 다른 인덱스의 값과 비교해야함*********************
                        j=-1; //얘때문에 오래걸림 비교후 다른인덱스값들과 비교해주기위해 j값 초기화
                        if(j>0){
                            j=j-1;
                        }
                        //다시비교하기위에 변수값조정해줘야함
                    }
                    //내부에 arr[0]~arr[n-1] 같은 값이 없다. --> 더이상 비교할필요가없다.
                    //비교할 필요 X--> 배열길이의 끝값저장 --> j for문 끝내기
                    //비교할 필요는 없지만 여기서 인덱스조정을 해주어야 다른값들을 비교할수있음
                    else{ // arr[0]값하고만 비교해서 else면 이게실행하고있었음
                        //j=j+1;
                        //j=arr.length;
                    }
                    // j for문
                    //값비교가 끝났다-->
                }
                //i for문
                //실제 비교가 끝난 뒤 값저장
                arr[i]=realN;
                System.out.print(arr[i]+" ");
                realN=((int)(Math.random()*n+1));
            }
            if(arr.length>=n-1){
                break;
            }

        }
    }
}
