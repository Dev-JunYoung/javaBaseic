import java.util.ArrayList;
import java.util.Arrays;

public class pratice {
    public static void main(String[] args){
      int n=4;
      int[][] arr=new int[n][n];
      int realN=((int)(Math.random()*n+1));
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;

        arr[1][0]=1;
        arr[1][1]=1;
        arr[1][2]=1;

        arr[2][0]=1;
        arr[2][1]=1;
        arr[2][2]=1;
        realN=1;

        for (int i=0; i<arr.length;i++) {
            System.out.print(Arrays.asList(arr[0][i]).contains(realN));
            System.out.println();
        }




    }
}
