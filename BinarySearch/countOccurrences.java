public class countOccurrences{
    static int firstOccr(int[] arr,int n,int x)
    {
        int ans=0;
		int low=0;
		int high=n-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==x)
			{
				ans=mid;
				high=mid-1;
			}
			else if(arr[mid]>x)
					high=mid-1;
			else
				low=mid+1;
		}
		return ans;
    }
	static int 
	public static void main(String[] args) {
		
	}
}