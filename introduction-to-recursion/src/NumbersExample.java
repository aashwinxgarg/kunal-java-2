public class NumbersExample {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it.
        // print first five numbers : 1 2 3 4 5

        print(1);

    }
    static void print(int a) {
        if(a>5) {
            return;
        }
        System.out.println(a);
        print(a+1);
    }
}
