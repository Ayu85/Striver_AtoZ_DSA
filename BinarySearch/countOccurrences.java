public class countOccurrences {
	static int firstOcc(int[] arr, int n, int x) {
		int ans = 0;
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == x) {
				ans = mid;
				high = mid - 1;
			} else if (arr[mid] > x)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return ans;
	}

	static int lastOcc(int[] arr,int n,int x){
		int ans=0;
		int low=0;
		int high=n-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(arr[mid]==x)
			{	ans=mid;
				low=mid+1;
			}
			else if(arr[mid]>x)
				high=mid-1;

			else
			low=mid+1;
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 6, 8, 8, 8, 9, 10 };
		int first = firstOcc(arr, arr.length, 9);
		int last = lastOcc(arr, arr.length, 9);
		System.out.println(last-first+1);
	}
}