public class recursionFactorial {
    public static int factorialNumber(int num){
        if (num == 0 ){
            return 1;
        }else{
            return num*factorialNumber(num-1);
        }
    }
    public static void main(String args[]){
        int num = 6;
        int result = factorialNumber(num);
        System.out.print("Factorial of the number is: " + result);
    }
}
