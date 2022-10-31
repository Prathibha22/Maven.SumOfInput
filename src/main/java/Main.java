import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
       System.out.println("Please enter a number");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int result1=sumOfNumbers(number);
        int result2=gaussianSumOfNumbers(number);
        System.out.println("The sum of n numbers is "+ result1);
        System.out.println("The sum of n numbers using gaussian method is "+result2);
    }
    
    static int sumOfNumbers(int n) {
        int sum=0;
        for(int i=1;i<=n;i++)
            sum+=i;
        return sum;
    }
    
    // for Extra Credit
     static int gaussianSumOfNumbers(int n) {

        return (n*(n+1))/2;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    
}
