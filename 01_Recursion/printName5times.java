public class printName5times{
    static int count=0;
    static void printName(String name,int times){
        if(count>times)
        return;
        System.out.println(name+" "+count);
        count++;
        printName(name,times);
    }
    public static void main(String[] args) {
        printName("Aayush",10);
    }
}