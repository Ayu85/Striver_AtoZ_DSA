public class print_N_to_1_backTracking {
    static void printNto1(int n){
        if(n==4)
        return;
        printNto1(n+1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printNto1(1);

    }
}
