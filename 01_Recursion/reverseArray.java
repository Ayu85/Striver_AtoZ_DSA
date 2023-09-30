public class reverseArray {
    
    static void revArr(int l,int r,int [] arr){
        if(l>=r)
            return;
        
        else{        
        int temp= arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        revArr(l+1, r-1,arr);     
        }

    }
    public static void main(String[] args) {
        int[] arr={2,3,5,1,4,9};
        revArr(0, arr.length-1,arr);
        for(int x:arr)
        System.out.println(x);
    
    }
}
