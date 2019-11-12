import java.util.Random;
import java.util.Scanner;

public class course12_3 {
    public static void main(String[] args) {
        CreateArray createArray = new CreateArray();
        int[] getArray = createArray.randomArray();
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Please enter array index : \n");
                int flag = in.nextInt();
                if (flag == -1)
                    break;
                int data = createArray.getData(flag, getArray);

                System.out.println(data);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println(ex);
//                int flag = in.nextInt();
//                int data = createArray.getData(flag, getArray);
//
//                System.out.println(data);
            }
        }
    }
}


class CreateArray {
    private int numbers = 100;

    public int[] randomArray() {
        int[] index = new int[100];
        for (int i = 0 ; i < 100 ; i ++ ) {
            Random r = new Random();
            index[i] = r.nextInt();
        }

        return index;
    }

    public int getData (int e , int[] getArray) throws ArrayIndexOutOfBoundsException {
        if (e >= 0 && e < 100) {
            int flag = e;
            int data = 0;
            for (int i = 0; i < 100; i++) {
                if (i == flag)
                    data = getArray[i];
            }
            return data;
        }
        else
            throw new ArrayIndexOutOfBoundsException("Array index out of bounds,please input array index again :");
    }
}

class ArrayIndexOutOfBoundsException extends Exception {
    ArrayIndexOutOfBoundsException() {
        super();
    }
    public ArrayIndexOutOfBoundsException(String message) {
        super(message);
    }

}

