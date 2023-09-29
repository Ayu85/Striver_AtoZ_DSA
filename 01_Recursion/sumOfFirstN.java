public class sumOfFirstN {
    static int sumAll(int n){
        if(n==0)
        return 0;
        else
        return n+sumAll(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumAll(3));
    }
}
