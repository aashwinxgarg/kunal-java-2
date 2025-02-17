public class magicNumber {
    public static void main(String[] args) {
         int n=5;
         int pow=1;
         int ans=0;
         while(n>0) {
             int temp = n&1;
             n=n>>1;
             ans += (temp*(int)Math.pow(5,pow++));
         }
        System.out.println(ans);
    }
}
