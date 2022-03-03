public class fir_thirdStar {
    public static void main(String[] args){
        //별.
        //3부분으로 나눈 포문
        int n=10;
        //상단
        /*--------------------------------------------------------------------------------------*/
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


        }

}


/*




          *
         ***
        *****
       *******
 *******************
  *****************
   ***************
    *************
    **************
   *****      *****
 ***             ***
*                    *


     *
    ***
 *********
  *******
  ***-***
 *-------*   1+6

     *
    ***
   *****
***********
 *********
  ***-***
 *-------*
-----------






* */
