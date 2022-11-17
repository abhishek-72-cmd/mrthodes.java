import java.util.Scanner;

public class
ArraySearch {
    public static void main(String[] args) {

        int arr[] = {45, 58, 2, 3, 6, 45, 9, 7,};

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                flag = true;
                System.out.println(" element present at this position is  " + " " + i);

            }
        }
        if (flag == false) {
            System.out.println("element not found");
        }


    }
}
