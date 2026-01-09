import java.util.Scanner;
public class Function{
    // public static int printHelloWorld(){
    //     System.out.println("Hello World!");
    //     System.out.println("Hello World!");
    //     System.out.println("Hello World!");
    //     System.out.println("Hello World!");
    //     return 4;
    // }   
    //  public static void main(String[]args){
    //     printHelloWorld();
    // }
    

    // public static int SumoFTwoNumbers(int a, int b){
    //     int sum = a+b;
    //     return sum;
    // }
    // public static void main(String[]args){
    //      Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum = SumoFTwoNumbers(a, b);
    //     System.out.println("Sum of two no is :" + sum);
    // }

    // public static void PrintHello(){
    //      int a = 10;
    //      for(int i = 1; i<=8; i++){
    //         System.out.println("Hello World");
    //      }   
    // }
    // public static void main(String []args){
    //     PrintHello();
    // }

    //Check if a no is prime or not
    // public static boolean isPrime(int n){
    //     boolean isPrime = true;
    //     for(int i = 2; i<=n-1; i++){
    //         if(n % i == 0){
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }
    // public static void main(String[]args){
    //     System.out.println(isPrime(2));

    // }

    //parameter vs argument 
    // public static int Calculator(int a ,int b){ //parameter and formal parameter
    //     int sum = a+b;
    //     return sum;
    // }
    // public static void main(String[]args){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum = Calculator(a, b); //argument 
    //     System.out.println("Total sum is : " +sum);
        

    // }

    //Call by value 
    // public static void swap(int n, int m){
    //     int temp = n;
    //     n = m;
    //     m = temp; 
    //     System.out.println("n is = " +n);
    //     System.out.println("m is = " +m);
    // }
    // public static void main(String[]args){
    //     int n = 1000;
    //     int m = 100;
    //     swap(n,m);
    // }


    //Find product of a and b using function 
    // public static int Product(int a, int b){
    //     int product = a*b;
    //     return product;
    // }
    // public static void main(String[]args){
    //     int a = 5;
    //     int b = 5;
    //     int product = Product(a, b);
    //     System.out.println("Product of a and b : " +product);
    // }


    //Find the factorial of a number, n 
    // public static int factorial(int a){
    //     int n = 1;
    //     for(int i = 1; i<=a; i++){
    //         n = n*i;
    //     }
    //     return n;

    // }
    // public static void main(String[]args){
    //     System.out.println((factorial(12)));
    //     System.out.println((BinomialCoefficient(5, 2)));
    // }

    // //Binomial Coefficient
    // public static int BinomialCoefficient(int n, int r){
    //     int fact_n = factorial(n);
    //     int fact_r = factorial(r);
    //     int fact_nr = factorial(n-r);

    //     int BinomialCoefficient = fact_n/(fact_r*fact_nr);
    //     return BinomialCoefficient;
    // }

    //Overloading using Parameters
    // public static int multiply(int a, int b, int c){
    //     return a*b*c;
    // }
    // public static int multiply(int a, int b, int c, int d, int e){
    //     return a*b*c*d*e;
    // }
    // public static void main(String[]args){
    //     System.out.println( multiply(1, 2, 3));
    //     System.out.println( multiply(1, 2, 3, 4,7));
    // }

    //Overloading using DataTypes
    // public static int Sum(int a, int b){
    //     return a+b;
    // }
    // public static float Sum (float a, float b){
    //     return a+b;
    // }
    // public static void main(String[]args){
    //     System.out.println(Sum(1, 2));
    //     System.out.println(Sum(3.12f, 8.78f));

    // }  

    //Check if a no is prime or not
    // public static boolean isPrime(int n){
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i = 2; i<=Math.sqrt(n); i++){
    //         if(n % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // // public static void main(String[]args){
    // //     System.out.println(isPrime(96));
    // // }

    
    // //Print Prime No is range
    // public static void primesInRange(int n){
    //     for(int i = 2; i<=n; i++){
    //         if(isPrime(i)){
    //             System.out.print(i+  " ");
    //         }
    //     }
    //     System.out.println();
    // }
    // public static void main(String[]args){
    //     primesInRange(20);
    // }

    //Binary to Decimal Conversion
   
   
}



