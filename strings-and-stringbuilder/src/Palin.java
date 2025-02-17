public class Palin {
    public static void main(String[] args) {
        String str = null;
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str) {
        if(str==null) {
            return true;
        }
        str = str.toLowerCase();
        int start=0;
        int end = str.length()-1;
        while(start<end) {
            if(str.charAt(start)!=str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
