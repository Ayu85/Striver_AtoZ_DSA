public class nthRoot {
    static int getRoot(int n,int m){
        for(int i=1;i<=n;i++){
            if(Math.pow(i, n)==m)
            return n;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(getRoot(4,69));
    }
}
