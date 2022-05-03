import java.util.Scanner;

public class FibonacciSeries {
    //To get fibonacci series
    public void series(){
        int c=0;
        System.out.println("Enter the series limit below 50:"); //To avoid -ve numbers
        Scanner X=new Scanner(System.in);
        int x=X.nextInt();
        System.out.println("Enter 1st number of the series:");
        Scanner A=new Scanner(System.in);
        int a=A.nextInt();
        System.out.println("Enter 2nd number of the series:");
        Scanner B=new Scanner(System.in);
        int b=B.nextInt();
        for(int i=0;i<=x;i++)
        {
            System.out.print(a+","); //To print values
            c=a+b;
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
             FibonacciSeries f=new FibonacciSeries();
             f.series();
    }
}
