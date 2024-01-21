
public class Binary_Search{
public static void main(String[] args) {
// Binary Seach majorly work in Sorted array
// Sorted
// Find the middle element
// Check if the target is greater than mid => Search in the right
// else Search in left
// if middle element == target element elemnt is found

    // if elment does not exist return -1;
    int [] arr ={2,4,6,8,11,12,14,20,36,48};
    int target = 36;
    int ans= binarySearch(arr, target);
    
    
      System.out.println(ans);

}

static int  binarySearch(int [] arr, int target){
    int start=0;
    int end= arr.length-1;
    while(start <= end){
        // int mid = ( start + end ) / 2;  // might be possible that ( start + end ) exceed the range of int in java
         int mid = start+ (end-start)/2; 
         if(target < arr[mid]){
            end = mid-1;
         }
         else if(target >arr[mid]){
                end= mid+1;
         }
         else{
            return mid;
            
         }
        
    }
    return -1;

}
}