
public class Linear_Search{
    public static void main(String[] args) {
        int nums[]={1,34,54,32,8,6,73,21};
        int target=32;
        int ans = LinearSearch(nums, target);
        int ans2 = LinearSearch2(nums, target);
        System.out.println(ans);
        System.out.println(ans2);

    }

    // search the target and return the element on the element  
        
        static int LinearSearch2(int[] nums,int target){
                   if(nums.length ==0  ){
                    return -1;
                   }
         for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if(element == target){
                return element;
            }
         }
         return -1;
    }



    //------ return index
    static int LinearSearch(int[] nums,int target){
                   if(nums.length ==0  ){
                    return -1;
                   }
         for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if(element == target){
                return i;
            }
         }
         return -1;
    }
}