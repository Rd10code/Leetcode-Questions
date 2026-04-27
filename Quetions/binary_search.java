    public class binary_search {

        public static int Bsearch(int arr[],int target){
            int start = 0;
            int end = arr.length-1;
            int ans = arr.length;

            while(start<=end){
                int mid = (start+end)/2;
                if(arr[mid]>=target){            // Left side condition
                    ans = mid;
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
            return ans;
        }
        public static void main (String args[]) {
            int arr[]={1,2,3,4,5,66};
            int answer = Bsearch(arr, 6);
            System.out.print(answer);
    }

    }



    class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int ans = n;

        while(start<=end){
            int mid = (start+end)/2;

            if(nums[mid]>=target){
                ans = mid;
                end = mid-1;   //Find in left
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
}