public class print_1_to_N_linearly{
    static void printNums(int i,int n){
        if(i>n)
        return;
        System.out.println(i);
        i++;
        printNums(i,n);
    }
    public static void main(String[] args) {
        printNums( 1,10);
    }
}