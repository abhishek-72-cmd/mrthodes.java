import java.util.Arrays;
public class alt_alt {
    static void swap (int []arr){
        int temp = arr[0];
        arr[0]=arr[1];
        arr[1]=temp;
        System.out.println(Arrays.toString(arr));
    }
    static void primeNum(int n){
        boolean isPrime = true;
        for (int i =2;i<n/2;i=i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
                if (n==1){
                    System.out.println("this is neither prime not composite");
                } else {
                    System.out.println("this is prime");
                }else {
                System.out.println("this is not prime ");
            }
        }
        static void prime (int n) {

           int count = 0;
           for (int i =1;i<=n;i++){
               if (n%i==0){
                   count++;
               }
           }
           if (count==2){
               System.out.println("this is prime number ");
           }else {
               System.out.println("this is not  prime number ");
           }
        }
        static void isPrime (int n){
        for (int i = 2;i<n;i++){
            if (n%i==0){
                System.out.println(i);
            }
        }
        }

        static int[] searchRange(int[] nums, int target){
        int ans [] = {-1,-1};
        int start = search(nums,target,true);
            int end = search(nums,target,false);
            ans [0]= start;
            ans [1]=end;
return  ans;
    }
    // the function to return the index value of the target
    static int search (int  [] nums , int target,boolean findStartIndex ){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while (start<end ){
            int mid= start + (end - start)/2;
            if (target == nums[mid]){
                return mid;
            }
            if (target>mid){
                start = mid+1;
            }else if (target<mid){
                end = mid-1;
            } else {
                ans= mid;

                if (findStartIndex){
                    end  = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
return ans;
    }



    public static void main(String[] args) {
       // int arr [] = {23,25,45,96};
           // swap(arr);
           // primeNum(10);
            //prime(13);
            //isPrime(11);

        int [] arr  = {10,11,12,13,14,15,15,18,52,63,87};
          int[] ans = searchRange(arr,15);

        System.out.println(ans);

        }
    }

