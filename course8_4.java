import java.util.Arrays;

public class course8_4 {
    public static void main(String[] args) {
        int[] temp = new int[8];
        int[] arr = new int[8];
        int[][] Employee = {
                {2,4,3,4,5,8,8},
                {7,3,4,3,3,4,4},
                {3,3,4,3,3,2,2},
                {9,3,4,7,3,4,1},
                {3,5,4,3,6,3,8},
                {3,4,4,6,3,4,4},
                {3,7,4,8,3,8,4},
                {6,3,5,9,2,7,9},
        };


        for (int i = 0 ; i < 8 ; i ++) {
            for (int k = 0 ; k < 7 ; k ++) {
                temp[i] += Employee[i][k];
                arr[i] += Employee[i][k];
            }
        }

        Arrays.sort(arr);

        for (int i = 7 ; i >= 0; i --) {
            for (int k = 0 ; k < 8 ; k ++) {
                if (arr[i] == temp [k])
                    System.out.println("Employee " + k + " work time is " + arr[i]);
            }
        }
    }
}
