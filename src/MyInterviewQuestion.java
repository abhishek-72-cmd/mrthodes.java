public class MyInterviewQuestion {

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int x = 11;
        boolean isFound = false ;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                 isFound = true;
                System.out.println("ele found at " + i);
                break;
            }
        }
        if (isFound == false) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > x) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
