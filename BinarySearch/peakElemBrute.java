public class peakElemBrute{
    static int getElm(int[] arr,int n){
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            return arr[i];
        }
        return -1;
    }
public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7,8,5,1};
    int [] arr2={1,2,1,3,5,6,4};
    int[] arr3={1,2,3,4,5};
    int[] arr4={5,4,2,3,1};
    System.out.println(getElm(arr3,arr3.length));
}
}