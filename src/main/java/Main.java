import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer in Jan 2024
 */
public class Main {

    public static void main(String[] args){
        
        int number = getInputNumber();
        
        int sum = sumOfNumbers(number);
        System.out.println(sumOfNumbers(number));
        
        System.out.println(gaussianSumOfNumbers(number));

        long startTime, endTime, elapsedTime;
        int repetitiontions = 1000000;

        startTime = System.currentTimeMillis();
        for( int i = 0; i < repetitiontions; i ++){
            sumOfNumbers(number);
        }
        sumOfNumbers(number);
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("Method sumOfNumbers elapsed time: " + elapsedTime + " ms");

        startTime = System.currentTimeMillis();
        for( int i = 0; i < repetitiontions; i ++){
            gaussianSumOfNumbers(number);
        }
        gaussianSumOfNumbers(number);
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("Method guassianSumOfNumbers elapsed time: " + elapsedTime + " ms");

    }

    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    static int sumOfNumbers(int n) {
        int total = 0;
        for (int i = 0; i <= n; i++) {
            total += i;
        }
        return total;
    };
    
    
    static int getInputNumber() { // gee, may thi sis useful in another lab?
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }

    // for Extra Credit
    static int gaussianSumOfNumbers(int n) {
       int total =  (n*(n+1))/2;
        return total;
    }

}
