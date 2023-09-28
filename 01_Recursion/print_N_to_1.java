public class print_N_to_1{
   
    static void printNums(int n){
        if(n==0)
        return;
        System.out.println(n);
        printNums(n -1);
    }
    public static void main(String[] args) {
        printNums(10);
    }
}