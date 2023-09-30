public class palindromeString {
    static boolean checkPald(char arr[],int l,int r){
        if(l>=r)
        return true;

        if(arr[l]!=arr[r])
            return false;
        
            return checkPald(arr, l+1, r-1);

    }
public static void main(String[] args) {
    String str="madam";
    char[] arr=str.toCharArray();
System.out.println(checkPald(arr, 0, arr.length-1));
}    
}
