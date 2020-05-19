import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class matriz {

    public static void main(String[] args) {
        Solution solution_instance = new Solution();
        int[] A = {1, 2 ,3 ,4};
        int K = 3;
        solution_instance.solution(A, K);




            }
}
class Solution {
    public int[] solution(int[] A, int K) {
        int[] B = new int[A.length];

        for (int l = 0; K > l; K--) {
            int j = 0;
            for (int i = 0; i < A.length; i++) {
                if (i == 0) {
                    B[j] = A[A.length - 1];
                    j++;
                } else {
                    B[j] = A[i - 1];
                    j++;
                }
            }

            //below part
        /*for(int i= 0;i<A.length;i++){
            A[i]=B[i];
        }*/
            A = B.clone();

        }
        return B;
    }
}
/*
class Solution {
    public int[] solution(int[] A  , int K) {

        //List<int[]> list = Arrays.asList(A);



        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        Collections.rotate (list, K);

        System.out.println(list);



        return null;


    }

}*/

