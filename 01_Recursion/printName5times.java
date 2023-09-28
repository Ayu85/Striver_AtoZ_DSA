public class printName5times{
    static void printName(int start,int times){
        if(start>times)
        return;
        System.out.println("Aayush"+" "+start);
        printName(start+1,times);
    }
    public static void main(String[] args) {
        printName(1,5);
    }
}