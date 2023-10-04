public class insertionSort{
    static int[] sort(int[] nums,int n){
    /*    for(int i=0;i<n-1;i++){
            int j=i;
            while(j>0 && nums[j-1]>nums[j])
            {
                int temp=nums[j-1];
                nums[j-1]=nums[j];
                nums[j]=temp;
                j--;
            }
        }*/
         for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
            while( nums[j]<nums[j-1])
            {
                int temp=nums[j-1];
                nums[j-1]=nums[j];
                nums[j]=temp;
              
            }
        }
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] arr={2,5,1,0,3,6,0,20,5};
        int[] res=sort(arr,arr.length);
        for(int x:res)
        System.out.print(x+" ");
    }
}