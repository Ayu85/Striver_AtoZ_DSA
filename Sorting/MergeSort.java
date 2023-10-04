 class MergeSort {
    static void merge(int[] arr,int low,int mid,int high){
        int[] temp=new int[high-low+1];
        int left=low;
        int right=mid+1;
        int j=0; 
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp[j]=arr[left];
                left++;
                 
            }
            else{
                temp[j]=arr[right];
                right++;
                
            }
            j++;
        }
        while(left<=mid){
            temp[j]=arr[left];
                left++;
                j++;
        }
        while(right<=high){
            temp[j]=arr[right];
                right++;
                j++;
        }
        int x=low;
        for(int z=0;z<temp.length;z++){
            arr[x]=temp[z];
            x++;
        }

    }

    static  void merge_sort(int[] arr,int low,int high){
        int mid=(low+high)/2;
        if(low>=high)
        return;
        else
        {merge_sort(arr, low, mid);
        merge_sort(arr, mid+1, high);
        merge(arr,low,mid,high);}
    }

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
     }
    
    public static void main(String[] args) {
        int[] arr={5,6,3,4,1,0};
        merge_sort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
