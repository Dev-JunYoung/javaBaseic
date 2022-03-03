public class for_secondCircle {
    public static void main(String[] args){ //원

        // j<Math.sqrt(n-i*i) 원의방적신
        //1. 좌표평면만들기 반지름입력받으면 2r제곱이 해당 좌표평면
        int r=3;

        // 가로*세로, 정사각 ==2r제곱
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

    }
}
/*


 **
*  *
 **

  **
*    *
*    *
  **

    ***
 *       *
*         *
*         *
 *       *
    ***

* */

