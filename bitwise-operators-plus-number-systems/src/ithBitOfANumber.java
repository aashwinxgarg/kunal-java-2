public class ithBitOfANumber {
    public static void main(String[] args) {
        int number = 6;
        int i = 1;
        System.out.println(ans(number,i));
    }
    static int ans(int n, int i) {
        return (n&(1<<i-1))>>(i-1);
    }
}
