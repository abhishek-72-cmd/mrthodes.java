import java.util.Arrays;

public class newFunctions {

    static void swap (int a, int b  ){

        System.out.println( " Before Swapping val if a " + a + " val of b" + " "+  b);
        int temp = 0;
        temp = a ;
        a = b;
        b=temp;

        System.out.println( "val if a " + a + " val of b" + " "+  b);

    }

    static void changeIndex(int [] nums ){
        nums[0]=89;
    }

    public static void main(String[] args) {

        swap(10,20);

        int [] arr = {12,25,45,63,98};
      changeIndex(arr);
        System.out.println(Arrays.toString(arr));

    }
}
