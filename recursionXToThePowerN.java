import java.util.Scanner;

public class recursionXToThePowerN {
    public static int powerFunction(int base, int power){
        if(power == 0 ){
            return 1;
        }
        return base * powerFunction(base, power-1);
    }
    public static int optimizedPowerFunction(int base , int power){
        if(power == 0){
            return 1;
        }
        int halfPower = optimizedPowerFunction(base, power/2) * optimizedPowerFunction(base, power/2);
        if(power%2 == 0){
            return halfPower;
        }return base * halfPower;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number whose Power you want to calculate: ");
            int baseNumber = sc.nextInt();
            System.out.print("How much Power you want to calculate: ");
            int powerNumber = sc.nextInt();
            int result = powerFunction(baseNumber, powerNumber);
            System.out.print(baseNumber + " to the power " + powerNumber + " is: " + result + "\n");
            int result1 = optimizedPowerFunction(baseNumber, powerNumber);
            System.out.print(baseNumber + " to the power " + powerNumber + " is: " + result1);
        }
    }
}
