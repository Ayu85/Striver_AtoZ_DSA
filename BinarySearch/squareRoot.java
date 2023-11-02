public class squareRoot {
    static int getRoot(int n) {
        for (int i = 1; i <= n / 2; i++) {
            if (i * i == n)
                return i;
            else if (i * i > n)
                return i - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getRoot(121));
    }
}
