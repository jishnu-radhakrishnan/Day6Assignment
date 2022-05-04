import java.util.Scanner;

public class PrimeNumber {
    //To find whether the given number is prime or not
    public int prime()
    {
        int num;
        int eachnumbercheckup=1;
        System.out.println(" Enter Any Number: ");
        Scanner prime = new Scanner(System.in);
        num = prime.nextInt();                                              //To get number from user
        for (int i = 2; i <num; i++) {
            if (num % i == 0) {                                             //To check if any number divides the given number
                eachnumbercheckup=0;
                break;
            } else{
                eachnumbercheckup++;
            }
        }
        return eachnumbercheckup;
    }
    public static void main(String[] args) {
        PrimeNumber primeNumber=new PrimeNumber();
        int answer= primeNumber.prime();                                   //To check if the return value belongs to prime or not
        if(answer==0) {
            System.out.println("Given number is not a Prime Number");
        }else {
            System.out.println("Given number is a Prime Number");
        }
    }
}

