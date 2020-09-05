*/ DESCRIPTION
Complete the main method to accept two integers and display the sum of all the prime numbers between these two numbers.

Following requirements should be taken care in the program.



Input should be taken through Console
Program should print the output as described in the Example Section below
The two input numbers are considered inclusive while finding sum of prime numbers between these two numbers.
The minimum number allowed as input is 3 and maximum number allowed is 1000. If any number is accepted as input which is below 3 or larger than 1000 it should show error message as INVALID_INPUT
The first input value should be smaller than the second input value.Otherwise it should show error message as INVALID_INPUT
Example
Sample Input 1:
10 20
Expected Output:
60
Sample Input 2:
2 30
Expected Output:
INVALID_INPUT
Sample Input 3:
2 40
Expected Output:
INVALID_INPUT
Sample Input 4:
10 1020
Expected Output:
INVALID_INPUT
Sample Input 5:
10 1000

Expected Output:
76110
Sample Input 6:
20 10
Expected Output:
INVALID_INPUT    */

	import java.util.Scanner;
public class Source {
    public static boolean isPrime(int num) {
      for (int i = 2; i <= Math.round((float) num/2); i++) {
         if (num % i == 0) {
            return false;
         }
      }
      return true;
   }
    public static void main(String[] args) {
	
	// Student Code begins
	Scanner sc=new Scanner(System.in);
	int first=sc.nextInt();
	int sec=sc.nextInt();
	if(first<3){
	    System.out.println("INVALID_INPUT");
	   
	}
	else if(sec>1000){
	    System.out.println("INVALID_INPUT");
	}
	else if(first>sec){
	   System.out.println("INVALID_INPUT"); 
	}
	else{
	    
	     int sum = 0;
      for (int i = first; i <= sec; i++) {
         if (isPrime(i)) {
            sum += i;
         }
      }

      System.out.println(sum);
   
	    }
	}
    
}
