import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16,18};
        int start = 0;
        int end = arr.length-1;
        int mid = (end+start)/2;
        boolean isAsc;
        Scanner sc = new Scanner(System.in );
        int val = sc.nextInt();
        while (start<=end){
            isAsc=true;
            if (arr[mid]==val){
                System.out.println("element is found at position" + " " + mid);
                break;
            }else if (arr[mid]<val){
                start = mid+1;
            }else {
              end = mid-1;
            }

            mid = (start+end)/2;
        }
        if (start>end){
            isAsc=false;
            System.out.println("element not found next smallest element is");

        }
    }
}
