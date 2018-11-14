public class MyClass {
    public static int fibonacciNum(int n){
        if (n == 0){
            return 0;
        }
        else if (n == 1 || n == 2){
            return 1;
        }
        else {
            return fibonacciNum(n-1) + fibonacciNum(n-2);
        }
    }
    public static void main(String args[]) {
        for (int i = 0; i <= 20; i++){
        System.out.print(fibonacciNum(i) + " ");
        }
    }
    
}
